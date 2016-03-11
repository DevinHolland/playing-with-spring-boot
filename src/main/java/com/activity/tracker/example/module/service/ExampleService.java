package com.activity.tracker.example.module.service;

import com.activity.tracker.example.module.model.Example;

public interface ExampleService {
    Example get(int id);
    int save(Example example);
    void update(Example example);
    void delete(int id);
}
