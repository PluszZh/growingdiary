package org.lf.diary.controller.college;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jvinh
 * @DateTime: 2020/2/11 14:34
 * @Description: TODO
 */
@Controller
@RequestMapping("/college")
public class CollegeIndex {

    @RequestMapping("/activity")
    public String index(Model model) {

        model.addAttribute("title","college");
        return "college";
    }

    @RequestMapping("/college/activity/{actId}")
    public String activity(Model model,@PathVariable("actId") String actId) {

        model.addAttribute("title","college");



        return "college";
    }
}
