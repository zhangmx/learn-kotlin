import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun main() {

        for(x in 0 until 10) {
            println("Hello, World!$x")
        }


        assertEquals(1, 1)
    }

    @Test
    fun getScore() {

        assertEquals(getScore("Alice"), 2)
    }
}