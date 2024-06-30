package com.basic.spring.boot.core;

public class Database {

    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {
        // can't instantiate database class
    }
}
