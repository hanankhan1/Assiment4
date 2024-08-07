public class Task6 {
    public int power(int bas,int expo){
        if (expo==0){
            return 1;
        }
        else{

                return bas*power(bas,expo-1);

        }
    }
}
