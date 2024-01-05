import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        scan.nextLine();
        String value = scan.nextLine();
        
        String[] splitedValues = value.split(" ");
        
        List<Integer> numbers = new ArrayList<>();

        for (String s : splitedValues) {
            Integer i = Integer.valueOf(s);
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }

        Collections.reverse(numbers);

        StringBuilder stringBilder = new StringBuilder();
        numbers.forEach(i -> stringBilder.append(i).append(" "));
        System.out.println(stringBilder.toString());
    }
}