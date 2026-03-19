public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int original = number;
        while(number != 0)
        {
            reverse = reverse *10;
            reverse += number%10;
            number/=10;
        }
        return(original == reverse);

    }
}
