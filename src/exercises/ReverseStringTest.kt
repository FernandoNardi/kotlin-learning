package exercises

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {

    @Test
    fun reverseUsingSB() {
        Assert.assertEquals("bs niltok", reverseUsingSB("kotlin sb"))
    }

    @Test
    fun reverseUsingSB2() {
        Assert.assertEquals("apo niltok", reverseUsingSB2("kotlin opa"))
    }

    @Test
    fun reverseUsingLoop() {
        Assert.assertEquals("pool niltok", reverseUsingLoop("kotlin loop"))
    }

    @Test
    fun reverseUsingLoop2() {
        Assert.assertEquals("ixiv niltok", reverseUsingLoop2("kotlin vixi"))
    }
}