public class PerfectNumber {
    public static boolean isPerfectNumber(int number)
    {
        if(number<1)return false;
        int sum =0, i = 1;

        while(i <= number)
        {
            if(sum == number)return true;
            if(number%i == 0)sum+=i;
            i++;
        }
        return false;

    }
}