package org.example;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static org.example.Database.getConnection;

public class DatabaseInitService {


    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        try (Statement statement = connection.createStatement();
             InputStream inputStream = new FileInputStream("sql/init_db.sql");
             Scanner scanner = new Scanner(inputStream);) {

            StringBuilder sql = new StringBuilder();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                sql.append(line).append("\n");
                if (line.trim().endsWith(";")) {
                    statement.execute(sql.toString());
                    sql = new StringBuilder();
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (SQLException e) {
            System.out.println("Some problems in SQL");
        } catch (IOException e) {
            System.out.println("Some problems in IO");
        }
        connection.close();
    }
}
