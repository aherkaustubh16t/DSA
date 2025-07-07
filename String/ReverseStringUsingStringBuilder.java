package DSA.String;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String t = "Kaustubh";

        StringBuilder sb = new StringBuilder("");

        char [] chars= t.toCharArray();

        for(int i=chars.length-1;i>=0;i--){
            sb.append(chars[i]);
        }
        System.out.println(sb);

    }
}
