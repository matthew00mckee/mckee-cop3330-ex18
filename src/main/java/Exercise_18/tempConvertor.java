package Exercise_18;

import java.util.Scanner;

public class tempConvertor {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a temperature in either F or C: ");
        double temp = Input.nextInt();
        System.out.print("Enter C to convert to Celsius and F to convert to Fahrenheit: ");
        Input.nextLine();
        String ConvertTo = Input.nextLine();
        if(ConvertTo.compareTo("c") == 0 || ConvertTo.compareTo("C") == 0){
            double convertedTemp = (temp-32) * 5 /9;
            System.out.printf("The temperature in celsius is %.1f",convertedTemp);
        }
        else {
            System.out.printf("The temperature in fahrenheit is: %.1f", (temp * 9/5 + 32));
        }
    }
}
