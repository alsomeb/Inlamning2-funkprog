import kotlin.test.*

class TomteTest {

    private val tomteLand = TomteLand()


    @Test
    fun testTomtenReturnsCorrectUnderLings() {
        val res: List<String> = tomteLand.getUnderlings(tomte = tomteLand.tomten)
        val expected = listOf("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader",
        "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")

        assertEquals(expected.size, res.size)
        assertTrue(res.contains("Tröger"))
        assertTrue(res.contains("Trötter"))
        assertTrue(res.contains("Blyger"))
        assertTrue(res.contains("Dammråttan"))
        assertTrue(res.contains("Skumtomten"))
        assertTrue(res.contains("Glader"))
        assertTrue(res.contains("Butter"))
        assertTrue(res.contains("Rådjuret"))
        assertTrue(res.contains("Nyckelpigan"))
        assertTrue(res.contains("Haren"))
        assertTrue(res.contains("Räven"))
        assertTrue(res.contains("Gråsuggan"))
        assertTrue(res.contains("Myran"))
        assertTrue(res.contains("Bladlusen"))
    }

    @Test
    fun testGladerReturnsCorrectUnderLings() {
        val res: List<String> = tomteLand.getUnderlings(tomte = tomteLand.glader)
        val expected = listOf("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten")

        assertEquals(expected.size, res.size)
        assertTrue(res.contains("Tröger"))
        assertTrue(res.contains("Trötter"))
        assertTrue(res.contains("Blyger"))
        assertTrue(res.contains("Dammråttan"))
        assertTrue(res.contains("Skumtomten"))
    }

    @Test
    fun testButterReturnsCorrectUnderLings() {
        val res: List<String> = tomteLand.getUnderlings(tomte = tomteLand.butter)
        val expected = listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran",
            "Bladlusen")

        assertEquals(expected.size, res.size)
        assertTrue(res.contains("Rådjuret"))
        assertTrue(res.contains("Nyckelpigan"))
        assertTrue(res.contains("Haren"))
        assertTrue(res.contains("Räven"))
        assertTrue(res.contains("Gråsuggan"))
        assertTrue(res.contains("Myran"))
        assertTrue(res.contains("Bladlusen"))
        assertFalse(res.contains("Tomten"))
    }

    @Test
    fun testTrotterReturnsCorrectUnderLings() {
        val res: List<String> = tomteLand.getUnderlings(tomte = tomteLand.trotter)
        val expected = listOf("Dammråttan", "Skumtomten")

        assertEquals(expected.size, res.size)
        assertTrue(res.contains("Dammråttan"))
        assertTrue(res.contains("Skumtomten"))
        assertFalse(res.contains("Tomten"))
    }

    @Test
    fun testSkumtomtenReturnsCorrectUnderLings() {
        val res: List<String> = tomteLand.getUnderlings(tomte = tomteLand.skumtomten)
        val expected = listOf("Dammråttan")

        assertEquals(expected.size, res.size)
        assertTrue(res.contains("Dammråttan"))
        assertFalse(res.contains("Skumtomten"))
        assertFalse(res.contains("Tomten"))
    }

    @Test
    fun testRavenReturnsCorrectUnderLings() {
        val res: List<String> = tomteLand.getUnderlings(tomte = tomteLand.raven)
        val expected = listOf("Gråsuggan", "Myran", "Bladlusen")

        assertEquals(expected.size, res.size)
        assertTrue(res.contains("Gråsuggan"))
        assertTrue(res.contains("Myran"))
        assertTrue(res.contains("Bladlusen"))
        assertFalse(res.contains("Räven"))
    }

    @Test
    fun testMyranReturnsCorrectUnderLings() {
        val res: List<String> = tomteLand.getUnderlings(tomte = tomteLand.myran)
        val expected = listOf("Bladlusen")

        assertEquals(expected.size, res.size)
        assertTrue(res.contains("Bladlusen"))
        assertFalse(res.contains("Gråsuggan"))
        assertFalse(res.contains("Myran"))
        assertFalse(res.contains("Räven"))
    }
}

