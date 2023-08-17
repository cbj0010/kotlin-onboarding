package onboarding

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
    TODO("프로그램 구현")
}

/*
user와 친구인 애 찾기
user와 친구인 애 중에서 친구인 애 찾기(user제외)
나온 친구들의 이름의 갯수당 +10을 해준다
visitors 에 있는 id 개수만큼 +1
+10해준것과 +1 해준것 중에 같은 아이디가 있다면 합쳐줌
상위 5명을 정렬함
 */


private fun findUserFriend(
    //유저와 친구인 애
    friends: List<List<String>>,
    user: String,
): MutableSet<String> {
    val userFriendSet: MutableSet<String> = mutableSetOf()
    for (friendlist in friends) {
        if (friendlist[0] == user) userFriendSet.add(friendlist[1])
        if (friendlist[1] == user) userFriendSet.add(friendlist[0])
    }
    println("userFriendSet $userFriendSet")
    return userFriendSet
}

private fun friendOfFriend(   //친구의 친구
    friends: List<List<String>>,
    user: String
): MutableMap<String, Int> {
    val friendList = findUserFriend(friends, user).sorted()
    val friendMap = mutableMapOf<String, Int>()
    for (list in friends) {
        if (user in list) {
            continue
        }
        if (list[0] in friendList) {
            println("list[0] ${list[0]} friendList $friendList")
            plusScore(friendMap, list[0], 10)
        }
        if (list[1] in friendList) {
            plusScore(friendMap, list[1], 10)
        }
    }
    println(friendMap)
    return friendMap
}

private fun plusScore(nameWithScore: MutableMap<String, Int>, name: String, score: Int) {
    val currentValue = nameWithScore[name] ?: 0 // 기존 값 불러오기. 값이 없으면 0으로 초기화

    if (name in nameWithScore) {
        println("nameWithScore in $nameWithScore")
        nameWithScore[name] = currentValue + 10 // 10 더한 값으로 업데이트
    } else {
        println("nameWithScore else $nameWithScore")
        nameWithScore.put(name, score)
    }
}
