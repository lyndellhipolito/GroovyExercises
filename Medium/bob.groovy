class Bob {
  static response() {
    String input
    def shortened = input.trim()
    if (!shortened)
      return 'Fine. Be that way!'
    if (input == input.toUpperCase() && input.getChars().any { Character.isLetter(it) })
      return shortened.endsWith('?') ? 'Calm down, I know what I\'m doing!' : 'Whoa, chill out!'
    if (shortened.endsWith('?'))
      return 'Sure.'
    'Whatever.'
  }
}

while(true){
  Bob b = new Bob()

  print"Talk or ask any questions to Bob: "
  def ask = System.in.newReader().readLine()

  println b.response(ask)
  println ""

  print"Do you want to ask again? [Y/N]: "
    t = System.in.newReader().readLine()
    if(t == "Y" || t == "y") {}
    else if(t == "N" || t == "n") { break }
    else {break}
    println""
}