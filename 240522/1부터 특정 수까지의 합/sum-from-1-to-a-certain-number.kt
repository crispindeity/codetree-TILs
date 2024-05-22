fun main() {
    val input = readLine()!!.toInt()

    var total = 0

    for (i in 1..input) {
        total += i
    }

    print(total / 10)
}