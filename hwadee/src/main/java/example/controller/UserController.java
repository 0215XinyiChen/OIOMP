package example.controller;

import example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import example.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/index.html")
    public String tologin() {
        return "login";
    }


    @RequestMapping(value = "/login")
    public String login(User user, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        boolean isValidUser = userService.Match(user.getUserName(), user.getUserPwd());
        if (isValidUser) {
            //request.getSession().setAttribute("user", user.getUserName() + ":登录成功233");
            return "Bar";
        } else {
            PrintWriter out=response.getWriter();
            out.print("<script>alert('用户名或密码错误');</script>");
            out.flush();
            return "login";
        }
    }

    @RequestMapping("/insert")
    public String InsertUser(User user, Model model) {
        userService.InsertUser(user.getUserName(), user.getUserPwd());
        //model.addAttribute("Insert", "注册成功");
        return "login";
    }

    @RequestMapping("/insertPage")
    public String InsertPage() {
        return "register";
    }

}
