package com.cn.controller;

import com.cn.pojo.AppAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syen
 * @date 2019/7/29 0029-下午 12:08
 */
@Controller
@RequestMapping("/appAccount")
public class AppAccountController {

    @RequestMapping("/index")
    public String index(Model model){

        List<AppAccount> appAccountList=new ArrayList<>();
        AppAccount appAccount=new AppAccount(1,"小草","nice");
        AppAccount appAccount1=new AppAccount(2,"小明","good");

        appAccountList.add(appAccount);
        appAccountList.add(appAccount1);

        model.addAttribute("appAccount",appAccountList);


        return "appAccount/index";
    }

}
