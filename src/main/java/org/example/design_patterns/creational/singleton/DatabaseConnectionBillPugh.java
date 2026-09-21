package org.example.design_patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionBillPugh {
    private List<String> pool = new ArrayList<>();
    private DatabaseConnectionBillPugh(){
        for(int i=0; i<10; i++){
            pool.add("conn-"+i);
        }
    }

    private static class Holder{
        private static final DatabaseConnectionBillPugh INSTANCE = new DatabaseConnectionBillPugh();
    }

    public static DatabaseConnectionBillPugh getInstance(){
        return Holder.INSTANCE;
    }

    public String getConnection(){
        if(!pool.isEmpty()){
            return pool.removeFirst();
        }
        throw new RuntimeException("Connections Exhausted!!");
    }
}
