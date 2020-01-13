package lk.hsenid.calculator;


public class Calculator {

    private String input;
    private int output;

    public Calculator() {

    }

    public int getOutput() {
        return this.output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public String getInput() {

        return this.input;
    }

    public void setInput(String input) {
        this.input = input;
    }


    public void add(int a, int b) {
        this.output = a + b;
    }

    public void subtract(int a, int b) {
        this.output = a - b;
    }

    public void multiply(int a, int b) {
        this.output = a * b;
    }

    public void divide(int a, int b) {
        this.output = a / b;
    }

    public void help() {
        System.out.println("Hello user!!!welcome to the calculator manuel");
        System.out.println("for numbers 12 and 13 following are the commands");
        System.out.println("addition>>>ADD 13 12");
        System.out.println("subtraction>>>SUB 13 12");
        System.out.println("division>>>DIV 13 12");
        System.out.println("multiplication>>>MUL 13 12");
    }


}





