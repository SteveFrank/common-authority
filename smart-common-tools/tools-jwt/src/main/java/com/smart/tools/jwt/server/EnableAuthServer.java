package com.smart.tools.jwt.server;

import com.smart.tools.jwt.server.configuration.AuthServerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用 认证服务 的服务端配置
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AuthServerConfiguration.class)
@Documented
@Inherited
public @interface EnableAuthServer {
}
