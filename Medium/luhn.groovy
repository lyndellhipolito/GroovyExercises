class Luhn {

    static boolean valid(String value) {
        if (value == "0") return false
        value = value.replace(" ", "")
        def list = []
        
        for(x in value){
            if(!x.isNumber()) return false
            list << Integer.parseInt(x)
        }

        if(list == [0]) return false

        list = list.reverse()
        
        for(int y = 0; y < list.size(); y++) {
            if(y % 2 != 0) {
                def result = list[y] * 2
                
                if(result > 9) {
                    list[y] = result - 9
                }
                else {
                    list[y] = result
                }
            
            }
        }

       list.sum() % 10 == 0 
    }
}
