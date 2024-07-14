import java.util.Scanner;
public class Largest{
  public static void main(final String[] args){
    final Scanner in = new Scanner(System.in);
    System.out.println("Please enter 3 numbers: ");
    final int a = in.nextInt();
    final int b = in.nextInt();
    final int c = in.nextInt();

    int max = a;
    if(b > max){
      max = b;
    }
    if(c > max){
      max = c;
    }
      System.out.println(max);
 }
}