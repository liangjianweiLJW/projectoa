package com.zmh.projectoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @Author: ZMH 
 * @Date: 2018/2/9 22:49
 * 主页的Controller
 */
@Controller
public class IndexController {
    /**
     * 主页
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    /**
     * 日历页面
     */
    @RequestMapping(value = "/calendar")
    public String calendar(){
        return "calendar";
    }

    /**
     * 人员信息
     */
    @RequestMapping(value = "/userinfos")
    public String userinfos(){
        return "tables";
    }

    /**
     * 个人信息
     */
    @RequestMapping(value = "/user")
    public String user(){
        return "form";
    }

    /**
     * 站内信箱
     */
    @RequestMapping(value = "/mail")
    public String mail(){
        return "table-list";
    }

    /**
     * 通知公告
     */
    @RequestMapping(value = "/messages")
    public String messages(){
        return "table-list";
    }

    /**
     * 通用错误页面
     */
    @RequestMapping(value = "/404")
    public String error(){
        return "404";
    }
}
