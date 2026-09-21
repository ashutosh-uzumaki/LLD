package org.example.design_patterns.creational.singleton;

import java.util.*;

public class DatabaseConnection {
    private static volatile DatabaseConnection databaseInstance;
    private List<String> pool = new ArrayList<>();
    private DatabaseConnection(int numConnections){
        for(int i=0; i<numConnections; i++){
            pool.add("conn-"+i);
        }
    }

    public static DatabaseConnection getDatabaseInstance(int numConnections){
        if(databaseInstance == null) {
            synchronized (DatabaseConnection.class) {
                if (databaseInstance == null) {
                    databaseInstance = new DatabaseConnection(numConnections);
                }
            }
        }
        return databaseInstance;
    }

    public String getConnection(){
        if(!pool.isEmpty()){
            return pool.removeFirst();
        }
        throw new RuntimeException("No more connections available!!");
    }
}
