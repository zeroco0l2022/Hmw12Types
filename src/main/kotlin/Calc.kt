fun main(){
    calcAmount(7854)
calcLikes(21)
    music(15000, true)
}

fun calcAmount(amount: Int) {
    val commissionRate = 0.75
    val minCommission = 35
    var commission = if (amount * commissionRate / 100 > minCommission) amount * commissionRate / 100 else minCommission
    println("Commission: ${commission.toInt()}")
}

fun calcLikes(likes: Int) {
val lastDigit = likes.toString().last().digitToInt()
  var text = if (lastDigit != 1 || likes == 11) "людям" else "человеку"
    println("Понравилось $likes $text")
}

fun music(cost: Int, isRegular: Boolean) {
val discount = if (cost > 10_000) cost * 0.05 else if (cost > 1000) 100 else 0
var price = cost - discount.toInt()
price = if (isRegular) price - (price/100) else price
println(price)
}