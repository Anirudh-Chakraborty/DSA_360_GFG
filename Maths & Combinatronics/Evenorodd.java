import java.util.*;
public class Evenorodd {
    static Scanner sc = new Scanner(System.in);
    static Evenorodd caller = new Evenorodd();
    public static void main(String[] args) {
        int a = sc.nextInt();
        System.out.println(caller.Check(a));
    }

    public String Check(int a){

        if ((a & 1)==0) {
            return "Even";
        }
        else
        return "Odd";
    }
}
