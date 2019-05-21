package com.joe.web;

import com.joe.entity.ApiResponse;
import com.joe.service.IUserService;
import com.joe.util.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:joe
 * @date:2019/5/20 19:38
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public ApiResponse getUser(){
        return ApiResponseUtil.getApiResponse(userService.getUserByLoginName(""));
    }
}
