fun main(args: Array<String>) {
    println("Введите число лайков: ")
    val a = readln().toInt()
    if (a%10==1) println("Понравилось человеку")
    else println("Понравилось людям")
}