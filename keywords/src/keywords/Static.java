
package keywords;
class Data
{
    String name;
    static int x =10;
    void display(int a, int b)
    {
        name = "sakshi";
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("string name : "+name);
    }
    static void data()
    {
        System.out.println("this is static function");
        System.out.println("static x = "+Data.x);
    }
    static
    {
        System.out.println("this is static block...");
    }
            
}
public class Static {
    public static void main(String[] args) {
         Data d = new Data();
         d.display(10, 20);
         Data.data();
         
    }
}
