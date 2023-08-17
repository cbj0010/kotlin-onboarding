package onboarding

fun solution2(cryptogram: String): String {
    return (checkString(cryptogram))
}

fun checkString(inputString: String): String {
    var result = inputString
    var index = 0

    while (index< result.length-1) {
        if (result[index] == result[index + 1]) {
            result = result.removeRange(index, index + 2)
            index -= 2
        }
        index++
    }
    return result
}

/*
1.문자가 중복인지 입력된 길이만큼 반복문을 돌면서 체크한다.
2.반복된 경우에는 지워준다
3. 지운 값을 result로 치환한다.
4. 2개를 지웠으니 index를 -2해준다
 */