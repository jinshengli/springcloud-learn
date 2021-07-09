package com.ljs.eurekaclient.userservice;

import com.ljs.domain.CommonResult;
import com.ljs.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ljs
 * @since 2021/7/10 上午12:21
 **/

@FeignClient(value = "user-service")
public interface UserService {

    @RequestMapping(value = "/user/{id}")
    CommonResult<User> getUser(@PathVariable Long id);
}
