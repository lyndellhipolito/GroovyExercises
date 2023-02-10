class CollatzConjecture {
    //even numbers / 2
    //odd numbers * 3 + 1
    static int steps(int number) {
        int ctr = 0
        if(number <= 0) throw new ArithmeticException()
        while(number > 1) {
            ctr++
                
            if(number % 2 == 0) number /= 2
            else number = number * 3 + 1
                
        }
            return ctr
    }
}