package pkg_helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        
        System.out.println("<1:out+files>");
        byte a = test();               
        System.out.println(a);                        
        System.out.println("</1:out+files>");
        
        System.out.println("<2:read xml>");
        DomExample.main(args);
        System.out.println("</2:read xml>");
        
        System.out.println("<3:write xml>");
        DomExample2.main(args);
        System.out.println("</3:write xml>");
        
        System.out.println("<4:SwingTest>");        
        SwingTest.main(args);
        System.out.println("</4:SwingTest>");        
        //----------------------
        System.out.println("<5:SOAP>");
        try {
            SingleRP_SOAP.main(args);
        } catch (Exception e) {
            System.out.print(e.toString());            
        }        
        System.out.println("</5:SOAP>");
        //----------------------               
        return;
    }
    static byte test()
    {
        System.out.print("Миру-");
        System.out.println(test2());
        FileWorker.writer();
        FileWorker.reader(); 
        return 1;
        //111111111
        //66
        //77777
    }
    static byte test2()
    {
        System.out.print("Мир\r\n");
        test3();
        return 2;
    }    
static void test3()
    {
        System.out.println("Ура");
        return;
    }        

}
   
