package controller;

import entity.Status;
import entity.Todo;
import repository.ToDoRepository;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

public class ToDoController {
    Scanner scanner = new Scanner(System.in);

    ToDoRepository toDoRepository = new ToDoRepository();

    public ToDoController() {
    }

    public void addTodo() {
        try {

            Todo todo = this.collectToDoInfo();
            toDoRepository.addTodoToDB(todo);
            System.out.println("Todo item was added successfully");
        } catch (Exception exception) {
            System.out.println("Error:" + exception.getClass() + " - "+ exception.getMessage());
        }
    }

    private Todo collectToDoInfo() throws Exception{
    Todo todo = new Todo();
    todo.setDescription(this.getUserInput("Enter description"));
    todo.setDueDate(Date.valueOf(this.getUserInput("Enter due date, Example (2022-07-25):"))); //exception required
    todo.setDueTime(Time.valueOf(this.getUserInput("Enter due time, Example (19:35):") + ":00")); //exception required
    todo.setStatus(Status.PENDING);

    return todo;
    }

    private String getUserInput(String message){
        System.out.println(message);
        String value = scanner.nextLine();
        return value;
    }
}
