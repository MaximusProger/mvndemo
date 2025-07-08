package evolenta;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.print("Введите a: \n");
        double a = in.nextDouble();
        System.out.print("Введите b: \n");
        double b = in.nextDouble();
        double f1 = new Divider().getResult(a,b);
        System.out.printf("Результат деления a и b: %f\n",f1);
        double f2  = new Multiplier().getResult(a,b);
        System.out.printf("Результат умножения a и b: %f\n",f2);



    }
}
