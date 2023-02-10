class BinarySearch {

    List data

    // You may assume for this exercise that the input data is sorted in ascending order.
    BinarySearch(List data) {
        this.data = data
    }

    int indexOf(item) {
        int left = 0
        int right = data.size() - 1
        int middle = 0

        while(left <= right) {
            middle = left + (right - left) / 2

            if(data[middle] == item) return middle
            if(data[middle] < item) left = middle + 1
            else right = middle -1
        }
        return -1
    }

}
