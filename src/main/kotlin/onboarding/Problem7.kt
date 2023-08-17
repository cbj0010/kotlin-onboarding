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

private fun findUserFriend(     //유저와 친구인 애
    friends: List<List<String>>,
    user: String,
    userFriendSet: MutableSet<String>
): MutableSet<String> {
    for (friendlist in friends) {
        if (friendlist[0] == user) userFriendSet.add(friendlist[1])
        if (friendlist[1] == user) userFriendSet.add(friendlist[0])
    }
    return userFriendSet
}

private fun friendOfFriend(   //친구의 친구
    friends: List<List<String>>,
    user: String,
    userFriendList: MutableSet<String>
) {
    val friendList = findUserFriend(friends, user, userFriendList).sorted()
    for (list in friends) {
        if (list[0] in friendList) {
            plusScore(list[0])
        }
        if (list[1] in friendList) {
            plusScore(list[1])
        }
    }
}

private fun plusScore(name: String) {

}