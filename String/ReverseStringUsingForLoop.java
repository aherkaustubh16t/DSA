package DSA.String;

public class ReverseStringUsingForLoop {
    public static void main(String[] args) {
        String t = "Kaustubh";
//        System.out.println(s.length());
        for (int i=t.length()-1;i>=0;i--){
            System.out.print(t.charAt(i));
        }
    }
}
