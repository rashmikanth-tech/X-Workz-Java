package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Database;

public class DBManager {
    private Database ref;

    public DBManager(Database ref) {
        this.ref = ref;
        System.out.println("💡 DBManager created with Database dependency");
    }

    public void use() {
        ref.action();
    }
}
