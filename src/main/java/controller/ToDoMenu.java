package controller;

import java.util.Scanner;

public class ToDoMenu {

    Scanner scanner =new Scanner(System.in);
    ToDoController toDoController = new ToDoController();

    public void start(){
        this.showOptions();
        this.handleUserChoice();
    }

    private void handleUserChoice() {
        System.out.println("Choose an option: ");
        String userChoice = scanner.nextLine();

        switch (userChoice){
            case "1":
                toDoController.addTodo();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                System.exit(0);
        }
    }

    private void showOptions() {
            System.out.println(
             "Welcome to To Do Application" +
                  "\n 1. Add To Do Item" +
                  "\n 2. View To Do List" +
                  "\n 3. View To Do Item" +
                  "\n 4. Remove Item" +
                  "\n 5. Update Item" +
                  "\n 6. Exit"
       );
    }


}
