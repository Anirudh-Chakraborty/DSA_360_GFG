import java.util.*;

public class FindGCD {
    static Scanner sc = new Scanner(System.in);
    static FindGCD caller = new FindGCD();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Give 1st Num");
        int num1 = sc.nextInt();
        System.out.println("Give 2nd Num");
        int num2 = sc.nextInt();

        if (num1 == 0 && num2 == 0) {
            System.out.println("GCD is undefined for both numbers being zero.");
        }
        else if (num1 == num2) {
            System.out.println(num1 + " Is the GCD");
        }
        else if(num1 == 0 ){
            System.out.println(num2 + " Is the GCD");
        }
        else if (num2 == 0) {
            System.out.println(num1 + " Is the GCD");
        }
        else if (num1 < num2 && num2 % num1 == 0) {
            System.out.println(num1 + " Is the GCD");
        }
        else if (num2 < num1 && num1 % num2 == 0) {
            System.out.println(num2 + " Is the GCD");
        }
        else {
        caller.factoriser(num1, num2);
        //System.out.println(result);
        }
    }


    void factoriser (int a, int b){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        int GCD = 1;

        for (int i = 2; i <= a; i++) {
            while (a % i ==0) {
                list1.add(i);
                a /= i;
            }
        }
       
    
        for (int i = 2; i <= b; i++) {
            while (b % i ==0) {
                list2.add(i);
                b /= i;
            }
        }
       
        System.out.println("The Factors of 1st list");
        System.out.println(list1);
        
        System.out.println("The Factors of 2nd list");
        System.out.println(list2);

        if(list1.size()<list2.size()) {
            for(int i = 0; i<list1.size(); i++){
                if (list2.contains(list1.get(i))) {
                    list3.add(list1.get(i));
                    list2.remove(list1.get(i));
                }
            }
        }
        else{
            for(int i = 0; i<list2.size(); i++){
                if (list1.contains(list2.get(i))) {
                    list3.add(list2.get(i));
                    list1.remove(list2.get(i));

                }
            }
        }

        System.out.println("The Common Factors are ");
        System.out.println(list3);

        for(int i = 0; i<list3.size();i++){
            GCD *= list3.get(i);
        }
        
        System.out.println("the GCD is " + GCD);
    }
}
