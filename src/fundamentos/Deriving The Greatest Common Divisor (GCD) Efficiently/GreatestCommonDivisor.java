public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first < 10 || second < 10)return -1;
        int divisor = Math.max(first, second);
        while(divisor > 0)
        {
            if(first %divisor == 0 && second%divisor == 0)break;
            divisor--;
        }
        return divisor;
    }
}
