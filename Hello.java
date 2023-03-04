public class Hello {
    String name;
    int age;
    String color;

  public Hello(String name,int age , String color){
      this.color="Blue";
      this.name="AK@)#)#";
      this.age=30;

  }

    public static void Running(){
        System.out.println("Run");
    }

    public static void   aak()
    {
        String name="AK47";
        int age=30;
        String color="White";
        System.out.println(color);
    }

    public String getName() {
        return name;
    }
    public String setName(String Kalashnivoka){
        this.name=Kalashnivoka;
        return Kalashnivoka;
    }
    public int getAge(){
        return age;
    }
    public String getColor()
    {
        return color;
    }
    public int setAge(int Age){
        this.age=Age;
        return Age;
    }
    public String setColor(String Color){
        this.color=Color;
        return Color;
    }




    public static void main(String[] args){


        aak();
//        Hello abbk=new Hello();
//        abbk.name="RXAK47";
//        System.out.println(abbk.name);
//        System.out.println(abbk.age);
//        Hello aaa= new Hello();
//        aaa.name="akdjk";

    }
}