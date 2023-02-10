// // Instructions

// // In resistor-color duo you decoded the first two colors. For instance: orange-orange got the main value 33. The third color stands for how many zeros need to be added to the main value. The main value plus the zeros gives us a value in ohms. For the exercise it doesn't matter what ohms really are. For example:

// // orange-orange-black would be 33 and no zeros, which becomes 33 ohms.
// // orange-orange-red would be 33 and 2 zeros, which becomes 3300 ohms.
// // orange-orange-orange would be 33 and 3 zeros, which becomes 33000 ohms.
// // (If Math is your thing, you may want to think of the zeros as exponents of 10. If Math is not your thing, go with the zeros. It really is the same thing, just in plain English instead of Math lingo.)

// // This exercise is about translating the colors into a label:

// // "... ohms"

// // So an input of "orange", "orange", "black" should return:

// // "33 ohms"

// // When we get more than a thousand ohms, we say "kiloohms". That's similar to saying "kilometer" for 1000 meters, and "kilograms" for 1000 grams.

// // So an input of "orange", "orange", "orange" should return:

// // "33 kiloohms"



def colors = ["black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4, "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9]
def x = "orange, orange, brown".split(", ") //the colors

String resBands = "${colors[x[0]]}${colors[x[1]]}"

def resistors = resBands + '0'.multiply(colors[x[2]])

int resInt = resistors as Integer

if(resInt > 1_000) println "Resistance Values is: ${resInt/1000} kiloohms"

else println "Resistance Value is: $resBands ohms"