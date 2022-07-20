package repository;

import entity.Todo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ToDoRepository {

    Connection connection = new DatabaseManager().getConnection();

    public void addTodoToDB(Todo todo) throws SQLException{

        String query = "INSERT INTO todos (description, dueDate, dueTime, status)" +
                " VALUES(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, todo.getDescription()); //setString(or other option) need to match SQL table, not JAVA data
        preparedStatement.setDate(2, todo.getDueDate());
        preparedStatement.setTime(3, todo.getDueTime());
        preparedStatement.setString(4, todo.getStatus().toString());

        preparedStatement.execute();
    }
}

