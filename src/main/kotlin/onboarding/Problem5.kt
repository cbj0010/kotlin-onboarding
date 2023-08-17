package onboarding

fun solution5(money: Int): List<Int> {
    return moneyList(money)
}

fun moneyList(inputMoney: Int): ArrayList<Int> {
    var money = inputMoney
    val divideMondy = listOf(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1)
    val resultList = arrayListOf<Int>()
    divideMondy.forEach {
        resultList.add(money / it)
        money %= it
    }
    return resultList
}
/*
나눠야 되는 돈을 리스트에 저장한다.
나눈 몫을 새로운 리스트에 저장한다
 */
