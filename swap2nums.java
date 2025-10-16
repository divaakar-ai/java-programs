import java.util.Scanner;
public class swap2nums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int temp = a; a = b; b = temp;
        System.out.println("After swap: a=" + a + " b=" + b);
    }
}
