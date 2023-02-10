// Instructions
// Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan gramma, "every letter") is a sentence using every letter of the alphabet at least once. The best known English pangram is:

// The quick brown fox jumps over the lazy dog.

// The alphabet used consists of letters a to z, inclusive, and is case insensitive.+


snt = "The quick brown fox jumps over the lazy dog.".toLowerCase().replaceAll("[^a-z]", "").split("")
alp = 'a'..'z' as ArrayList

def check = []

for(i in alp) {
    if(i in snt) check << "true"
    else check << "false"
}

if(check.contains("false")) println"This is not a Pangram"
else println"This is Pangram"