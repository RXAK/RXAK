import java.util.Scanner;
//In oerloading methods we can use a same method name if the information is sufficient then it will execute the
public class Overloading_metods {
    public static void  main(String[] args)
    {
        Scanner ak=new Scanner(System.in);
        System.out.println("Plz enter the first number ");
        double x= ak.nextDouble();
        System.out.println("Plz enter the second number");
        double y= ak.nextDouble();

        System.out.println("Plz enter the third n");
        double m= ak.nextDouble();
        double z=AK(x,y);
        System.out.println(z);
        double p=AK(x,y,m);
    }

    public static double AK(double  a,double b){
        double r=a*b;
        return r;
    }
    public static double AK(double a,double b,double c){
        double d=a*b*c;
        System.out.println(d);
        return d;
    }
}
