import java.util.Scanner;
public class largestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Largest = " + (a > b ? a : b));
    }
}
