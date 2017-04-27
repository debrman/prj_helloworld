package pkg_helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        //----------------------
        System.out.print("<SOAP>");
        try {
            SingleRP_SOAP.main(args);
        } catch (Exception e) {
            System.out.print(e.toString());            
        }        
        System.out.println("</SOAP>");
        //----------------------
        byte a = test();
               
        System.out.println(a);                        
        SwingTest.main(args);
        DomExample.main(args);
        DomExample2.main(args);
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
   
