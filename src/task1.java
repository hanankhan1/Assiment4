class Task1 {
    public int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}



