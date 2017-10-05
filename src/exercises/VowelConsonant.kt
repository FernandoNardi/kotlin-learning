package exercises

fun countVowels(phrase: String): Int {
    val vowels: Array<String> = arrayOf("a", "e", "i", "o", "u")
    var count = 0
    for (char in phrase) {
        if (vowels.contains(char.toLowerCase().toString())) {
            count++
        }
    }
    return count
}

fun countVowels2(phrase: String): Int {
    val vowels = "aeiou"
    var count = 0
    for(letter in phrase) {
        if(letter.toLowerCase() in vowels) count++
    }
    return count
}

fun countConsonants(phrase: String): Int {
    val vowels: Array<String> = arrayOf("a", "e", "i", "o", "u")
    var count = 0
    for (char in phrase) {
        if (!vowels.contains(char.toString().toLowerCase()) && char.isLetter()) {
            count++
        }
    }
    return count
}

fun countConsonants2(phrase: String): Int {
    val consonants = "qwrtypsdfghjklçzxcvbnm"
    var count = 0
    for(letter in phrase) {
        if(letter.toLowerCase() in consonants) count++
    }
    return count
}

fun countVowelsFilter(phrase: String): Int {
    val vowels: Array<Char> = arrayOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    phrase.filter { it.toLowerCase() in vowels }.forEach { count++ }
    return count
}

fun countVowelsFilterRes(phrase: String) = phrase.filter { it.toLowerCase() in "aeiou" }.length