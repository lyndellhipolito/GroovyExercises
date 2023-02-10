class FlattenArray {
    static List flatten(List l) {
        def removeNull = l.flatten()
        removeNull -= null 
    }
}
