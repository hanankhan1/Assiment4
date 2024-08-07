public class Task5 {
    public int GCD(int x, int y) {
        if (y == 0) {
            /* if y is equal to 0, then gcd (x, y) is x as the value of y gives the commn divisible
and if the y is not zeero then the x value will update in terms of y as its % wil takes its reaminder as th
last digt as the common divisible

            */
            return x;
        } else {
            return GCD(y, x % y);

        }
    }
}
