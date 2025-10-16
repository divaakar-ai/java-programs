import java.util.Scanner;
public class upperlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int upper = 0, lower = 0;
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) upper++;
            else if(Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
    }
}
