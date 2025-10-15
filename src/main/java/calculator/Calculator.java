package calculator;

public class Calculator {
    public int add(String input){
            if (input == null || input.isEmpty()) return 0;
            String determiner=",|:";
            if(input.startsWith("//")){
                determiner=String.valueOf(input.charAt(2));
                input=input.substring(4);
            }

        String[] numbers = input.split(",|:");
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            String s=numbers[i].trim();
            if(s.isEmpty()) throw new IllegalArgumentException("빈 문자열은 허용되지 않습니다.");
            int n=Integer.parseInt(s);
            if(n<0) throw new IllegalArgumentException("음수는 허용되지 않습니다: "+n);
            sum += n;
        }
        return sum;
    }

}
