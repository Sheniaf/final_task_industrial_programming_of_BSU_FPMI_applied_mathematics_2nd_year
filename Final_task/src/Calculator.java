public class Calculator {
    public double CALCULATOR(String line0, String line1, String line2){
        double resualt = 0;
        if(line1.equals("+"))
            resualt = Double.parseDouble(line0) + Double.parseDouble(line2);
        else if (line1.equals("-"))
            resualt = Double.parseDouble(line0) - Double.parseDouble(line2);
        else if (line1.equals("*"))
            resualt = Double.parseDouble(line0) * Double.parseDouble(line2);
        else if (line1.equals("/"))
            resualt = Double.parseDouble(line0) / Double.parseDouble(line2);
        else if (line1.equals("%"))
            resualt = Double.parseDouble(line0) % Double.parseDouble(line2);
        else
            System.out.println("Check the correctness of the entered data!!!!!");
        return resualt;
    }

}
