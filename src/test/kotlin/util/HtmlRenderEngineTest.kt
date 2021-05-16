package util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.math.exp

class HtmlRenderEngineTest {
    @Test
    fun htmlRenderEngineEmptyTest() {
        val htmlRenderEngine = HtmlRenderEngine()
        val result = htmlRenderEngine.render()
        val expectedResult = "<html><head></head><body></body></html>"
        assertEquals(expectedResult, result)
    }

    @Test
    fun htmlRenderEngineSingleTextTest() {
        val htmlRenderEngine = HtmlRenderEngine()
        htmlRenderEngine.appendText(text = "Hello", newline = false)
        val result = htmlRenderEngine.render()
        val expectedResult = "<html><head></head><body><p1>Hello</p1></body></html>"
        assertEquals(expectedResult, result)
    }

    @Test
    fun htmlRenderEngineSingleHeaderTest() {
        val htmlRenderEngine = HtmlRenderEngine()
        htmlRenderEngine.appendHeader(header = "Hello")
        val result = htmlRenderEngine.render()
        val expectedResult = "<html><head></head><body><h1>Hello</h1></body></html>"
        assertEquals(expectedResult, result)
    }

    @Test
    fun htmlRenderEngineDoubleTextWithLineBreakTest() {
        val htmlRenderEngine = HtmlRenderEngine()
        htmlRenderEngine.appendText(text = "Hello")
        htmlRenderEngine.appendText(text = "Hello again", newline = false)
        val result = htmlRenderEngine.render()
        val expectedResult = "<html><head></head><body><p1>Hello</p1><br><p1>Hello again</p1></body></html>"
        assertEquals(expectedResult, result)
    }

    @Test
    fun htmlRenderEngineAppendListOfStringsTest() {
        val htmlRenderEngine = HtmlRenderEngine()
        val listOfStrings = listOf("Hello", "from", "the", "other", "side")
        htmlRenderEngine.appendList(listOfStrings)
        val result = htmlRenderEngine.render()
        val expectedResult = "<html><head></head><body><ul><li>Hello</li><li>from</li><li>the</li><li>other</li><li>side</li></ul></body></html>"
        assertEquals(expectedResult, result)
    }

    @Test
    fun htmlRenderEngineAppendDescriptionListTest() {
        val htmlRenderEngine = HtmlRenderEngine()
        val mapOfValues = mapOf("Project1" to "Do something",
            "Project2" to "Get this done"
            )
        htmlRenderEngine.appendDescriptionList(mapOfValues)
        val result = htmlRenderEngine.render()
        val expectedResult = "<html><head></head><body><dl><dt>Project1</dt><dd>Do something</dd><dt>Project2</dt><dd>Get this done</dd></dl></body></html>"
        assertEquals(expectedResult, result)
    }
}