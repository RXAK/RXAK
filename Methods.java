import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        String mes="Hello Anish Kadare Focus on dreams";
        int ag= 21;
        char s='M';
        boolean z=true;

        Scanner ak=new Scanner(System.in);
        System.out.println("Plz enter the second number ");
        int r= ak.nextInt();
        System.out.println("Plz Enter second number to add ");
        int t= ak.nextInt();
       int x= Multiply( r,t);
       System.out.println("Multiplication  is "+x);
        newMethod(mes,ag,'M',z);

    }
    public static void newMethod(String messa,int age,char sex,boolean y){
        System.out.println("Hi! "+messa +" Your age is "+age +" Whats your gender "+sex+" Male "+y);
    }
    public static int  Multiply(int x,int y){
        int r=x*y;
        return r;
        
    }
}
