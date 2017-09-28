package exercises

import org.junit.Assert
import org.junit.Test

class ExtensionNumberTest {

    @Test
    fun percentOfNumber() {
        Assert.assertEquals(10.0f, 10.0f.percentOf(100.0f), .01f)
    }

    @Test
    fun percentOfNumber2() {
        Assert.assertEquals(5f, 10.0f.percentOf(50.0f), .01f)
    }

    @Test
    fun percentOfNumberCustomPrecision() {
        Assert.assertEquals(30333.3f, 33.0f.percentOf(91919.0f).customPrecision(1))
    }

}