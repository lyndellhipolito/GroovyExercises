def result = []
int total = 0

for(int i = 1; i < 1; i++){
    if(i % 3 == 0 || i % 5 == 0) {
        result << i
        total += 1
    }
}
println result
println result.sum()

// class SumOfMultiples {

//     static int sum(List<Integer> factors, int limit) {
//         def result = []
        
//         for(int x in factors){
//             for(int i = 0; i < limit; i++){
//                 if(x == 0) result.add(0)
//                 else if((!result.contains(i)) && (i % x == 0)) {
//                     result.add(i)
//                 }    
//             }
//         }
//         println result
//         return result.sum()
//     }
// }
// code in exercism