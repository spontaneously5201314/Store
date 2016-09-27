package com.spon.login.web;

import com.spon.login.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by myg on 2016/9/22.
 */
@Controller
//@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login/listUsers")
    public String listUsers(@RequestParam String username, @RequestParam String password){
        ModelAndView view = new ModelAndView();
//        List<User> list = userService.listUsers();
//        view.addObject("users", list);
//        view.setViewName("listUsers");

//        return "success";
//        return new ModelAndView("redirect:/success");
        System.out.println("username:" + username + ",and password:" + password);
//        System.out.println("listUsers has been called");
//        view.setViewName("/WEB-INF/jsp/success");
//        return view;
        return "success";
    }
}
