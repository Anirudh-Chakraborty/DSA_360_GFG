import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloorAndCeilOfIntegerDivision {
    static Scanner sc = new Scanner(System.in);
    static FloorAndCeilOfIntegerDivision caller = new FloorAndCeilOfIntegerDivision();

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(caller.number(a, b));

    }

    List number(int a, int b) {
        ArrayList<Double> list = new ArrayList<>();

        double answer = (double) a / b;

        double floor = Math.floor(answer);
        double ceil = Math.ceil(answer);

        list.add(floor);
        list.add(ceil);

        return list;
    }

}
