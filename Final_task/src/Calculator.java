public class Calculator {
    public double CALCULATOR(String[] line){
        double resualt = 0;
        if(line[1].equals("+"))
            resualt = Double.parseDouble(line[0]) + Double.parseDouble(line[2]);
        else if (line[1].equals("-"))
            resualt = Double.parseDouble(line[0]) - Double.parseDouble(line[2]);
        else if (line[1].equals("*"))
            resualt = Double.parseDouble(line[0]) * Double.parseDouble(line[2]);
        else if (line[1].equals("/"))
            resualt = Double.parseDouble(line[0]) / Double.parseDouble(line[2]);
        else if (line[1].equals("%"))
            resualt = Double.parseDouble(line[0]) % Double.parseDouble(line[2]);
        else
            System.out.println("Check the correctness of the entered data!!!!!");
        return resualt;
    }

}
