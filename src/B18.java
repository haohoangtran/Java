import java.util.Scanner;

/**
 * Created by hao on 24/06/2016.
 */
public class B18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập năm: ");
        boolean boK;
        int nam=sc.nextInt();
        boolean b=false;
       while(nam%4 ==0 && nam%100!=0 || nam%400==0 )
       {
           System.out.println("True!");
           b=true;
           break;

       }
        while(!b) {

            System.out.println("False!");
            break;
        }
    }
}
