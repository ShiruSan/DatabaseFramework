package de.shiru.databaseframework.structure;

import de.shiru.databaseframework.annotations.TableField;
import java.lang.reflect.Field;
import java.util.HashMap;

public class EntityTable<T> {
    private final Class<T> entityClass;
    private final HashMap<Field, String> entityStructure;

    EntityTable(Class<T> entityClass) {
        this.entityClass = entityClass;
        entityStructure = new HashMap<>();
        var fields = entityClass.getDeclaredFields();
        for(var field : fields) {
            var annotation = field.getDeclaredAnnotation(TableField.class);
            if(annotation == null) continue;
            entityStructure.put(field, annotation.value());
        }
        if(entityStructure.size() == 0) {
            fields = entityClass.getFields();
            for(var field : fields) {
                entityStructure.put(field, field.getName());
            }
        }
    }

}
