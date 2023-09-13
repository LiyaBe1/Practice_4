fun fibonacci(n: Int): Int {
    if (n <= 0) return 0 // Если n <= 0, возвращаем 0
    if (n == 1 || n == 2) return 1 // Первые два значения равны 1

    var a = 1
    var b = 1

    for (i in 3..n) {
        val temp = a + b
        a = b
        b = temp
    }

    return b
}

fun main() {
    val n = 10 // Значение n

    val result = fibonacci(n)
    println("Значение из последовательности Фибоначчи для n = $n: $result")
}
//функция `fibonacci` принимает в качестве параметра `n` и вычисляет значение из последовательности Фибоначчи для данного `n`.
// Если `n <= 0`, возвращается 0. Если `n` равно 1 или 2, возвращается 1. В остальных случаях используется цикл `for`, чтобы вычислить значения последовательности Фибоначчи до `n`.
//В функции `main` мы выбираем значение `n` (в данном случае 10) и вызываем функцию `fibonacci` с этим параметром. Затем выводим результат в консоль.
//Вы можете изменить значение переменной `n` на любое другое число, чтобы вычислить соответствующее значение из последовательности Фибоначчи.