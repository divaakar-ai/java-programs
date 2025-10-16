import java.util.Scanner;
public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), temp = n, sum = 0, digits = 0;
        for(int i = n; i > 0; i /= 10) digits++;
        while(n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }
}
