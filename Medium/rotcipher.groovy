class RotationalCipher {
    private int key
    
    RotationalCipher(int key) {
        this.key = key
    }

    String rotate(String cipherText) {
        def list = cipherText.toList()
        
        List smallText = 'abcdefghijklmnopqrstuvwxyz'.toList()
        List bigText = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.toList()

        println smallText
        println bigText
        
        for(int i = 0; i < list.size(); i++){
            if(smallText.contains(list[i])){
                def index = smallText.indexOf(list[i]) + this.key
                if(smallText.indexOf(list[i]) + this.key > 25){
                    index = smallText.indexOf(list[i])+this.key-26
                }
                list[i] = smallText[index]
            }//if
        
            else if (bigText.contains(list[i])){
                def index = bigText.indexOf(list[i]) + this.key
                if(bigText.indexOf(list[i]) + this.key > 25){
                    index = bigText.indexOf(list[i])+this.key-26
                }
                list[i] = bigText[index]
            }//else if
        }//for
    
        return list.join("")
        
    }//String rotate
}//class