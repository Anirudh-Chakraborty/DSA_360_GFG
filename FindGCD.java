import java.util.*;

public class FindGCD {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Give 1st Num");
        int num1 = sc.nextInt();
        System.out.println("Give 2nd Num");
        int num2 = sc.nextInt();

        if (num1 < num2 && num1 / num2 == 0 ) {
            System.out.println(num1 + " Is the GCD");
        }
        else if (num2 < num1 && num2 / num1 == 0) {
            System.out.println(num2 + " Is the GCD");
        }

    }

    void GCDFinder(int num1, int num2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        int squrtNum1 =(int) Math.sqrt(num1);

    }
}