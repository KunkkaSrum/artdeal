package com.yixing.user.service.impl;

import com.yixing.user.dao.OperateLogMapper;
import com.yixing.user.service.IOperateLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixing.user.entity.OperateLog;
import org.springframework.stereotype.Service;

@Service
public class OperateLogServiceImpl extends ServiceImpl<OperateLogMapper, OperateLog>  implements IOperateLogService {
}
