package org.lf.diary.controller.chat;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @GetMapping("/showchat")
    public String index(){
        return "chat/index.html";
    }

}
