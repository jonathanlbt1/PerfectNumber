public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number <= 0){
            return false;
        }
        int mySum = 0;
        int i = 1;
        while (i < number){
            if (number % i == 0){
                mySum += i;
            }
            i++;
        }
        return (mySum == number);
    }
}
