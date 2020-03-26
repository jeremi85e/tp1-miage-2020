package com.acme.todolist;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.Test;

import com.acme.todolist.domain.TodoItem;

class TodolistTest {

	@Test
	void testToLate() {
		Instant past = Instant.now().minus(Duration.ofDays(2));
		
		TodoItem todo = new TodoItem("8", past, "Test Ex3-1");

		assertTrue(todo.finalContent().contains("[LATE!]"));
	}
	
	@Test
	void testNotToLate() {
		Instant past = Instant.now().plus(Duration.ofDays(2));
		
		TodoItem todo = new TodoItem("9", past, "Test Ex3-2");

		assertFalse(todo.finalContent().contains("[LATE!]"));
	}

}
