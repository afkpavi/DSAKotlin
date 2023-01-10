fun bubbleSort(arr: Array<Int>) : Array<Int> {
//    Outer Loop
    for(idx in 0..arr.size - 1){
        var swapped: Boolean = true
        print(idx)
//        Inner Loop
        for(j in 0 .. arr.size - idx - 2){
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j + 1]
                arr[j + 1] = arr[j]
                arr[j] = temp
                swapped = false
            }
        }
    }
    return arr
}

val arr : Array<Int> = arrayOf(6, 8, 3, 12, 24, 0)

println(bubbleSort(arr).contentToString())