package org.three.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.three.service.TestService;

public class TestServiceImpl implements TestService {
    public String userList(String name) {
        return name;
    }
}
