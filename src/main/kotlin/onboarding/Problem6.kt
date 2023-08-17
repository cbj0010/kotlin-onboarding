package onboarding

fun solution6(forms: List<List<String>>): List<String> {
//    val splitNameList = mutableMapOf<String, MutableSet<String>>()
  return  splitName(forms)
}

private fun splitName(forms: List<List<String>>): List<String> {
    val overLapName = mutableSetOf<String>()
    for (index in forms.indices) {
        val nickName = forms[index][1]
        for (i in 0..nickName.length - 2) {
            val spliteName = nickName.substring(i, i + 2)
            for (j in 0 ..forms.size-1) {
                if (nickName != forms[j][1] && forms[j][1].contains(spliteName)) {
                    overLapName.add(forms[j][0])
                }
            }
        }
    }
    return overLapName.sorted()
}


/*
예외
입력된 이메일의 길이는 11자 이상 20자 미만이다.
신청할 수 있는 이메일은 eamil.com만 가능
작업
두자리씩 끊어서 이메일과 함께 저장
 */