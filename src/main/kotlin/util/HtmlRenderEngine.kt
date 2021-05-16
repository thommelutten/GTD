package util

import java.lang.StringBuilder

class HtmlRenderEngine {
    private var stringBuilder: StringBuilder = StringBuilder()

    init {
        initializeRenderEngine()
    }

    private fun initializeRenderEngine() {
        stringBuilder.append("<html><head></head><body>")
    }

    fun appendHeader(header: String){
        stringBuilder.append("<h1>$header</h1>")
    }
    fun appendText(text: String, newline: Boolean = true) {
        stringBuilder.append("<p1>$text</p1>")
        if(newline)
            stringBuilder.append("<br>")
    }

    fun render(): String {
        stringBuilder.append("</body></html>")
        return stringBuilder.toString()
    }

    fun appendList(listOfStrings: List<String>) {
        stringBuilder.append("<ul>")
        listOfStrings.forEach {
            stringBuilder.append("<li>$it</li>")
        }
        stringBuilder.append("</ul>")
    }

    fun appendDescriptionList(items: Map<String, String>) {
        stringBuilder.append("<dl>")
        items.forEach {
            stringBuilder.append("<dt>${it.key}</dt>")
            stringBuilder.append("<dd>${it.value}</dd>")
        }
        stringBuilder.append("</dl>")
    }
}