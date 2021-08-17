package di.uoa.jobfinder.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashBoardController {
    @GetMapping(value = "/")
    public String rootView(){return "index";}

    @GetMapping(value = "/Dashboard")
    public String dashboardView() {
        return "Dashboard";
    }



}
