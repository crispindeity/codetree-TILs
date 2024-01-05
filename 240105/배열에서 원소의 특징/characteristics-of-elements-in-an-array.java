import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String value = scan.nextLine();

        String[] splitedValues = value.split(" ");

        for (int i = 1; i < splitedValues.length; i++) {
            if (Integer.valueOf(splitedValues[i]) % 3 == 0) {
                System.out.println(splitedValues[i - 1]);
                break;
            }
        }
    }
}