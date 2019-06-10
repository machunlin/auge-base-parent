package com.auge.base.mapper;

import com.auge.base.model.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author machunlin
 * @date 2019-06-09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
