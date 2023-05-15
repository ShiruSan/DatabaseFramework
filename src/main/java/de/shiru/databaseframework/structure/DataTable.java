package de.shiru.databaseframework.structure;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataTable {
    private HashMap<String, List<Object>> table;

    DataTable(ResultSet set) {
        table = new HashMap<>();
        try {
            var metadata = set.getMetaData();
            for(int i = 0; i < metadata.getColumnCount(); i++) table.put(metadata.getColumnName(i+1), new ArrayList<>());
            while (set.next()) {
                for(int i = 0; i < metadata.getColumnCount(); i++) {
                    table.get(metadata.getColumnName(i+1)).add(set.getObject(i+1));
                }
            }
            set.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
