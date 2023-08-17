package onboarding

fun solution4(word: String): String {
    return oppositionLetter(word)
}

fun changLetter(word: Char): Char {
    if (word.isLowerCase()) {
        return changeLowerCase(word)
    } else if(word.isUpperCase()) {
        return changeUpperCase(word)
    }else{
        return word
    }
}

fun changeUpperCase(word: Char): Char {
    return (155 - word.code).toChar()
}

fun changeLowerCase(word: Char): Char {
    return (219 - word.code).toChar()
}

fun oppositionLetter(word: String): String {
    var index = 0
    var resultWord = ""
    while (index in word.indices) {
        resultWord += changLetter(word[index])
        index++
    }
    return resultWord
}

/*
입력한 값이 소문자인지 대문자인지 판단
값의 반대를 return
 */
/*
소문자 a = 97, z=122 25 12.5  109(M)이 중간
A= 65 Z= 90 25차이 77(m)
 */