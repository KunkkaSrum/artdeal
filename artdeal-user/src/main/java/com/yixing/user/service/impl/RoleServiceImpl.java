package com.yixing.user.service.impl;

import com.yixing.user.dao.RoleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixing.user.entity.Role;
import com.yixing.user.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyh
 * @since 2019-05-08
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
