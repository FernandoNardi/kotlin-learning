package exercises

import org.junit.Assert
import org.junit.Test

class ManyParametersTest {

    @Test
    fun sumAllParameters() {
        Assert.assertEquals(20, sumAllParameters(5, 5, 5, 5))
    }

    @Test
    fun sumAllGenericsParameters() {
        Assert.assertEquals(10.0, sumAllGenericsParameters(1, "", 2, "2", 2.0, "10", 5), .01)
    }
}