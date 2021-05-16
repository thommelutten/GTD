package models

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test;

class ProjectTest {
    @Test
    fun createEmptyProjectTest() {
        val project = Project()
        assertEquals(0, project.id)
        assertEquals("", project.title)
        val nextAction = NextAction()
        assertEquals(project.nextAction, nextAction)
    }

    @Test
    fun createProjectWithId1Test() {
        val project = Project(id = 1)
        assertEquals(1, project.id)
    }

    @Test
    fun createProjectWithTitleTest() {
        val project = Project(title = "Test")
        assertEquals("Test", project.title)
    }

    @Test
    fun createProjectWithNextActionTest() {
        val nextAction = NextAction(id = 1)
        val project = Project(nextAction = nextAction)
        assertEquals(nextAction, project.nextAction)
    }
}

class NextActionTest {
    @Test
    fun createEmptyNextActionTest() {
        val nextAction = NextAction()
        assertEquals(0, nextAction.id)
        assertEquals("", nextAction.title)
        assertEquals("", nextAction.content)
    }

    @Test
    fun createProjectWithId1Test() {
        val nextAction = NextAction(id = 1)
        assertEquals(1, nextAction.id)
    }

    @Test
    fun createProjectWithTitleTest() {
        val nextAction = NextAction(title = "Test")
        assertEquals("Test", nextAction.title)
    }

    @Test
    fun createNextActionWithContentTest() {
        val nextAction = NextAction(content = "TestContent")
        assertEquals("TestContent", nextAction.content)
    }
}

class CaptureTest {
    @Test
    fun createEmptyCaptureTest() {
        val capture = Capture()
        assertEquals(0, capture.id)
        assertEquals("", capture.content)
    }

    @Test
    fun createCaptureWithId1Test() {
        val capture = Capture(id = 1)
        assertEquals(1, capture.id)
    }

    @Test
    fun createCaptureWithContentTest() {
        val capture = Capture(content = "TestContent")
        assertEquals("TestContent", capture.content)
    }
}