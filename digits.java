import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number: ");
    num=sc.nextInt();
    
    int count = 0; 

    while (num != 0) {
      num /= 10;
      ++count;
    }

    System.out.println(count);
  }
}
