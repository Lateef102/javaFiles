package chibuzo;

public class Calculator {
    private int result;

    public static void main(String[] args) {

    }
    public void calculator(int firstNumber, int secondNumber, char operator){

        switch (operator){
            case '+' : performAddition(firstNumber, secondNumber);
            case '-' :performSubtraction(firstNumber, secondNumber);
            case '*' : performMultiplication(firstNumber, secondNumber);

        }
    }

    private void performSubtraction(int firstNumber, int secondNumber) {
    }

    private void performMultiplication(int firstNumber, int secondNumber) {

    }

    private void performAddition(int firstNumber, int secondNumber) {
    }


  }

