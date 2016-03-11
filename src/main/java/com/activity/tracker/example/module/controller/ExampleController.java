package com.activity.tracker.example.module.controller;

import com.activity.tracker.example.module.model.Example;
import com.activity.tracker.example.module.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/example")
public class ExampleController {
    private ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Example getExample(@PathVariable("id") int id){
        return exampleService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int saveExample(@RequestBody Example example){
        return exampleService.save(example);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateExample(@RequestBody Example example) {
        exampleService.update(example);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void updateExample(@PathVariable("id") int id) {
        exampleService.delete(id);
    }
}
