package com.cn.controller;

import com.cn.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Syen
 * @date 2019/7/29 0029-下午 13:14
 */
/*JSON数据返回前台以及如何解析*/
//@Controller
@RestController//:相当于@Controller+@ResponseBody放在类上,那么类内的@ResponseBody就可以不要
@RequestMapping("/json")
public class UserJsonController {

    @RequestMapping("/user")
   // @ResponseBody//这个注解将知道现在返回的不是视图，它会将数据转换为json格式。
    public User userFuction(){
        User user=new User();
        user.setName("小强");
        user.setPassword("9527");


        return user;
    }

    @RequestMapping("/one")
   // @ResponseBody//这个注解将知道现在返回的不是视图，它会将数据转换为json格式。
    public Map<String,Object> userMap(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","徐慧");
        map.put("age",28);


        return map;
    }

    @RequestMapping("/two")
   // @ResponseBody//这个注解将知道现在返回的不是视图，它会将数据转换为json格式。
    public User[] shuzu(){
        User user=new User();
        user.setName("晨曦");
        user.setPassword("147");

        User user1=new User();
        user1.setName("李科");
        user1.setPassword("258");

        return new User[]{user,user1};



    }
    @RequestMapping("/three")
   // @ResponseBody
    public List<User> userList(){

           List<User> list=new ArrayList<>();

        User user=new User();
        user.setName("波克");
        user.setPassword("369");

        User user1=new User();
        user1.setName("郭溪");
        user1.setPassword("456");

        list.add(user);
        list.add(user1);

        return list;

    }

    @RequestMapping("/four")
    public List<Map<String,User>> userListMap(){

        List<Map<String,User>> list=new ArrayList<>();

        User user=new User();
        user.setName("波克");
        user.setPassword("369");

        User user1=new User();
        user1.setName("郭溪");
        user1.setPassword("456");


        Map<String,User> m=new HashMap<>();
        m.put("user",user);
        m.put("user1",user1);

        Map<String,User> m2=new HashMap<>();
        User u3=new User();
        u3.setName("琳琳");
        u3.setPassword("576h");

        User u4=new User();
        u4.setName("妹妹");
        u4.setPassword("14uhd");

        m2.put("user",u3);
        m2.put("user1",u4);
        list.add(m);
        list.add(m2);

        return list;

    }

}
