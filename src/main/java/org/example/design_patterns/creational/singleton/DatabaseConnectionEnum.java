package org.example.design_patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public enum DatabaseConnectionEnum {
    INSTANCE;

    private final List<String> pool = new ArrayList<>();
    DatabaseConnectionEnum(){
        for(int i=0; i<10; i++){
            pool.add("conn-"+i);
        }
    }

    public String getConnection(){
        if(!pool.isEmpty()){
            return pool.removeFirst();
        }
        throw new RuntimeException("Connections Exhausted!!");
    }
}
