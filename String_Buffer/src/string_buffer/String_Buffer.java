
package string_buffer;

public class String_Buffer {

    public static void main(String[] args) {
        String str = "hello 1234567890 123456789";
        StringBuffer buffer = new StringBuffer();
        System.out.println("empty size:"+buffer.capacity());
        buffer.append(str);
        System.out.println("after append size : "+ buffer.capacity());
        buffer.append("67895645 356");
        System.out.println("final capacity : "+buffer.capacity());
        
        
    }
    
}
