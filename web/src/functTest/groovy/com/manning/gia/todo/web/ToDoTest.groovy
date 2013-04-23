package com.manning.gia.todo.web

import geb.*
import geb.junit4.*
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.openqa.selenium.Keys

@RunWith(JUnit4)
class ToDoTest extends GebReportingTest {
    @Test
    void theToDoHomepage() {
        to ToDoHomepage

		$("form", id: "newItemForm").name = 'Write functional tests'
		$("form", id: "newItemForm").name << Keys.ENTER
		
		waitFor { at ToDoInsert }
    }
}