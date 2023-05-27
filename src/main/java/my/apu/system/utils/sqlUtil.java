package my.apu.system.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sqlUtil {

    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName(Constant.DATABASE_DRIVER_CLASS_NAME).newInstance();
            conn = DriverManager.getConnection(
                    Constant.DATABASE_URL,
                    Constant.DATABASE_USERNAME,
                    Constant.DATABASE_PASSWORD);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }


    // test JDBC
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName(Constant.DATABASE_DRIVER_CLASS_NAME).newInstance();
            conn = DriverManager.getConnection(
                    Constant.DATABASE_URL,
                    Constant.DATABASE_USERNAME,
                    Constant.DATABASE_PASSWORD);
            PreparedStatement ps = conn.prepareStatement("select * from sys_user");
            ResultSet resultSet = ps.executeQuery();
            List<Map<String, Object>> list = new ArrayList<>();
            ResultSetMetaData md = resultSet.getMetaData();
            int columnCount = md.getColumnCount();
            while (resultSet.next()) {
                Map<String, Object> rowData = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.put(md.getColumnName(i), resultSet.getObject(i));
                }
                list.add(rowData);
            }
            System.out.println("list = " + list);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
