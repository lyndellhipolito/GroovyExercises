class SecretHandshake {

    static List<String> commands(int number) {
        def result = []
        def handshake = [0b00001: "wink", 0b00010: "double blink", 0b00100: "close your eyes", 0b01000: "jump"]

        result = handshake.findAll {number & it.key}.collect {it.value}
        if(number & 0b10000) result = result.reverse()

        return result
                
    }
}
