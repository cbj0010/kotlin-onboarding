package onboarding

fun solution3(number: Int): Int {
    return checkGame(number)
}
fun checkGame(inputNum: Int): Int {
    var i = 1
    var count = 0
    while (i < inputNum + 1) {
        var j = i
        do {
            var divideTen = j % 10
            count+= checkRemainderNumber(divideTen)
            count+= checkQuotientNumber(i)
            j /= 10
        } while (j / 10 !== 0)
        i++
    }
    return count
}

fun checkRemainderNumber(remainder: Int): Int {
    if (remainder%3==0) {
        return 1
    } else return 0
}

fun checkQuotientNumber(quotient: Int): Int {
    if ((quotient / 10).equals(3) || (quotient / 10).equals(6) || (quotient / 10).equals(9)) {
        return 1
    } else return 0
}
/*
입력받은 값 까지 하나씩 숫자를 올리며 각 자라의 값에 3,6,9가 있나 확인한다.
같은 값이 있을 경우 숫자를 올린다
 */