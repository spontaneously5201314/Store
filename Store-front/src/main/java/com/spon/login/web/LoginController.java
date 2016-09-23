package com.spon.login.web;

import com.spon.login.service.impl.UserService;
import com.spon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by myg on 2016/9/22.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "listUsers", method = RequestMethod.POST)
    public ModelAndView listUsers(){
        ModelAndView view = new ModelAndView();
        List<User> list = userService.listUsers();
        view.addObject("users", list);
        view.setViewName("listUsers");
        return view;
    }
}
