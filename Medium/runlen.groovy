class runlength {
    def input = "AABCCCDEEEE"
    def encodeOutput = ''
    def decodeOutput = ''
    def last = ''
    def ctr = 0
    def number = ''

    def encode() {
        for(letter in input) {
            if(letter != last) {
                if(ctr == 1) encodeOutput += last
                else if (ctr != 0) encodeOutput += ctr + last
                last = letter
                ctr = 1
            }
            else ctr++
        }

        if(ctr == 1) encodeOutput += last
        else if (ctr != 0) encodeOutput += ctr + last
    }


    def decode() {
        for(letter in input){
            if((letter as char).isDigit()) number += letter
            else {
                if(number.isBlank()) decodeOutput += letter
                else decodeOutput += letter * (number as int) 
                number = ''
            }
        }
        return decodeOutput
    }
}

runlength r = new runlength()
println r.encode()
println r.decode()