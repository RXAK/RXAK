public class Constructor {
    String name;
    int age;
    char sex;
    String citizenship;
//        a.Drink();
//        String p="AK203";


    public static void Drink(){
        System.out.println("Drinking");}
    public static void Running(){
        System.out.println("Running");
    }
    public static void Eating(){
        System.out.println("Eating");
    }

    public Constructor(String name,int age,char sex,String citizenship) {
        this.name="Aaaaaaaaaaao";
        this.age=3;
        this.sex='M';
        this.citizenship="Indian";
        System.out.println(this.name);
    }

    //    Constructor will be define by two types
//    constructor initialize the class
//    Null constructor and filled constructor
    public static void main(String[] args) {
        Constructor ak = new Constructor("ANish Rx47",40,'f',"Indians");
        ak.Running();

        System.out.println(ak.age);
        Constructor k = new Constructor( "ANish Rx",30,'M',"Indian");
//        k.age = 20;
//        k.name="Anish";
        System.out.println(k.name);





    }
}