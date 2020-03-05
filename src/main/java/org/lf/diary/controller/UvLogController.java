package org.lf.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jvinh
 * @DateTime: 2020/1/31 23:17
 * @Description: TODO
 */

@Controller
public class UvLogController {

    @RequestMapping("/uvLog")
    public String uvLog(Model model) {
        model.addAttribute("action","7");
        return "uvLog";
    }
}
