package rest.controllers

import util.HtmlRenderEngine
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/test")
    fun test() : String {
        return "Hello"
    }

    @GetMapping("/")
    fun home() : String {
        val htmlRenderEngine = HtmlRenderEngine()
        htmlRenderEngine.appendHeader("Header here")
        val mapOfValues = mapOf("Project1" to "Do something",
            "Project2" to "Get this done"
        )
        htmlRenderEngine.appendDescriptionList(mapOfValues)
        return htmlRenderEngine.render()
    }
}