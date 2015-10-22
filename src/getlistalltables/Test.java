/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getlistalltables;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Omer Faruk KURT
 */
public class Test {
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

  private static final String URL = "jdbc:sqlserver://localhost;databaseName=Hafriyat";

  private static final String USERNAME = "gida_bankasi";

  private static final String PASSWORD = "[Sa123.]";

  public static void main(String[] args) throws Exception {
    Class.forName(DRIVER);
    Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

    DatabaseMetaData metadata = connection.getMetaData();
    ResultSet resultSet = metadata.getColumns(null, null, "araclar", null);
    while (resultSet.next()) {
      String name = resultSet.getString("COLUMN_NAME");
      String type = resultSet.getString("TYPE_NAME");
      int size = resultSet.getInt("COLUMN_SIZE");

      System.out.println("Column name: " + name + "; type: " + type + "; size: " + size);
    }
    connection.close();
  }
}
