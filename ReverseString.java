import java.util.Scanner;
public class ReverseString {

    public static String reverse(String str){
        String rev = "";
        for(int i=str.length()-1;i >= 0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(reverse(str));
    }
    
}