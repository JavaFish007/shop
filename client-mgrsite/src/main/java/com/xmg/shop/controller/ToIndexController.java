package com.xmg.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
@Controller
public class ToIndexController {

    @RequestMapping("main")
    public String toIndex(){
        return "main";
    }
}
