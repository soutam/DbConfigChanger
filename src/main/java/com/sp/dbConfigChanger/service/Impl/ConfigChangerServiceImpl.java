package com.sp.dbConfigChanger.service.Impl;

import com.sp.dbConfigChanger.service.ConfigChangerService;
import org.springframework.stereotype.Service;

@Service
public class ConfigChangerServiceImpl implements ConfigChangerService {
    @Override
    public void testMethod() {
        System.out.println("I have reached Service");
    }
}
