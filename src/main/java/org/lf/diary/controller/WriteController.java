package org.lf.diary.controller;

import org.lf.diary.model.DiaryBookVO;
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
 * @DateTime: 2020/1/14 15:30
 * @Description: TODO
 */
@Controller
public class WriteController {


    @Autowired
    private DiaryBookService diaryBookService;

    @RequestMapping("/home/write")
    public String write(Model model, HttpServletRequest request) {
        User user = (User)request.getSession().getAttribute("user");
        List<DiaryBookVO> diaryBookVOList = diaryBookService.getAllTitle(user.getId());
        model.addAttribute("diaryBookVOList",diaryBookVOList);
        model.addAttribute("title","home");
        model.addAttribute("action","4");
        return "write";
    }


}
