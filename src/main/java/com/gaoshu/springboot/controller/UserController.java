package com.gaoshu.springboot.controller;

import com.gaoshu.springboot.bean.User;
import com.gaoshu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
   @Autowired
    private UserService userService;
    @RequestMapping("/selectUserList")
    public String selectUserList(Model model) {
        List<User> users = userService.selectUserList();
        model.addAttribute("users",users);
        return "list";
    }
}
