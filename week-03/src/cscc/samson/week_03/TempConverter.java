package cscc.samson.week_03;

/**
 * Created by OWNER on 2/7/2016.
 */
import java.util.Scanner;
public class TempConverter {

    static double getUserFahrenheit(){
        java.util.Scanner scanner= new java.util.Scanner(System.in);
        System.out.println("Enter a Fahrenheit temprature.");
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }

    static double fToC(double fTemp){
        return 5.0/9 * (fTemp - 32);

    }

    static void display (double cTemp){
        System.out.println("The Celsius Temp is " + cTemp );

    }
    public static void main(String[] args) {
        double fTemp = getUserFahrenheit();
        while(fTemp >= -460){

            double cTemp = fToC(fTemp);
            display(cTemp);
            fTemp = getUserFahrenheit();

        }




    }
}




