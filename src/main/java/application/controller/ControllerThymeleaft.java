package application.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerThymeleaft {

    @RequestMapping(value = "/")
    public String welcome(Model model) {
        return "index";
    }

    @RequestMapping(value = "/about")
    public String about(Model model) {
        return "about";
    }

    @RequestMapping(value = "/contact")
    public String contact(Model model) {
        return "contact";
    }

    @RequestMapping(value = "/icons")
    public String icons(Model model) {
        return "icons";
    }

    @RequestMapping(value = "/mens")
    public String mens(Model model) {
        return "mens";
    }

    @RequestMapping(value = "/single")
    public String single(Model model) {
        return "single";
    }

    @RequestMapping(value = "/typography")
    public String typography(Model model) {
        return "typography";
    }

    @RequestMapping(value = "/womens")
    public String womens(Model model) {
        return "womens";
    }

    @RequestMapping(value = "/manager_employee")
    public String managerEmployee() {
        return "/manager_employee";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }


}

