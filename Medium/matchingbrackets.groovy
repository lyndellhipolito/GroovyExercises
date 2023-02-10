class MatchingBrackets {

    static isPaired(value) {
        def pair = ['{': '}', '[': ']', '(': ')']
        def match = []
        def matches = value =~ /[{}()\[\]]/
        
        for(each in matches) {
            if(pair.containsKey(each)) {
                match.push(each)
            }
            else if (pair.containsValue(each)){   
                if(match && match.first() == pair.find{each == it.value}.key){
                    match.pop()
                }
                else{
                     match.push(each)
                }
            }
        }
        return match.isEmpty() ? true : false
    }
}