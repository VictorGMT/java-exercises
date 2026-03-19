public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second)
    {
        if(first < 10 || first>99 || second < 10 || second>99)return false;

        int firstLeft = ((first / 10) %10), firstRight = first%10;
        int secondLeft = ((second /10) %10), secondRight = second%10;

        return(firstLeft == secondLeft || firstLeft == secondRight || firstRight == secondLeft || firstRight == secondRight);
    }
}
