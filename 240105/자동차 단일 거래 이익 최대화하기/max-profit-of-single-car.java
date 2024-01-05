import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        scan.nextLine();
        String value = scan.nextLine();

        String[] values = value.split(" ");

        List<Integer> prices = new ArrayList<>();

        int max = 0;

        for (String s : values) {
            prices.add(Integer.valueOf(s));
        }

        for (int i = 0; i < a-1; i++) {
            for (int j = i+1; j < a; j++) {
                int profit = prices.get(j) - prices.get(i);
                if (profit > max) {
                    max = profit;
                }
            }
        }
        System.out.println(max);
    }
}