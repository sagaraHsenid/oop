package lk.hsenid.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator myCalc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String delimiter = " ";
        String[] splitCommand ;//= new String[3];

        loop:
        while (true) {
            System.out.println("CLICALC > ");
            myCalc.setInput(scanner.nextLine());
            splitCommand = myCalc.getInput().split(delimiter);

            String operand = splitCommand[0].toLowerCase();
            int num1 = Integer.parseInt(splitCommand[1]);
            int num2 = Integer.parseInt(splitCommand[2]);

            switch (operand) {

                case "add":
                    myCalc.add(num1, num2);
                    System.out.println(num1 + " ADD " + num2 + " = " + myCalc.getOutput());
                    break;
                case "sub":
                    myCalc.subtract(num1, num2);
                    System.out.println(num1 + " SUBTRACT " + num2 + " = " + myCalc.getOutput());
                    break;
                case "mul":
                    myCalc.multiply(num1, num2);
                    System.out.println(num1 + " MULTIPLY " + num2 + " = " + myCalc.getOutput());
                    break;
                case "div":
                    myCalc.divide(num1, num2);
                    System.out.println(num1 + " DEVISION " + num2 + " = " + myCalc.getOutput());
                    break;
                case "help":
                    myCalc.help();
                    break;
                case "quit":
                    System.out.println("exiting from the calculator App........");
                    break loop;

                default:
                    System.out.println("invalid operation...try help commnd to see the possible input commnds");
                    break;


            }


        }




        //System.out.println( "Hello World!" );
    }
}
