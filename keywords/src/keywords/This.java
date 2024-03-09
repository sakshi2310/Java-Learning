
package keywords;
class Data
{
    int a,b;
    void get(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void display()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
            
}
public class This {

    public static void main(String[] args) {
         Data d = new Data();
         d.get(10, 20);
         d.display();
    }
    
}
