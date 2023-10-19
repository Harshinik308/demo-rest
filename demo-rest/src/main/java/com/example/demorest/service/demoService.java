package com.example.demorest.service;

import com.example.demorest.model.demoModel;

import java.util.List;

public interface demoService {
    public demoModel getDemo(Long id);
    public String createDemo(demoModel demomodel);
    public String updateDemo(demoModel demomodel);
    public String deleteDemo(Long id);
    public List<demoModel> getAllDemo();
}
