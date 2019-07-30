package com.cn.controller;

import com.cn.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Syen
 * @date 2019/7/29 0029-下午 13:14
 */
/*JSON数据如何使用Ajax提交到后台，后台如何解析*/
//@Controller
@RestController//:相当于@Controller+@ResponseBody放在类上,那么类内的@ResponseBody就可以不要
@RequestMapping("/json2")
public class UserJson_houtaiController {
       //前台如何提交一个user对象过来
    @RequestMapping("/add")
    //User user入参只能处理表单提交的数据,要通过@RequestBody注解才行
       public String add(@RequestBody User user){



        System.out.println(user.getName()+user.getPassword());


           return "msg";
       }
    @RequestMapping("/addList")
    //User user入参只能处理表单提交的数据,要通过@RequestBody注解才行
    public Map<String,Integer> addList(@RequestBody List<User> list){

        Map<String,Integer> map=new HashMap<>();
        System.out.println(list);
        map.put("code",2000);

        return map;
    }


}
