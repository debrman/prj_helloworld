package pkg_helloworld;
import java.io.*;
public class FileWorker { 
    public static void main(String[] args) {
    }
static void writer(){
        try(FileWriter writer = new FileWriter("c:\\work_git\\prj_helloworld\\files\\notes3.txt", false))
        {
           // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
   
static void reader(){
        try(FileReader reader = new FileReader("c:\\work_git\\prj_helloworld\\files\\notes3.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    }    
}
   