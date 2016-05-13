package com.balkatek.rma.database;

import java.sql.*;

public class DatabaseConnection {

    public static Connection dbCon;
    public Statement dbStmt;
    public ResultSet dbRst;

    /*DB set Connection*/
    public  static Connection setDBConnection() throws SQLException {
        try{
            System.out.println("Inside DB Connection");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            dbCon = DriverManager.getConnection("jdbc:sqlserver://192.168.1.2:1433;databaseName=rma", "sa", "root!2016");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
            System.out.println(ex);
        }
        return dbCon;
    }

    /*DB getResultSet*/

    public ResultSet getResultSet(String sqlQuery, Connection connection)throws SQLException{
        System.out.println(sqlQuery);
        String sqlquery = sqlQuery;
        dbCon = connection;
        try {
            dbStmt = dbCon.createStatement();
            dbRst = dbStmt.executeQuery(sqlquery);
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return dbRst;
    }
}
