class NthPrime {
    static nth(int n) {
        if(n < 1) throw new ArithmeticException()
        
        def prime = [2]
        int number = 3
        
        while(prime.size() < n) {
            boolean checkPrime = true
            println prime
            for(p in prime) {
                if(number % p == 0 ) {
                    checkPrime = false
                    break
                }
                else if (p > number) break
            }

            if(checkPrime) prime << number

            number += 2
        }

        
        return prime[-1]
    }
}

def n = new NthPrime()

println n.nth(6)
