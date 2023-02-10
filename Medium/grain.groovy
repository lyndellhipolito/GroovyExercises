sqrpc = 0
totalg = 0
step = 0

for(i = 1; i <= 64; i++) {
    sqrpc = i**2
    totalg += sqrpc
    step++
    
    
    for(x in sqrpc){
        println "Step $step = $x piece. "
    }

}

println""
println""
print "this is numbers of square ${i-1}"
println""
print "this is total $totalg"
println""