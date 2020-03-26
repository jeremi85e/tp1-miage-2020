package com.acme.todolist.application.service;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.in.PostTodoItems;
import com.acme.todolist.application.port.out.AddTodoItem;
import com.acme.todolist.domain.TodoItem;

@Component
public class PostTodoItemsService implements PostTodoItems {

		
	private AddTodoItem addTodoItem;
	
	@Inject
	public PostTodoItemsService(AddTodoItem addTodoItem) {
		this.addTodoItem = addTodoItem;
		
	}

	@Override
	public void postTodoItem(TodoItem todoItem) {
		this.addTodoItem.addNewTodoItem(todoItem);
	}

}
