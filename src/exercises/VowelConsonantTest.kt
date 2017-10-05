package exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {

    @Test
    fun countVowels() {
        Assert.assertEquals(8, countVowels("How many vowels do I have?"))
        Assert.assertEquals(8, countVowels2("How many vowels do I have?"))
    }

    @Test
    fun countConsonants() {
        Assert.assertEquals(15, countConsonants("How many consonants do I have?"))
        Assert.assertEquals(15, countConsonants2("How many consonants do I have?"))
    }

    @Test
    fun countVowelsAndConsonants() {
        val phrase = "How many vowels and consonants do I have"
        Assert.assertEquals(12, countVowels(phrase))
        Assert.assertEquals(21, countConsonants(phrase))
    }

    @Test
    fun countVowelsFilter() {
        Assert.assertEquals(5, countVowelsFilter("My phrase with vowels."))
    }

    @Test
    fun countVowelsFilterRes() {
        Assert.assertEquals(5, countVowelsFilterRes("My phrase with vowels."))
    }
}