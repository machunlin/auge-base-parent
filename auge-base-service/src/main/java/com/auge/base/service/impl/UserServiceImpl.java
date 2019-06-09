package com.auge.base.service.impl;

import com.auge.base.mapper.UserMapper;
import com.auge.base.model.User;
import com.auge.base.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author machunlin
 * @date 2019-06-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

//    @Autowired
//    private UserMapper userMapper;

}
