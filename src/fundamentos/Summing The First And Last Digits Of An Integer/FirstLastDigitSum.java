public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        if(number < 0)return -1;
        int firstNum = 0, lastNum = number%10;

        while(number>0)
        {
            firstNum = number % 10;
            number /= 10;
        }
        return firstNum + lastNum;
    }
}
