def map = [ '1' : ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'],
             '2' : ['D', 'G'],
             '3' : ['B', 'C', 'M', 'P'],
             '4' : ['F', 'H', 'V', 'W', 'Y'],
             '5' : ['K'],
             '8' : ['J', 'X'],
             '10': ['Q', 'Z']]

def shiny = [:]

for (i in map) {
    for (x = 0; x < i.value.size(); x++) {
        shiny[i.value[x]] = i.key
    }
}

println shiny.sort()