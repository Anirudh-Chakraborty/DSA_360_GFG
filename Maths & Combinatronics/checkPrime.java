import java.util.*;

public class checkPrime {
    public static Scanner sc = new Scanner(System.in);
    public static checkPrime callPrime = new checkPrime();

    public static void main(String[] args) {
        System.out.println("Give me a Number to Check");
        int a = sc.nextInt();

        System.out.println(callPrime.primeChecker(a));
    }

    public List<Integer> primeChecker(int a) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 2; i <= a; i++) {
            boolean isPrime = true;
            
            int sqrt = (int) Math.sqrt(i);
            
            for (int j = 2; j <=sqrt; j++) {
                
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }
        return list;
    }
}