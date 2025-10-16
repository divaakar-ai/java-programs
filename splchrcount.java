import java.util.Scanner;
public class splchrcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int special = 0;
        for(char c : str.toCharArray()) {
            if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
                special++;
        }
        System.out.println("Special characters count = " + special);
    }
}
