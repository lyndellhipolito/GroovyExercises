class Triangle {
    def a, b, c
    Triangle(a, b, c) {
        this.a = a
        this.b = b
        this.c = c
    }

    boolean isEquilateral() {
        a == b && a == c && b == c && c != 0
    }
    boolean isIsosceles() {
        (b == c || a == b || a == c) && (a != 0 || b != 0 || c != 0) && ( a + b > c && b + c > a && a + c > b)
    }
    boolean isScalene() {
        (a != b && a != c && b != c) && (a != 0 || b != 0 || c != 0) && ( a + b > c && b + c > a && a + c > b)
    }
}
