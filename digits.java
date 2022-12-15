public class Main {

  public static void main(String[] args) {

    int num;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    
    int count = 0;

    for (; num != 0; num /= 10; ++count) {
    }

    System.out.println(count);
  }
}
  
