import java.util.Scanner;
public class Casecheck{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
   System.out.println("Enter a charecter: ");
    char ch = in.next().trim().charAt(0);
    if(ch >= 'a' && ch <= 'z'){
      System.out.println("Lowercase");
    }else{
      System.out.println("Uppercase");
    }
  }
}