package models

data class Project (
    val id: Int = 0,
    val title: String = "",
    val nextAction: NextAction = NextAction()
)


data class NextAction(val id: Int = 0, val title: String = "", val content: String = "")

data class Capture(val id: Int = 0, val content: String = "")