public class Task4 {
    public int handShakes(int n){
        if (n<=1)
        {return 0;}
        else {
        return (n-1)+handShakes(n-1);

        }

    }
}
