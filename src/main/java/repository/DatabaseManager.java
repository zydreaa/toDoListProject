package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

   /*DATABASE management systems
   * MySQL
   * Postgres
   * Mongodb
    */

   private  static Connection connection;

   public DatabaseManager(){
      this.setupDatabase();
   }

   private void setupDatabase() {
      String username = "root";
      String password = "Zuvyte1992";
      String host = "jdbc:mysql://localhost";
      String port = "3306";
      String dbName = "JAVA_27_28_todo_app";

      String connectionUrl = host + ":" + port + "/" + dbName;

      try{
         connection = DriverManager.getConnection(connectionUrl, username, password);
         System.out.println("Successfully connected to MySQL");
      }catch (SQLException exception){
         System.out.println("Error occurred while connecting to MySQL");
         exception.printStackTrace();
      }
   }

   public Connection getConnection() {
      return connection;
   }
}
