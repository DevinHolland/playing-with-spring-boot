package com.activity.tracker.example.module.dao;

import com.activity.tracker.example.module.model.Example;

public interface ExampleDAO {
    Example get(int id);
    int save(Example example);
    void update(Example example);
    void delete(int id);
}
