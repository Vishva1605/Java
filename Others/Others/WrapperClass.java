package Others.Others;
    public class WrapperClass {
        public static void main(String[] args) {
            //Sum of Two Numbers from String Input
            String num1 = "123";
            String num2 = "234";
            int num = Integer.parseInt(num1) + Integer.parseInt(num2);
            System.out.println(num);
            // Count Digit Characters in a String
            String str = "a1b2c3";
            int count = 0;
            for(int i=0;i<str.length();i++){
                if(Character.isDigit(str.charAt(i))) count++;
            }
            System.out.println("Number of digits in String : "+count);
            // Compare Two Wrapper Objects
            Integer a = Integer.valueOf(100);
            Integer b = Integer.valueOf(100);
            boolean result = a.equals(b);
            System.out.println(result);
            //converts a temperature in Celsius (as a String) to Fahrenheit 
            String celcius = "37";
            int cel = Integer.parseInt(celcius);
            double F = (cel*9.0/5.0) + 32;
            System.out.printf("%.1f'F",F);
        }
    }
