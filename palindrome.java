import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), temp = n, rev = 0;
        while(n != 0) { rev = rev*10 + n%10; n /= 10; }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}
