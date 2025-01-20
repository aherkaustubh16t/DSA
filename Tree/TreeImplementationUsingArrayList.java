package DSA.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String value) {
        this.data = value;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public void printAllChildren() {
        System.out.print("Node: '" + data + "', children: ");
        for (TreeNode child : children) {
            System.out.print(" " + child.data + ", ");
        }
        System.out.println();

        // Recursive call for each child node
        for (TreeNode child : children) {
            child.printAllChildren();
        }
    }
}

public class TreeImplementationUsingArrayList {
    // Helper function to check if any ancestor of a node is locked
    static Map<String, String> lockStatus = new HashMap<>(); // Map to store lock status and user ID

    private static boolean isAnyAncestorLocked(TreeNode root, TreeNode target) {
        ArrayList<TreeNode> path = new ArrayList<>();
        findPathToNode(root, target, path);
        for (TreeNode ancestor : path) {
            if (lockStatus.containsKey(ancestor.data)) {
                return true; // An ancestor is locked
            }
        }
        return false;
    }
    // Recursive function to find the path from the root to the target node

    private static boolean findPathToNode(TreeNode root, TreeNode target, ArrayList<TreeNode> path) {
        if (root == null) return false;
        path.add(root);
        if (root == target) return true;

        for (TreeNode child : root.children) {
            if (findPathToNode(child, target, path)) {
                return true;
            }
        }
        path.remove(path.size() - 1);
        return false;
    }
    // Function to check if any descendant is locked

    private static boolean isAnyDescendantLocked(TreeNode node) {
        for (TreeNode child : node.children) {
            if (lockStatus.containsKey(child.data) || isAnyDescendantLocked(child)) {
                return true;
            }
        }
        return false;
    }
    // Lock function that checks both ancestors and descendants

    public static boolean lock(TreeNode root, TreeNode node, String uid) {
        // Check if any ancestor or descendant of the node is locked
        if (isAnyAncestorLocked(root, node) || isAnyDescendantLocked(node)) {
            return false;
        }
        // Lock the node with the provided uid
        lockStatus.put(node.data, uid);
        return true;
    }
    // Unlock function that checks if the node is locked and by the same user ID

    public static boolean unlock(TreeNode node, String uid) {
        // Check if the node is locked
        if (lockStatus.containsKey(node.data)) {
            // Check if the node is locked by the same user ID
            if (lockStatus.get(node.data).equals(uid)) {
                // Unlock the node by removing it from lockStatus
                lockStatus.remove(node.data);
                return true; // Unlock successful
            } else {
                return false; // Node is locked by a different user
            }
        }
        return false; // Node was not locked
    }
    // Upgrade function to lock a node and unlock all its locked descendants

    public static boolean upgrade(TreeNode root, TreeNode node, String uid) {
        // Check if the node is already locked or has any locked ancestors
        if (lockStatus.containsKey(node.data) || isAnyAncestorLocked(root, node)) {
            return false;
        }

        // Collect all locked descendants and check if they are all locked by the same user
        ArrayList<TreeNode> lockedDescendants = new ArrayList<>();
        if (!collectLockedDescendants(node, uid, lockedDescendants)) {
            return false;
        }

        // If there is at least one locked descendant, unlock them and lock the node
        if (!lockedDescendants.isEmpty()) {
            for (TreeNode descendant : lockedDescendants) {
                lockStatus.remove(descendant.data); // Unlock descendant
            }
            lockStatus.put(node.data, uid); // Lock the node with the provided uid
            return true;
        }

        return false; // No locked descendants found, or upgrade conditions not met
    }
    // Helper function to collect locked descendants and check if they are locked by the same user

    private static boolean collectLockedDescendants(TreeNode node, String uid, ArrayList<TreeNode> lockedDescendants) {
        for (TreeNode child : node.children) {
            if (lockStatus.containsKey(child.data)) {
                if (!lockStatus.get(child.data).equals(uid)) {
                    return false; // Found a descendant locked by a different user
                }
                lockedDescendants.add(child); // Collect locked descendant
            }
            // Recurse into children
            if (!collectLockedDescendants(child, uid, lockedDescendants)) {
                return false;
            }
        }
        return true;
    }
    // Dynamically builds the tree with given parameters

    public static TreeNode buildTree(int N, int M, String[] nodes) {
        if (N == 0 || nodes.length == 0) return null;

        // Root of the tree
        TreeNode root = new TreeNode(nodes[0]);

        // A queue for breadth-first insertion of nodes to maintain the M-ary structure
        ArrayList<TreeNode> currentLevel = new ArrayList<>();
        currentLevel.add(root);
        int nodeIndex = 1; // Start from the second node as the first is the root

        while (nodeIndex < N) {
            ArrayList<TreeNode> nextLevel = new ArrayList<>();
            for (TreeNode parent : currentLevel) {
                // Add up to M children to the current parent node
                for (int i = 0; i < M && nodeIndex < N; i++) {
                    TreeNode child = new TreeNode(nodes[nodeIndex++]);
                    parent.addChild(child);
                    nextLevel.add(child);
                }
            }
            // Move to the next level
            currentLevel = nextLevel;
        }

        return root;
    }

    // Function to process each query
    public static void processQueries(TreeNode root, String[][] queries) {
        for (String[] query : queries) {
            String operation = query[0];
            String nodeName = query[1];
            String uid = query[2];

            // Find the node by name
            TreeNode node = findNode(root, nodeName);

            if (node == null) {
                System.out.println("Node " + nodeName + " not found.");
                continue;
            }

            // Process the operation
            boolean result = false;
            switch (operation) {
                case "lock":
                    result = lock(root, node, uid);
                    System.out.println("Lock " + nodeName + " by " + uid + ": " + result);
                    break;
                case "unlock":
                    result = unlock(node, uid);
                    System.out.println("Unlock " + nodeName + " by " + uid + ": " + result);
                    break;
                case "upgrade":
                    result = upgrade(root, node, uid);
                    System.out.println("Upgrade " + nodeName + " by " + uid + ": " + result);
                    break;
                default:
                    System.out.println("Unknown operation: " + operation);
            }
        }
    }

    // Helper function to find a node by its name (data)
    private static TreeNode findNode(TreeNode root, String nodeName) {
        if (root == null) return null;
        if (root.data.equals(nodeName)) return root;

        for (TreeNode child : root.children) {
            TreeNode result = findNode(child, nodeName);
            if (result != null) return result;
        }
        return null;
    }

    public static void main(String[] args) {
        int N = 7; // Number of nodes
        int M = 2; // Max children per node
        String[] nodes = {"World", "Asia", "China", "India", "Africa", "SouthAfrica", "Egypt"};

        // Build the tree dynamically
        TreeNode root = buildTree(N, M, nodes);

        // Print the tree structure
        root.printAllChildren();

        // Define and process queries (Example)
        String[][] queries = {
                {"lock", "China", "user1"},
                {"lock", "India", "user1"},
                {"upgrade", "Asia", "user1"},
                {"unlock", "India", "user1"},
                {"unlock", "Asia", "user1"}
        };

        // Process each query
        processQueries(root, queries);
    }
}
