// Instructions
// Translate RNA sequences into proteins.

// RNA can be broken into three nucleotide sequences called codons, and then translated to a polypeptide like so:

// RNA: "AUGUUUUCU" => translates to

// Codons: "AUG", "UUU", "UCU" => which become a polypeptide with the following sequence =>

// Protein: "Methionine", "Phenylalanine", "Serine"

// There are 64 codons which in turn correspond to 20 amino acids; however, all of the codon sequences and resulting amino acids are not important in this exercise. If it works for one codon, the program should work for all of them. However, feel free to expand the list in the test suite to include them all.

// There are also three terminating codons (also known as 'STOP' codons); if any of these codons are encountered (by the ribosome), all translation ends and the protein is terminated.

// All subsequent codons after are ignored, like this:

// RNA: "AUGUUUUCUUAAAUG" =>

// Codons: "AUG", "UUU", "UCU", "UAA", "AUG" =>

// Protein: "Methionine", "Phenylalanine", "Serine"

// Note the stop codon "UAA" terminates the translation and the final methionine is not translated into the protein sequence.

// Below are the codons and resulting Amino Acids needed for the exercise.

// Codon	Protein
// AUG	Methionine
// UUU, UUC	Phenylalanine
// UUA, UUG	Leucine
// UCU, UCC, UCA, UCG	Serine
// UAU, UAC	Tyrosine
// UGU, UGC	Cysteine
// UGG	Tryptophan
// UAA, UAG, UGA	STOP



def k = []
def result = []

print"Please enter RNA Sequence: "
String x = System.in.newReader().readLine()
k << x.split("(?<=\\G.{" + 3 + "})")

print"\nYour RNA Sequence is: $x\n"
print "Your Codons are: $k \n"
for(i in k) {

    if(i =~ "AUG") {
        String m = "Methione"
        result << m
        
    }
    if (i =~ "UUU" || i =~ "UUC") {
        String p = "Phenylalanine"
        result << p
        
    }
     if (i =~ "UUA" || i =~ "UUG") {
        String l = "Leuwcine"
        result << l
        
    }
     if (i =~ "UCU" || i =~ "UUC" || i =~ "UCA" || i =~ "UCG") {
        String s = "Serine"
        result << s
        
    }
     if (i =~ "UAU" || i =~ "UAC") {
        String t = "Tyrosine"
        result << t
        
    }
     if (i =~ "UGU" || i =~ "UGC") {
        String c = "Cysteine"
        result << c
        
    }
     if (i =~ "UGG") {
        String tr = "Tryptophan"
        result << tr
        
    }
     if (i =~ "UAA" || i =~ "UAG" || i =~ "UGA") {
        String st = "STOP"
        result << st
    }
    print "Your corresponding proteins are: $result\n"
    if(result.contains("STOP")) {break}
}