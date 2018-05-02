package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import app.models.Sample;
import app.services.SampleService;
import app.models.User;

@RestController
@RequestMapping("api/sample")
public class SampleController extends CrudController<Sample, SampleService> {
    
    @Autowired
    @Override
    public void setService(SampleService service) {
        this.service = service;
    }

    @Override
    public Boolean isAuthorized(Long entityId, SampleService service) {
        return true;
    }


    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(Object myobj) {
        System.out.println("Adding user dtl....");
        //return "user/login";
        return "";
    }


}
