package com.auge.base.service;

import com.auge.base.api.DemoService;
import com.auge.base.dto.UserDto;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author machunlin
 * @date 2019/6/6
 */
@Service(validation = "true")
public class DemoServiceImpl implements DemoService {
    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public UserDto sayHello(String name) {
        return new UserDto().setName(name).setAge(22);
    }

    @Override
    public UserDto haha(UserDto userDto) {
        return userDto;
    }

    @Override
    public String test(String name) {
        System.out.println("---------------------" + name);
        return name;
    }
}
