package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.application.port.in.PostTodoItems;
import com.acme.todolist.domain.TodoItem;

/**
 * Le controlleur Spring MVC qui expose les endpoints REST
 * 
 * @author bflorat
 *
 */
@RestController
public class TodoListController {
	

	private GetTodoItems getTodoItemsQueryService;
	private PostTodoItems postTodoItems;
	
	
	@Inject
	public TodoListController(GetTodoItems getTodoItemsQueryService, PostTodoItems postTodoItems) {
		this.getTodoItemsQueryService = getTodoItemsQueryService;
		this.postTodoItems = postTodoItems;
	}
	
	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQueryService.getAllTodoItems();
	}
	
	@PostMapping("/todos")
	public ResponseEntity postTodoItem(@RequestBody TodoItem todoItem) {
		this.postTodoItems.postTodoItem(todoItem);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	
}
