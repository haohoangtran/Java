import java.util.Scanner;

/**
 * Created by hao on 24/06/2016.
 */
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao (m) :");
        double chieuCao = sc.nextDouble();
        System.out.println("Nhập vào cân nặng (kg) :");
        int canNang = sc.nextInt();
        double BMI = (double) canNang / (chieuCao * chieuCao);
        if (BMI < 18.5)
            System.out.println("Bạn bị thiếu cân!");

        else if (BMI < 25) {
            System.out.println(" Bạn là người lý tưởng!");
        } else {
            if (BMI <= 30) {
                System.out.println("Bạn thừa cân!");
            } else {
                System.out.println("Bạn béo phì!");
            }
        }
    }
}

