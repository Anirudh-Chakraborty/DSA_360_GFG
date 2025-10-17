import java.util.*;

public class FindGCD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Give 1st Num");
        int num1 = sc.nextInt();
        System.out.println("Give 2nd Num");
        int num2 = sc.nextInt();

        if (num1 == 0 && num2 == 0) {
            System.out.println("GCD is undefined for both numbers being zero.");
        } else if (num1 == num2) {
            System.out.println(num1 + " Is the GCD");
        } else if (num1 == 0) {
            System.out.println(num2 + " Is the GCD");
        } else if (num2 == 0) {
            System.out.println(num1 + " Is the GCD");
        } else if (num1 < num2 && num2 % num1 == 0) {
            System.out.println(num1 + " Is the GCD");
        } else if (num2 < num1 && num1 % num2 == 0) {
            System.out.println(num2 + " Is the GCD");
        } else {
            factoriser(num1, num2);
        }
    }

    static void factoriser(int a, int b) {
        List<Integer> factorsA = new ArrayList<Integer>();
        List<Integer> factorsB = new ArrayList<Integer>();
        List<Integer> commonFactors = new ArrayList<Integer>();
        int GCD = 1;

        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {
                factorsA.add(i);
                a /= i;
            }
        }

        for (int i = 2; i <= b; i++) {
            while (b % i == 0) {
                factorsB.add(i);
                b /= i;
            }
        }

        System.out.println("The Factors of 1st list");
        System.out.println(factorsA);

        System.out.println("The Factors of 2nd list");
        System.out.println(factorsB);

        if (factorsA.size() < factorsB.size()) {
            for (int i = 0; i < factorsA.size(); i++) {
                if (factorsB.contains(factorsA.get(i))) {
                    commonFactors.add(factorsA.get(i));
                    factorsB.remove(factorsA.get(i));
                }
            }
        } else {
            for (int i = 0; i < factorsB.size(); i++) {
                if (factorsA.contains(factorsB.get(i))) {
                    commonFactors.add(factorsB.get(i));
                    factorsA.remove(factorsB.get(i));

                }
            }
        }

        System.out.println("The Common Factors are ");
        System.out.println(commonFactors);

        for (int i = 0; i < commonFactors.size(); i++) {
            GCD *= commonFactors.get(i);
        }

        System.out.println("the GCD is " + GCD);
    }
}
