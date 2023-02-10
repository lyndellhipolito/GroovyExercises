class NucleotideCount {

    static count(strand) {
        def theStrands = ['A': 0, 'C': 0, 'G': 0, 'T': 0]

        for(x in strand) {
            if(theStrands.containsKey(x)) {
                theStrands[x] += 1
            }
            else throw new Exception()
        }
        print theStrands
        return theStrands
    }
}