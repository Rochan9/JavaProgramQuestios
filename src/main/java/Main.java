import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please Enter temp in C: ");
    float tempC = in.nextFloat();
    float tempF = (tempC * 9 / 5) + 32;
    System.out.print(tempF);
  }
}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
