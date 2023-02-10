/*
Instructions
Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.

The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.

Hence the difference between the square of the sum of the first ten natural numbers and the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.

You are not expected to discover an efficient solution to this yourself from first principles; research is allowed, indeed, encouraged. Finding the best algorithm for the problem is a key skill in software engineering.

*/
def sqs = []
def sms = []
int squaresum = 0
int sumsquare = 0


for(i = 1; i <= 10; i++){
    sqs.add(i)
    sms.add(i**2)
}
squaresum = sqs.sum()**2
println "The square of the sum is: $squaresum"

sumsquare = sms.sum()
println "The sum of the square is: $sumsquare"


int total = squaresum-sumsquare
println"Difference is: $total"