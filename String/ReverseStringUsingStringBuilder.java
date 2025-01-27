package DSA.String;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String t = "Kaustubh";
        StringBuilder reversed = new StringBuilder(t);
        reversed.reverse();
        System.out.println(reversed);
    }
}
