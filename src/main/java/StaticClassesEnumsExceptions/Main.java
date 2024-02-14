package StaticClassesEnumsExceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {

        //double result = Calculator.calculate(4, 3, Calculator.MULTIPLICATION);
       // double result = Calculator.calculate(4, 3, 3);
        double result = Calculator.calculate(10, 2, Calculator.Type.DIVISION);
        Logger.info("result: " + result);


       try {
            result = Calculator.calculate(9, 3, null);
        }
        catch (Exception err){
            System.out.println("We encounter an error " + result);
            Logger.error("Something happen have no Idea what !", err);

        }
        System.out.println("result: " + result);


        result = Calculator.calculate(9, 3, Calculator.Type.SUMMARY);
        //System.out.println("result: " + result);
        Logger.info("result Logger" + result);

        result = Calculator.calculate(9, 3, Calculator.Type.MULTIPLICATION);
        System.out.println("result: " + result);
        Logger.info("result Logger " + result);
    }
}
