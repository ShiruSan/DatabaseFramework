package de.shiru.databaseframework.mysql;

import de.shiru.databaseframework.structure.DataTable;
import de.shiru.databaseframework.structure.Database;
import de.shiru.databaseframework.structure.TableConstructor;

import java.sql.Connection;

public class MySQLDatabase extends Database {

    public MySQLDatabase(String ip, int port, String user, String password) {

    }

    @Override
    public Connection connection() {
        return null;
    }

    @Override
    public DataTable getTable(String name) {
        return null;
    }

    @Override
    public boolean existsTable(String name) {
        return false;
    }

    @Override
    public boolean createTable(TableConstructor tableConstructor) {
        return false;
    }
}
