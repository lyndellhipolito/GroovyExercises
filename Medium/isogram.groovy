class Isogram {
    static boolean isIsogram(String phrase) {
        def letters = phrase.toLowerCase().replaceAll(/[^a-z]/, "").toCharArray()
        letters.size() == letters.toSet().size()
    }
}