package week10;

public class WrapperClassExamples {
    public static void main(String[] args) {
        int i1 = 100;
        Integer i2 = i1;// primitive type turns into an object which means " Autoboxing"

        Long i3 = (long) i1; // we have to catsten.


        Integer n1 = 3000;
        int n2 = n1; // which is un-boxing  from object to primitive data Type


        String str = "123";
        System.out.println(str + 1);//1231
        int num = Integer.parseInt(str);//  withn parse we can turn into integer
        System.out.println(num + 1);//124

        String price = "$27.13";
        price = price.substring(1);
        double priceInDouble = Double.parseDouble(price);

        System.out.println("priceInDouble = " + priceInDouble);//priceInDouble = 27.13

//   Integer.parseInt(str) and Integer.valueOf(str);


        Integer num2 = Integer.valueOf(str);//123
        System.out.println(num2 + 1);//124


        char ch = '1';

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isSpecialChar = Character.isSpaceChar(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isSpecialChar = " + isSpecialChar);
        System.out.println("isLetter = " + isLetter);


        String strTwo = "a1b2c3";
        int sumOfDigits = 0;
        for (char each : strTwo.toCharArray()) {
            if (Character.isDigit(each)) {
                sumOfDigits += Integer.parseInt("" + each);//1+2+3

            }
        }
        System.out.println("sumOfDigits = " + sumOfDigits);//6


        String str3 = "kjbsd45%^^&()_+DbdfbDRR#@#$#$4";
        String letters = "";
        String upperCaseLetters = "";
        String lowerCaseLetters = "";
        String digits = "";
        String specialChars = "";

        for (char each : str3.toCharArray()) {  //char each=  primitive
            if (Character.isLetter(each)) {
                letters += each+" ";
                if (Character.isUpperCase(each)) {
                    upperCaseLetters += each+" ";
                } else {
                    lowerCaseLetters += each+" ";
                }
            } else if (Character.isDigit(each)) {
                digits += each+" ";
            } else {
                specialChars += each+" ";
            }
        }

        System.out.println("specialChars = " + specialChars);
       System.out.println("digits = " + digits);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("upperCaseLetters = " + upperCaseLetters);
        System.out.println("letters = " + letters);
    }
}
