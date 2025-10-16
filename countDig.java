import java.util.Scanner;
public class countDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), count = 0;
        if(n == 0) count = 1;
        while(n != 0) { count++; n /= 10; }
        System.out.println("Digits = " + count);
    }
}
