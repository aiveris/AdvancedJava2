import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {

        // FileWriter fw;
        // fw=new FileWriter("C:\\Users\\aiver\\Downloads\\FileRW.txt");//,true);//write more
        // fw.write("Hey! Whats Up... This is written with FileWriter!");
        // fw.close();
        // System.out.println("Writing is done....");


        FileReader fr = new FileReader("C:\\Users\\aiver\\Downloads\\FileRW.txt");
        int i;
        while((i=fr.read()) != -1){
            System.out.print((char)i);//use println to see each char
            }
        fr.close();






}
}
