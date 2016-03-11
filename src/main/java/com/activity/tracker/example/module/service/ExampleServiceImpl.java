package com.activity.tracker.example.module.service;

import com.activity.tracker.example.module.dao.ExampleDAO;
import com.activity.tracker.example.module.model.Example;

public class ExampleServiceImpl implements ExampleService {
    private ExampleDAO exampleDAO;

    public ExampleServiceImpl(ExampleDAO exampleDAO) {
        this.exampleDAO = exampleDAO;
    }

    @Override
    public Example get(int id) {
        System.out.println("Doing some business stuff in the service to get example.");
        return exampleDAO.get(id);
    }

    @Override
    public int save(Example example) {
        System.out.println("Doing some business stuff in the service to save a new example.");
        return exampleDAO.save(example);
    }

    @Override
    public void update(Example example) {
        System.out.println("Doing some business stuff in the service to update an existing example.");
        exampleDAO.update(example);
    }

    @Override
    public void delete(int id) {
        System.out.println("Doing some business stuff in the service to delete an example.");
        exampleDAO.delete(id);
    }
}
