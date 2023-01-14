import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename: ");
        System.out.println("1. input.txt");
        System.out.println("2. input.xml");
        System.out.println("3. input.json");
        int read = scanner.nextInt();
        String str = "";
        String[] sttr;
        Calculator calculator = new Calculator();
        StringConverter stringConverter = new StringConverter();
        double res;
        if(read == 1){
            TXTReader txtReader = new TXTReader();
            str = txtReader.TXTREADER("Final_task/src/input.txt");
        } else if (read == 2) {
            XMLReader xmlReader = new XMLReader();
            str = xmlReader.reader("Final_task/src/input.xml","String");
        } else if (read == 3) {
           /* JSONReader jsonReader = new JSONReader();
            str.JSONREADER("src/input.json",1);
            */
        } else {
            System.out.println("Error");
            System.exit(1);
        }
        sttr = stringConverter.StringConverter(str);
        res = calculator.CALCULATOR(sttr[0], sttr[1], sttr[2]);
        System.out.println("Enter filename:");
        System.out.println("1. output.txt");
        System.out.println("2. output.xml");
        System.out.println("3. output.json");
        int write = scanner.nextInt();
        if(write == 1){
            TXTWritter writter = new TXTWritter();
            writter.TXTWRITER(Double.toString(res),"output.txt");
        } else if (write == 2) {
            XMLWriter writer = new XMLWriter();
            writer.XMLWRITER("output.xml", "Resualt",Double.toString(res));
        } else if (write == 3) {
            /*JSONWriter reader = new JSONWriter();
            reader.JSONWRITER("output.json", 1, Double.toString(res));*/
        } else {
            System.out.println("Error");
            System.exit(1);
        }
        System.out.println("Select the type of archiving:");
        System.out.println("1.zip");
        System.out.println("2.rar");
        System.out.println("3.Not necessary");
        int archiving = scanner.nextInt();
        if(archiving == 1){
            ZIPArchiving zipArchiving = new ZIPArchiving();
            if(write == 1)
                zipArchiving.archiveFile("ouput.txt","output.zip");
            else if (write == 2)
                zipArchiving.archiveFile("output.xml","ouput.zip");
            else if (write == 3)
                zipArchiving.archiveFile("output.json", "output.zip");
        } else if (archiving == 2) {
            /*RARArchiving rarArchiving = new RARAchiving();
            if(write == 1)
                rarArchiving.archiveFileInRar("output.txt","output.rar");
            else if (write == 2)
                rarArchiving.archiveFileInRar("output.xml","output.rar");
            else if (write == 3)
                rarArchiving.archiveFileInRar("output.json","output.rar");*/
        }
    }
}
