package onboarding

import kotlin.math.max

fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    return gameResult(pobi, crong)
}

fun digitPlus(pages: List<Int>): Int {
    var firstPage = pages[0]
    var secondPage = pages[1]
    var firstPageResult = 0
    var secondPageResult = 0

    while (firstPage != 0) {
        firstPageResult += firstPage % 10
        firstPage /= 10
    }
    while (secondPage != 0) {
        secondPageResult += secondPage % 10
        secondPage /= 10
    }
    return max(firstPageResult, secondPageResult)
}

fun digitMultiple(pages: List<Int>): Int {
    var firstPage = pages[0]
    var secondPage = pages[1]
    var firstPageResult = 1
    var secondPageResult = 1

    while (firstPage != 0) {
        firstPageResult *= firstPage % 10
        firstPage /= 10
    }
    while (secondPage != 0) {
        secondPageResult *= secondPage % 10
        secondPage /= 10
    }
    return max(firstPageResult, secondPageResult)
}

fun comparePlusMultiple(pages: List<Int>): Int {
    return max(digitMultiple(pages), digitPlus(pages))
}

fun outPutMaximum(pobiMaxNum: Int, crongMaxNum: Int): Int {
    val result: Int
    if (pobiMaxNum > crongMaxNum) result = 1
    else if (pobiMaxNum < crongMaxNum) result = 2
    else if (pobiMaxNum == crongMaxNum) result = 0
    else result = -1
    return result
}

fun gameResult(pobi: List<Int>, crong: List<Int>): Int {
    //   pobi와 crong이 주어질 때, 포비가 이긴다면 1, 크롱이 이긴다면 2, 무승부는 0, 예외사항은 -1로 return 하도록 solution 함수를 완성하라.
    val pobiMaxNum = comparePlusMultiple(pobi)
    val crongMaxNum = comparePlusMultiple(crong)

    if (checkSerialPage(pobi, crong) == -1 || checkTwoPage(pobi, crong) == -1) return -1
    return when (outPutMaximum(pobiMaxNum, crongMaxNum)) {
        1 -> 1
        2 -> 2
        0 -> 0
        else -> -1
    }
}


fun checkTwoPage(pobi: List<Int>, crong: List<Int>): Int {
    if (pobi.size !== 2 || crong.size !== 2) {
        println("checkTwoPage1")
        return -1
    } else {
        println("checkTwoPage1")
        return 0
    }
}

fun checkSerialPage(pobi: List<Int>, crong: List<Int>): Int {
    if (pobi[1] - pobi[0] !== 1 || crong[1] - crong[0] !== 1) {
        println("checkSerialPage1")
        return -1
    } else {
        println("checkSerialPage2")
        return 0
    }
}
