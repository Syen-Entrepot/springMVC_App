package com.cn.controller;

import com.cn.constant.ResponseCode;
import com.cn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Syen
 * @date 2019/7/29 0029-下午 18:28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/check")
    @ResponseBody
    public Map<String,Integer> checkName(@RequestBody User user){

        Map<String,Integer> map=new HashMap<>();
        int code=ResponseCode.HAS_USE;//400可以代表名字不可用
        if(user.getName().equals("小草")){
            code=ResponseCode.CAN_USE;
        }
        map.put("code",code);

        return map;

    }
}
