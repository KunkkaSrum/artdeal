package com.yixing.user.security.authentication;

import com.yixing.user.security.SecurityConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 默认的退出处理逻辑
 * @author hyh
 * @since 2019/1/10 21:49
 */
@Slf4j
@Component
public class DefaultLogoutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        try{
            response.sendRedirect(SecurityConstants.UN_AUTHENTICATION_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
