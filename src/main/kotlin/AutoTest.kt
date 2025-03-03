fun main() {
    println(calcCommissin("Maestro", 0.0, 100.0))
}
const val ERROR_LIMIT_DAY = -1.0
const val ERROR_LIMIT_NORTH = -2.0



fun calcCommissin(typeCard: String, amountTransfer: Double , sumTransfer: Double): Double {
    return when (typeCard) {
        "Mastercard","Maestro" -> when {
            amountTransfer + sumTransfer > 600_000 -> ERROR_LIMIT_NORTH
            sumTransfer > 150_000 -> ERROR_LIMIT_DAY
            sumTransfer < 300 -> (sumTransfer * 0.006) + 20
            amountTransfer > 75_000 -> (sumTransfer  * 0.006) + 20
            amountTransfer <= 75_000 && amountTransfer + sumTransfer > 75_000 -> ((sumTransfer + amountTransfer) - 75_000) * 0.006 + 20
            else -> 1.0
        }
        "Visa", "Мир" -> when {
            amountTransfer + sumTransfer> 600_000 -> ERROR_LIMIT_NORTH
            sumTransfer > 150_000 -> ERROR_LIMIT_DAY
            else -> if(sumTransfer * 0.0075 > 35) sumTransfer * 0.0075 else 35.0
        }
        else -> when {
            sumTransfer + amountTransfer > 40_000 -> ERROR_LIMIT_NORTH
            sumTransfer > 15_000 -> ERROR_LIMIT_DAY
            else -> 1.0
        }
    }
}