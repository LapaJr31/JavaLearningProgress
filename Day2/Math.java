import java.util.Scanner;
import static java.lang.Math.*;

public class Math {

    public static void main(String[] args){

        double z;
        double y;
        double x;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = sqrt((x*x)+(y*y));

        System.out.println("The hypothenuse is: " +z+ "cm long");

        scanner.close();

//        double x = 3.14;
//        double y = -10;
//
//        double z = min(x, y);
//        double b = max(x, y);
//        double n = abs(x);
//        double d = sqrt(40);
//        double p = round(x);
//        double o = floor(3.9);
//
//        System.out.println(z);
//        System.out.println(b);
//        System.out.println(n);
//        System.out.println(d);
//        System.out.println(p);
//        System.out.println(o);



    }
}
