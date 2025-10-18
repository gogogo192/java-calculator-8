package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int add(String input){
            if (input == null || input.isEmpty()){
                return 0;
            }
            String delimiter=",|:";
            String numbersPart = input;

            if(input.startsWith("//")){
                int idx = input.indexOf("\\n");
                if (idx == -1) {
                    throw new IllegalArgumentException("커스텀 구분자 형식이 잘못되었습니다.");
                }
                String customDelimiter = String.valueOf(input.charAt(2));
                delimiter += "|" + java.util.regex.Pattern.quote(customDelimiter);
                numbersPart = input.substring(idx + 2);
            }

        String[] numStrings = numbersPart.split(delimiter);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numStrings.length; i++) {
            String s = numStrings[i].trim();
            if (s.isEmpty()) {
                throw new IllegalArgumentException("빈 문자열은 허용되지 않습니다.");
            }

            int n;
            try {
                n = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("잘못된 숫자 형식: " + s);
            }

            if (n < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다: " + n);
            }

            numbers.add(n);
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

}
