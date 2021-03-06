package com.yixing.user.security.authentication;

import com.alibaba.fastjson.JSONObject;
import com.yixing.user.model.ResultData;
import com.yixing.user.model.StatusCode;
import com.yixing.user.security.SecurityConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 默认认证成功处理
 * @author hyh
 * @since 2019/5/8 23:30
 */
@Slf4j
@Component
public class DefaultAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        String username = ((User) authentication.getPrincipal()).getUsername();
        try {
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(JSONObject.toJSONString(new ResultData(0, StatusCode.OK,SecurityConstants.LOGIN_SUCCESS_URL,username)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
