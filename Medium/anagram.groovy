class Anagram {
    def subject = ""
    
    Anagram(String Word){
        subject = Word
    }

    Map countingLetters(String word) {
        def count = [:]
        for(letter in word.toLowerCase()) {
            if(count.containsKey(letter)) {
                count[letter] += 1
            }
            else count[letter] = 1
        }
        return count
    }
    
    def find(candidates) {
        def subjectCount = countingLetters(subject)
        def candidateList = []
        
        for(word in candidates) {
              if(subjectCount == countingLetters(word) && (word.toLowerCase() != subject.toLowerCase())) {
                  candidateList << word
              }
        }
        return candidateList
    }
}