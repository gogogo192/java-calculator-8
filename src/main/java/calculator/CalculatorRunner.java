package calculator;

import camp.nextstep.edu.missionutils.Console;

public class CalculatorRunner {
    private final Calculator calculator;

    public CalculatorRunner(){
        this.calculator = new Calculator();
    }

    public void run(){
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        int result = calculator.add(input);

        System.out.println("결과 : " + result);
    }
}