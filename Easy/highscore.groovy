// Instructions
// Manage a game player's High Score list.

// Your task is to build a high-score component of the classic Frogger game, one of the highest 
// selling and most addictive games of all time, and a classic of the arcade era. Your task is to 
// write methods that return the highest score from the list, the last added score and the three highest scores.

def highscore = []
print"Enter how many scores to enter: "
int num = System.in.newReader().readLine() as Integer

for(x = 1; x <= num; x++){
    print"Enter score: "
    int add = System.in.newReader().readLine() as Integer
    highscore << add
}

int last = highscore.last()
int max = highscore.max()
def three = highscore.sort().reverse().take(3)
println"Highest Score: $max"
println"Last Added Score: $last"
println"Three Highes Score: $three"