fun selectionSort(arr: Array<Int>) : Array<Int> {
//    Outer loop
    for(i in 0..arr.size - 1) {
        var current_idx = i;
//        Inner loop swapping if n is greater than n-1
        for(j in current_idx+1 .. arr.size - 1) {
            if (arr[current_idx] > arr[j]) {
                val temp = arr[current_idx]
                arr[current_idx] = arr[j]
                arr[j] = temp
            }
        }
    }
    return arr
}


val arr : Array<Int> = arrayOf(1, 7, 3, 6, 2, 25, 0)

print(selectionSort(arr).contentToString())