package com.yixing.user.service.impl;

import com.yixing.user.dao.PermissionMapper;
import com.yixing.user.dao.UserExtMapper;
import com.yixing.user.dao.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixing.user.entity.SysUser;
import com.yixing.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author hyh
 * @since 2019-05-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserExtMapper userExtMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public SysUser getByUserName(String username) {
        return userExtMapper.getByUserName(username);
    }

    @Override
    public IPage<SysUser> selectPage(SysUser sysUser, int page, int size) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>(sysUser);
        Page<SysUser> page1 = new Page<>();
        page1.setCurrent(page);
        page1.setSize(size);
        return userMapper.selectPage(page1,queryWrapper);
    }
}
