package com.example.demorest.service.impl;

import com.example.demorest.model.demoModel;
import com.example.demorest.repository.demoRepository;
import com.example.demorest.service.demoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class demoServiceImpl implements demoService {
    demoRepository demorepository;
    public demoServiceImpl(demoRepository demorepository) {
        this.demorepository = demorepository;
    }

    @Override
    public demoModel getDemo(Long id) {
        return demorepository.findById(id).get();
    }

    @Override
    public String createDemo(demoModel demomodel) {
        demorepository.save(demomodel);
        return "Successfully Inserted or created";
    }

    @Override
    public String updateDemo(demoModel demomodel) {
        demorepository.save(demomodel);
        return "successfully updated";
    }

    @Override
    public String deleteDemo(Long id) {
        demorepository.deleteById(id);
        return "Deleted successfully";
    }

    @Override
    public List<demoModel> getAllDemo() {
        return demorepository.findAll();
    }
}
