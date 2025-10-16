import java.util.Scanner;
public class strcontainword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter word to find: ");
        String word = sc.nextLine();
        if(str.contains(word))
            System.out.println("Yes, the string contains the word.");
        else
            System.out.println("No, the string does not contain the word.");
    }
}
