class OneToN_Sum {
    public static int calc(int num) {
        int sum_val = 0;
        for(int i=1 ; i<=num ; i++) {
            sum_val += i;
        }
        return sum_val;
    }
}
