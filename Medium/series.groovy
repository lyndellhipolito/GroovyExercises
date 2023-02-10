class Series {
    
    static slices(series, sliceLength) {
        if(series.length() < sliceLength || sliceLength < 1 || series.length() == 0) throw new ArithmeticException()
        series.split("").collate(sliceLength, 1, false).collect{it.join()}
    }
}