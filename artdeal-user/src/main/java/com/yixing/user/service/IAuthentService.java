package com.yixing.user.service;

import com.yixing.user.vo.AuthVo;

import java.util.List;

public interface IAuthentService  {
    List<AuthVo> listHasPower(Integer id);
    List<AuthVo> listNav(Integer zindex);
}
