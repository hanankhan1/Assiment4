public class Task3 {
    public int coun_digit(int n, int digit) {
        if (n == 0) {
            return 0;
        }

        int num = n % 10;
//count i to use how many time that requried digit is come
        int count;
        //this is to chk that the lAST digit is equal to the digit that we want to find
        if (num == digit) {
            count = 1;
        } else {
            count = 0;
        }
        //in coun_...(n/10)it will less the digits that are matched or not matched
        return count + coun_digit(n / 10, digit);
    }
}
