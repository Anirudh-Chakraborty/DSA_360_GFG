import java.util.*;

public class checkPrime {
    public static Scanner sc = new Scanner(System.in);
    public static checkPrime callPrime = new checkPrime();
    public static void main(String[] args) {
        System.out.println("Give me a Number to Check");
        int a = sc.nextInt();

    System.out.println(callPrime.primeChecker(a));}

    public String primeChecker(int a){
        if (a%2==0) {
            return "Even";
        }
        return "Odd";
    }
}