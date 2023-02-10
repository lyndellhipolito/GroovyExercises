/*
Instructions
If you want to build something using a Raspberry Pi, you'll probably use resistors. For this exercise, you need to know two things about them:

Each resistor has a resistance value.
Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read.
To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values. Each band has a position and a numeric value.

The first 2 bands of a resistor have a simple encoding scheme: each color maps to a single number.

In this exercise you are going to create a helpful program so that you don't have to remember the values of the bands.

These colors are encoded as follows:

Black: 0
Brown: 1
Red: 2
Orange: 3
Yellow: 4
Green: 5
Blue: 6
Violet: 7
Grey: 8
White: 9
The goal of this exercise is to create a way:

to look up the numerical value associated with a particular color band
to list the different band colors
*/
while(true) {
    print"Pick the color of your resistor band (black, brown, red, orange, yellow, green, blue, violet, grey, white): "
    def x = System.in.newReader().readLine().toLowerCase()


    def R = ["black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4, "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9]
    print"Resistance Value is: "
    println(R.get(x))

    print"Do you want to continue? [Y/N]: "
    t = System.in.newReader().readLine()
    if(t == "Y" || t == "y") {}
    else if(t == "N" || t == "n") { break }
    else {break}
    println""
}
