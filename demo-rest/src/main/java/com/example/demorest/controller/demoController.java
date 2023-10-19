package com.example.demorest.controller;

import com.example.demorest.service.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demorest.model.demoModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class demoController {
    @Autowired
    private demoService demoservice;
    @GetMapping("{id}")
    public demoModel getDetails(@PathVariable("id")Long id){
        return demoservice.getDemo(id);
//        return new demoModel(1L,"Harshini",20);
    }
    @GetMapping
    public List<demoModel> getAllDetails(){
        return demoservice.getAllDemo();
    }
    @PostMapping
    public String createDetails(@RequestBody demoModel demomodel){
        demoservice.createDemo(demomodel);
        return "Created Successfully";
    }
    @PutMapping
    public String updateDetails(@RequestBody demoModel demomodel){
        demoservice.updateDemo(demomodel);
        return "updated Successfully";
    }

    @DeleteMapping("{id}")
    public String deleteDetails(@PathVariable("id")Long id){
        demoservice.deleteDemo(id);
        return "deleted Successfully";
    }


}
