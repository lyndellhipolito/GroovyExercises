def num = [1,2,3,4,5]
def even = []
def odd = []


for(i in num) {

    if(i % 2 == 0) even << i

    else odd << i
    
}

println "Keep: $even"
println "Discard: $odd"