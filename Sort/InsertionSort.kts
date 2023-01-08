fun insertionSort(arr: Array<Int>) : Array<Int> {
//    Outer Loop
    for(i in 1 .. arr.size - 1) {
        var j = i;
//        Inner loop swapping if n-1 is greater than n
        while(j>0 && arr[j - 1] > arr[j]) {
            val temp = arr[j - 1]
            arr[j - 1] = arr[j]
            arr[j] = temp
            j --;
        }
    }
    return  arr
}


val arr = arrayOf(5, 7, 10, 23, 1, 0)
println(arr.contentToString())
print(insertionSort(arr).contentToString())