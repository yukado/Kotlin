fun main() {
    val timerValue = readln().toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(time: Int) {
    var time = 0
        set(value) {
        if (value > -128 && value < 127) {
            field = value
        } else if (value < -128) {
            field = -128
        } else if (value >127) {
            field = 127
        }
    }
    init {
        this.time = time
    }
}