package com.yixing.user.dao;

import com.yixing.user.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author hyh
 * @since 2019-05-08
 */
@Mapper
public interface UserExtMapper {
    SysUser getByUserName(String username);
}
