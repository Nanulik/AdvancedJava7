package StaticClassesEnumsExceptions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
//static integer
//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

    //enum elements class inside class - enum final constants

    private static final Logger Logger = LogManager.getLogger(Calculator.class);


    public enum Type{
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }



    //public static double calculate(int a, int b, int type){
    public static double calculate(double a, double b, Type type){

        Logger.info("Running method Calculate");
        double result = 0;

       //We can do it with if else
      //  if (type== MULTIPLICATION) {
        //    return a * b;
       // }
        //else if (type == SUMMARY);

        //or we can use "switch case"


    try {
        switch (type) {
            case MULTIPLICATION:
                result = a * b;
                break;
            case SUMMARY:
                result = a + b;
                break;
            case DIVISION:
                result = a / b;
                break;
            case SUBTRACTION:
                result = a - b;
                break;
            default:
                result = -1;

        }
    }
    catch (Exception err){
        System.out.println("Error in Calculator " + result);
    //    throw err;
    }
    //finally {
    //    System.out.println("Finally Block");
     //   result = -1;
    //}

        return result;
    }

}

