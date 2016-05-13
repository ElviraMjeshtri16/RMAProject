package com.balkatek.rma.utils;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import java.sql.ResultSet;
import java.sql.Types;

public class ToJSON {

    public JSONArray toJSONArray(ResultSet resultSet)throws Exception{
        JSONArray json = new JSONArray();
        try {
            // will need columns name, this will save the table meta-data like column name
            java.sql.ResultSetMetaData rsmd = resultSet.getMetaData();
            while (resultSet.next()){
                //figure out how meny columns there are
                int numColumns = rsmd.getColumnCount();
                //each row in the resultset will be converted to json Object
                JSONObject obj = new JSONObject();
                //loop through all the columns and place them into the JSON Object
                for (int i=1; i<numColumns+1; i++){
                    String column_name = rsmd.getColumnName(i);
                    if(rsmd.getColumnType(i)== Types.ARRAY){
                        obj.put(column_name, resultSet.getArray(column_name));
                        /*Debug*/System.out.println("ToJson:Array");
                    }
                    else if(rsmd.getColumnType(i)== Types.BIGINT){
                        obj.put(column_name, resultSet.getInt(column_name));
                        /*Debug*/System.out.println("ToJson:BIGINT");
                    }
                    else if(rsmd.getColumnType(i)== Types.BOOLEAN){
                        obj.put(column_name, resultSet.getBoolean(column_name));
                        /*Debug*/System.out.println("ToJson: BOOLEAN");
                    }
                    else if(rsmd.getColumnType(i)== Types.BLOB){
                        obj.put(column_name, resultSet.getBlob(column_name));
                        /*Debug*/System.out.println("ToJson: Blob");
                    }
                    else if(rsmd.getColumnType(i)== Types.DOUBLE){
                        obj.put(column_name, resultSet.getDouble(column_name));
                        /*Debug*/System.out.println("ToJson: DOUBLE");
                    }
                    else if(rsmd.getColumnType(i)== Types.FLOAT){
                        obj.put(column_name, resultSet.getFloat(column_name));
                        /*Debug*/System.out.println("ToJson: FLOAT");
                    }
                    else if(rsmd.getColumnType(i)== Types.INTEGER){
                        obj.put(column_name, resultSet.getInt(column_name));
                        /*Debug*/System.out.println("ToJson: INTEGER");
                    }
                    else if(rsmd.getColumnType(i)== Types.NVARCHAR){
                        obj.put(column_name, resultSet.getNString(column_name));
                        /*Debug*/System.out.println("ToJson: NVARCHAR");
                    }
                    else if(rsmd.getColumnType(i)== Types.VARCHAR){
                        obj.put(column_name, resultSet.getString(column_name));
                        /*Debug*/System.out.println("ToJson: VARCHAR");
                    }
                    else if(rsmd.getColumnType(i)== Types.TINYINT){
                        obj.put(column_name, resultSet.getInt(column_name));
                        /*Debug*/System.out.println("ToJson: TINYINT");
                    }
                    else if(rsmd.getColumnType(i)== Types.SMALLINT){
                        obj.put(column_name, resultSet.getInt(column_name));
                        /*Debug*/System.out.println("ToJson: SMALLINT");
                    }
                    else if(rsmd.getColumnType(i)== Types.DATE){
                        obj.put(column_name, resultSet.getDate(column_name));
                        /*Debug*/System.out.println("ToJson: DATE");
                    }
                    else if(rsmd.getColumnType(i)== Types.TIMESTAMP){
                        obj.put(column_name, resultSet.getTimestamp(column_name));
                        /*Debug*/System.out.println("ToJson: TIMESTAMP");
                    }
                    else if(rsmd.getColumnType(i)== Types.NUMERIC){
                        obj.put(column_name, resultSet.getBigDecimal(column_name));
                        /*Debug*/System.out.println("ToJson: NUMERIC");
                    }
                    else {
                        obj.put(column_name, resultSet.getObject(column_name));
                         /*Debug*/System.out.println("ToJson: object" + column_name);
                    }

                }//end foreach
                json.put(obj);
            }//end while
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return json; //return json array
    }
}
