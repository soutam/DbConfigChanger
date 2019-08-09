package com.sp.dbConfigChanger.controller;

import com.sp.dbConfigChanger.service.ConfigChangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sp.dbConfigChanger.constants.DbConfigChangerConstants;
@RestController
public class ConfigChangeRequestController {

    @Autowired
    private ConfigChangerService configChangerService;


    @GetMapping(DbConfigChangerConstants.GET_CONFIG_DETAILS)
    public void getConfigDetail(){

        System.out.println("hi I reached the controller");
        configChangerService.testMethod();
    }

}
