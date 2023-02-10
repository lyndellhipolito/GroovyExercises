/*
Instructions
Given a word, compute the Scrabble score for that word.

Letter Values
You'll need these:

Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
Examples
"cabbage" should be scored as worth 14 points:

3 points for C
1 point for A, twice
3 points for B, twice
2 points for G
1 point for E
And to total:

3 + 2*1 + 2*3 + 2 + 1
= 3 + 2 + 6 + 3
= 5 + 9
= 14
Extensions
You can play a double or a triple letter.
You can play a double or a triple word.
*/
int score = 0


print "Enter a word: "
def word = System.in.newReader().readLine().split('')

for( i in word){
    switch(i){
        case ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T']:
            score += 1
            break
        case ['D', 'G']:
            score += 2
            break
        case ['B', 'C', 'M', 'P']:
            score += 3
            break
        case ['F', 'H', 'V', 'W', 'Y']:
            score += 4
            break
        case ['K']:
            score += 5
            break
        case ['J', 'X']:
            score += 8
            break
        case ['Q', 'Z']:
            score += 10
            break
    }
}

println "Your score is: $score"