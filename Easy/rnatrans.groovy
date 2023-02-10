// Instructions
// Given a DNA strand, return its RNA complement (per RNA transcription).

// Both DNA and RNA strands are a sequence of nucleotides.

// The four nucleotides found in DNA are adenine (A), cytosine (C), guanine (G) and thymine (T).

// The four nucleotides found in RNA are adenine (A), cytosine (C), guanine (G) and uracil (U).

// Given a DNA strand, its transcribed RNA strand is formed by replacing each nucleotide with its complement:

// G -> C
// C -> G
// T -> A
// A -> U

def word = []
print"Please enter DNA Strand: "
String x = System.in.newReader().readLine().toUpperCase()

print"Your DNA Strand is: $x\n"

for(i in x) {
    if(i =~ "G") {
        String g = "C"
        word << g
    }
    if(i =~ "C"){
        String c = "G"
        word << c
    }
    if(i =~ "T"){
        String t = "A"
        word << t
    }
    if(i =~ "A"){
        String a = "U"
        word << a
    }
}
print ("Your transcribed strand is: $word\n")