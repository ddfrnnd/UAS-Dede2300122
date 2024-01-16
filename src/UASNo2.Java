import java.util.ArrayList;
import java.util.Arrays;

public class UASNo2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Honda", "Toyota", "Mercedes-Benz", "Audi"));
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        Boolean[] condition = getNamelnPrima(list, primes);

        for (int i = 0; i < condition.length; i++) {
            System.out.println(condition[i]);
        }
    }

    public static Boolean[] getNamelnPrima(ArrayList<String> list, int[] primes) {
        Boolean[] condition = new Boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {
            int charCount = 0;
            for (char c : list.get(i).toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount++;
                }
            }

            boolean isPrima = false;
            for (int j = 0; j < primes.length; j++) {
                if (charCount == primes[j]) {
                    isPrima = true;
                    break;
                }
            }

            condition[i] = isPrima;
        }

        return condition;
    }
}
