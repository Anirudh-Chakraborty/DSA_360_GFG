import java.util.*;

public class FindGCD {
    static Scanner sc = new Scanner(System.in);
    static FindGCD caller = new FindGCD();

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Give 1st Num");
        int num1 = sc.nextInt();
        System.out.println("Give 2nd Num");
        int num2 = sc.nextInt();

        if (num1 < num2 && num2 % num1 == 0) {
            System.out.println(num1 + " Is the GCD");
        }
        else if (num2 < num1 && num1 % num2 == 0) {
            System.out.println(num2 + " Is the GCD");
        }
        else if (num1 == 5) {
            System.out.println(caller.primeChecker(num1));
            System.out.println(caller.primeChecker(num2));
        }
    }

    void GCDFinder(int num1, int num2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int squrtNum1 = (int) Math.sqrt(num1);

    }

    public List<Integer> primeChecker(int a) {
        List<Integer> list = new ArrayList<Integer>();

        // tels if it is prime
        boolean isPrime = true;

        // Sqrt of the number
        int sqrt = (int) Math.sqrt(a);

        for (int i = 2; i <= sqrt; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }

            if (isPrime) {
                list.add(i);
            }
        }
        return list;
    }

    void factoriser (int a){
        
    }
}
