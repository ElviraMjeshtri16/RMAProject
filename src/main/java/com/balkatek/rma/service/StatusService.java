package com.balkatek.rma.service;


import com.balkatek.rma.database.DatabaseConnection;
import com.balkatek.rma.model.Status;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StatusService {
    DatabaseConnection databaseConnection;
    Connection connection;
    ResultSet resultSet;
    String statusQyery;

    public ArrayList<Status> getAllStatuses() throws Exception{
        ArrayList<Status> statusData =  new ArrayList<Status>();
        try {
            statusQyery =  "SELECT * FROM Status";
            databaseConnection = new DatabaseConnection();
            connection = DatabaseConnection.setDBConnection();
            resultSet = databaseConnection.getResultSet(statusQyery, connection);
            while (resultSet.next()){
                Status status = new Status();
                status.setIdStatus(resultSet.getInt("idStatus"));
                status.setDescripton(resultSet.getString("description"));
                statusData.add(status);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return statusData;
    }

}
