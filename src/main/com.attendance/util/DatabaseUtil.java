// src/main/java/com/attendance/util/DatabaseUtil.java
package com.attendance.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/attendance_db";
        String user = "root";
        String password = "password";
        return DriverManager.getConnection(url, user, password);
    }
}
