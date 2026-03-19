public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third)
    {
        if(isValid(first) || isValid(second) || isValid(third))return false;

        int firstNum = first%10, secondNum = second%10, thirdNum = third%10;

        return(firstNum == secondNum || secondNum == thirdNum || thirdNum == firstNum);

    }

    public static boolean isValid(int num)
    {
        return (num < 10 || num > 1000);
    }
}
