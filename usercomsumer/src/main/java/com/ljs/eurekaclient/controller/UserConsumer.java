package com.ljs.eurekaclient.controller;

import com.ljs.domain.CommonResult;
import com.ljs.domain.User;
import com.ljs.eurekaclient.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljs
 * @since 2021/7/10 上午12:24
 **/

@RestController("/my")
public class UserConsumer {

    @Autowired
    UserService userService;

    @GetMapping("/1")
    public CommonResult<User> my() {
        System.out.println(userService.getUser(2L));
        return userService.getUser(2L);
    }

}
