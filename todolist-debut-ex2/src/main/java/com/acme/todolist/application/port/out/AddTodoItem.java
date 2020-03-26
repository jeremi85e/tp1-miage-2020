package com.acme.todolist.application.port.out;

import com.acme.todolist.domain.TodoItem;

public interface AddTodoItem {
	
	/**
	 * Ajoute un nouveau TodoItem
	 * @param item
	 */
	void addNewTodoItem(TodoItem item);

}
