import java.util.Scanner;

/**
 * Created by hao on 23/06/2016.
 */
public class B4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ F: ");
        double doF=sc.nextDouble();
        double doC=(doF-32)/1.8;
        System.out.println(doF + " độ F = "+doC + " độ C.");

    }
}
