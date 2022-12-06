import java.io.*;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double resualt = 0;
        System.out.println("Choose: ");
        System.out.println("1. xml");
        System.out.println("2. txt");
        System.out.println("3. json");
        int t = scanner.nextInt();
        if(t == 1){

        }else if (t == 2){
            File file = new File("Final_task/src/input.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while((line = reader.readLine()) != null) {
                String[] temp = line.split(" ");
                double first_number = Double.parseDouble(temp[0]);
                double second_number = Double.parseDouble(temp[2]);
                if(temp[1].equals("+"))
                    resualt = first_number + second_number;
                 else if (temp[1].equals("-"))
                     resualt = first_number - second_number;
                 else if (temp[1].equals("/"))
                     resualt = first_number / second_number;
                 else if (temp[1].equals("*"))
                     resualt = first_number * second_number;
                 else if (temp[1].equals("%"))
                     resualt = first_number % second_number;
                 else {
                 }
                 try(FileWriter writer = new FileWriter("output.txt", false))
                 {
                    String str = Double.toString(resualt);
                    writer.write(str);
                 }
                 catch(IOException ex){
                    System.out.println(ex.getMessage());
                 }

            }
        }else if (t == 3){

        }else{

        }
    }
}
