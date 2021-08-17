package di.uoa.jobfinder.web;


import di.uoa.jobfinder.entities.User;
import di.uoa.jobfinder.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/register")
    public String registerView(ModelMap model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping(value = "/register")
    public String registerPost(User user) {
        User savedUser = userService.save(user);
        //System.out.println("Saved user is" + savedUser);
        return "redirect:/Dashboard";
    }
}
