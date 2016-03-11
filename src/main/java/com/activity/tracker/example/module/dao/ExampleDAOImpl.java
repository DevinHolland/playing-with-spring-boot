package com.activity.tracker.example.module.dao;

import com.activity.tracker.example.module.model.Example;

public class ExampleDAOImpl implements ExampleDAO {
    @Override
    public Example get(int id) {
        Example example = new Example();
        example.setId(id);
        example.setExampleName("Example #" + id);
        return example;
    }

    @Override
    public int save(Example example) {
        System.out.println("Saving example with name \"" + example.getExampleName() + "\" to datasource.");
        return 1;
    }

    @Override
    public void update(Example example) {
        System.out.println("Saving example #" + example.getId() + ".");
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting example #" + id);
    }
}
