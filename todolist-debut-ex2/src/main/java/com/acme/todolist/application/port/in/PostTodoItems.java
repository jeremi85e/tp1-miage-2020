package com.acme.todolist.application.port.in;

import com.acme.todolist.domain.TodoItem;

public interface PostTodoItems {
	
	/**
	 * 
	 * @return ajoute un item
	 */
	void postTodoItem(TodoItem todoItem);

}
