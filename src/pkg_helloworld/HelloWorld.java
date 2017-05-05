package pkg_helloworld;

public class HelloWorld {

    public static void main(String[] args) {
                  
        System.out.println("<1:IN_OUT>");
        byte a = test();               
        System.out.println(a);                        
        System.out.println("</1:IN_OUT>\n");
        
        System.out.println("<2:READ_XML>");
        DomExample.main(args);
        System.out.println("</2:READ_XML>\n");
        
        System.out.println("<3:WRITE_XML>");
        DomExample2.main(args);
        System.out.println("</3:WRITE_XML>\n");
        System.lineSeparator();
        
        System.out.println("<4:JDBC:MySQL>");
        int ss = JavaToMySQL.mmmain(args); // Запоминаем значение из БД             
        
        //JavaToMySQL.main(cou);
        System.out.println("<4:JDBC:MySQL>\n");
        
        System.out.println("<5:SwingTest>");         
        SwingTest.main(ss); // Передаём значение из БД в виде параметра для вывода на форму
        System.out.println("</5:SwingTest>\n");        
        
/*
        System.out.println("<6:SOAP>");
        try {
            SingleRP_SOAP.main(args);
        } catch (Exception e) {
            System.out.print(e.toString());            
        }        
        System.out.println("</6:SOAP>\n");
*/
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
   
