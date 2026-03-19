public class LargestPrime {
    public static int getLargestPrime(int number)
    {
        if(number < 2)return -1;
        int num =(int)Math.sqrt(number), ret = 0;
        while(number%2 == 0)
        {
            ret = 2;
            number /=2;
        }

        for(int i = 3; i <= num; i+=2)
        {
            while(number%i == 0)
            {
                ret = i;
                number/=i;
            }
        }
        if(number > 2)ret = number;
        return ret;
    }
}