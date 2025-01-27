package DSA.String;

public class ReverseStringUsingForLoop {
    public static void main(String[] args) {
        String t = "Kaustubh";
        String reversed="";
//        System.out.println(s.length());
        for (int i=t.length()-1;i>=0;i--){
            reversed = reversed + t.charAt(i);
        }
            System.out.print(reversed);
    }
}
