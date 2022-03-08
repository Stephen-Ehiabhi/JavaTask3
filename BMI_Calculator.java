import static  java.lang.Math.pow;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BMI_Calculator {
    static double BMI;
    public static void main (String [] args) throws IOException {
        System.out.println("This is a BMI calculator");

        //class to read data from user
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        //get height from user in cm
        System.out.print("Please type in your height (cm): ");
        float height = Float.parseFloat(r.readLine());

        //Get weight from user in kg
        System.out.print("Please type in your weight (kg): ");
        float weight = Float.parseFloat(r.readLine());

        //pass the data as parameters to the getBMI method
        double BMI_Result = getBMI(height,weight);

        if(BMI_Result <= 16.00) System.out.printf("Your BMI index is: %.2f", BMI_Result , "which means Starvation");

        //output
        System.out.printf("Your BMI index is: %.2f", BMI_Result);

    }

    //method to calculate BMI
    static double getBMI (float height, float weight){
        float heightInMeters = height / 100; //converting heights in cm to meters
        BMI = (double) weight/(pow(heightInMeters,2)); //formula to calculate BMI is kg/m^2
       return BMI;
    }
}
