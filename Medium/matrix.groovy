class Matrix {
    def matrix = [][]
    
    Matrix(String asString) {
    def result = []
    def col = []
    String[] row = asString.split('\n')
    for(x in row)
        matrix << x.split(' ')

    for(y in col)
        matrix << y as int
    }

    def row(int rowNumber) {
        matrix[rowNumber]
    }

    def column(int columnNumber) {
        def resultCol = []
        for(int i = 0; i < matrix.size(); i++) 
            resultCol << matrix[i][columnNumber]

        resultCol
    }

    int getSize() {
        return matrix.size()
    }
}

def test = "1 2 3\n4 5 6\n7 8 9\n8 7 6"

def m = new Matrix(test)

println m.row(3)
println m.column(1)