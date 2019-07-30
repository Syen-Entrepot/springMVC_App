package com.cn.controller;

import com.cn.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Syen
 * @date 2019/7/29 0029-下午 19:23
 */
@Controller
@RequestMapping("/xml")
public class XmlController {

//produces描述产生的类型，返回类型的描述，返回什么数据
    @RequestMapping(value = "/m1",produces ={MediaType.APPLICATION_XML_VALUE} )
    @ResponseBody
    public User m1(){
        //将数据转换为xml形式user
        User user=new User();
        user.setName("小猪");
        user.setPassword("bad");



        return user;
    }



}
