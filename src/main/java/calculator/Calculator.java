package calculator;

public class Calculator {
    public int add(String input){
        String[] numbers = input.split(",|:");

        int sum = 0;
        for(int i =0; i< numbers.length; i++){
            sum += Integer.parseInt(numbers[i].trim());
        }
        return sum;
    }
}
