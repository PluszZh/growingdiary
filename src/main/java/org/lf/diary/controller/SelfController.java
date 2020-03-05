package org.lf.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jvinh
 * @DateTime: 2020/1/21 15:25
 * @Description: TODO
 */

@Controller
public class SelfController {

    @RequestMapping("/self")
    public String self(Model model) {

        model.addAttribute("title","home");
        model.addAttribute("action","5");
        return "self";
    }
}
