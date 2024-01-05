import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a = Integer.valueOf(scan.next());
        Integer b = Integer.valueOf(scan.next());

        Map<Integer, Integer> maps = new HashMap<>();

        while(a > 1) {
            int remainder = a % b;
            maps.put(remainder, maps.getOrDefault(remainder, 0) + 1);
            a /= b;
        }

        int sum = 0;

        for (Integer i : maps.keySet()) {
            sum += Math.pow(maps.get(i), 2); 
        }

        System.out.println(sum);
    }
}