fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine().toInt()
    var count = 1
    for (i in 1..input) {
        for (j in 1..input) {
            if (count == 10) {
                count = 1
            }
            print("$count ")
            count++
        }
        println()
    }
}