package de.shiru.databaseframework.structure;

import java.sql.Connection;

public abstract class Database {

    public abstract Connection connection();

    public abstract DataTable getTable(String name);
    public abstract boolean existsTable(String name);
    public abstract boolean createTable(TableConstructor tableConstructor);
    public <T> EntityTable<T> getEntityTable(Class<T> entityClass) {
        if(!existsTable(entityClass.getName())) return null;
        return null;
    }


}
