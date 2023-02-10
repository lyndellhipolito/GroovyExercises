// Instructions
// Detect saddle points in a matrix.

// So say you have a matrix like so:

//     1  2  3
//   |---------
// 1 | 9  8  7
// 2 | 5  3  2     <--- saddle point at row 2, column 1, with value 5
// 3 | 6  6  7
// It has a saddle point at row 2, column 1.

// It's called a "saddle point" because it is greater than or equal to every element in its row and less than or equal to every element in its column.

// A matrix may have zero or more saddle points.

// Your code should be able to provide the (possibly empty) list of all the saddle points for any given matrix.

// The matrix can have a different number of rows and columns (Non square).

// Note that you may find other definitions of matrix saddle points online, but the tests for this exercise follow the above unambiguous definition.

class saddle {

    static getSaddlePoints(matrix) { //
        if(!matrix) return []
        int rows = matrix.size()
        int cols = matrix[0].size()
        def saddlePoint = []

        
        for(int x = 0; x < rows; x++) { //
            for(int y = 0; y < cols; y++) { // 
                if(saddlepoint(matrix, x, y)) saddlePoint << [x, y] // 
            }
        }
        return saddlePoint
    }

    static great(elementRow) { //
        int greater = 0
        for(int i = 0; i < elementRow.size(); i++){ // 
            int ctr = elementRow[i]
            if(ctr > greater) greater = ctr
        }
        return greater
    }
    
    static less(elementCol) { //
        int lesser =great(elementCol)
        for(int i = 0; i < elementCol.size(); i++){ //
            int ctr = elementCol[i]
            if(ctr < lesser) lesser = ctr
        }  
        return lesser
    }
    
    static boolean saddlepoint(matrix, row, col) { //
        int test = matrix[row][col]
        def theRow = matrix[row]
        def theCol = []

        for(int i = 0; i < matrix.size(); i++) theCol << matrix[i][col] //
        return (great(theRow) == test && less(theCol) == test)
    }

    
}

def testMatrix = [[4, 5, 4],
                  [3, 5, 5],
                  [1, 5, 4]]



saddle s = new saddle()

println "Your matrix is: $testMatrix "
println "Your saddle point is: ${s.getSaddlePoints(testMatrix)}"