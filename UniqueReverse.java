import java.util.Scanner;

public class UniqueReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = sc.nextLine();

        char[] result = new char[input.length()];
        int k = 0;

        // Remove duplicates manually
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            boolean isDuplicate = false;

            // Check if already stored
            for (int j = 0; j < k; j++) {
                if (result[j] == current) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[k] = current;
                k++;
            }
        }

        // Print in reverse order
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
}