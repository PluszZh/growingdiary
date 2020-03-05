package org.lf.diary.controller;

import org.lf.diary.model.DiaryBook;
import org.lf.diary.model.User;
import org.lf.diary.service.DiaryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: Jvinh
 * @DateTime: 2020/1/14 15:15
 * @Description: TODO
 */

@Controller
public class HomeController {

    @Autowired
    private DiaryBookService diaryBookService;

    @RequestMapping("home")
    public String home(Model model, HttpServletRequest request) {
        User user = (User)request.getSession().getAttribute("user");
        if(user == null) {
           return "redirect:/";
        }
        List<DiaryBook> diaryBookList = diaryBookService.findAll(user.getId());
        model.addAttribute("diaryBookList",diaryBookList);
        model.addAttribute("title","home");
        model.addAttribute("action","1");

        return "home";
    }


}
