package com.example.springboot.demographqlservice.repos;

import com.example.springboot.demographqlservice.domain.PropertyObject;
import com.example.springboot.demographqlservice.domain.TestEntity;
import com.example.springboot.demographqlservice.domain.ValueType;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class TestEntityRepo implements EntityRepo<TestEntity> {

    HashMap<String, TestEntity> entities;
    public TestEntityRepo()
    {
        int dataCount = 11;
        entities = new HashMap<>();
        for (int i = 0; i < dataCount; i++)
        {
            TestEntity testEntity = new TestEntity();
            testEntity.setId(String.valueOf(i));
            testEntity.setName("name " + i);
            testEntity.setDescription("description " + i);

            List<PropertyObject> props = new ArrayList<PropertyObject>();
            // Int32 props
            for (int j = 0; j < (dataCount%3 + 1); j++){
                PropertyObject prop = new PropertyObject();
                prop.setValue(String.valueOf(j));
                prop.setDataType(ValueType.INT32);
                props.add(prop);
            }
            // String props
            for (int j = 0; j < (dataCount%5 + 1); j++){
                PropertyObject prop = new PropertyObject();
                prop.setValue("string " + j);
                prop.setDataType(ValueType.STRING);
                props.add(prop);
            }
            testEntity.setProperties(props);

            entities.put(String.valueOf(i), testEntity);
        }
    }

    public Iterable<TestEntity> getAllEntities(){
        return entities.values();
    }

    public Optional<TestEntity> getEntityById(String id){
        return Optional.ofNullable(entities.get(id));
    }

    public Iterable<TestEntity> getEntitiesByName(String name){
        return entities.values().stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
}
