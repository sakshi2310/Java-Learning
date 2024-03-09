/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keywords;
class First
{

    int x=100;
    void GetData()
    {
        System.out.println("this is get data function in first class");
        System.out.println("x = "+x);
    }
}
public class Super extends First{
    public static void main(String[] args) {
        First f = new First();
        f.GetData();
        Super f1 = new Super();
        f1.GetData();
    }

    @Override
    void GetData() {
         System.out.println("this is get data function in super  class");
         System.out.println("super x = "+super.x);
         int x = 500;
         System.out.println("x = "+x);
    }
    
    
    

    
}
