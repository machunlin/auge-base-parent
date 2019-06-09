package com.auge.base.api;

import com.auge.base.dto.UserDto;
import com.auge.base.model.User;
import com.auge.base.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author machunlin
 * @date 2019/6/9
 */
@Service(validation = "true")
public class DemoServcieApi implements DemoService {
    @Autowired
    private UserService userService;

//    @Autowired
//    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public UserDto addUser(String name) {
        User user = new User();
        user.setAge(11);
        user.setName(name);
//        userMapper.insert(user);
        userService.insert(user);

        UserDto dto = new UserDto();
        BeanUtils.copyProperties(user, dto);
        return dto;
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
