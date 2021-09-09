package chinh.anh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChinhController {
    @GetMapping("/chinh")
    public String helloWorld( Model model){
        String name = "Binh";
     model.addAttribute("name", name);
        return "chinh";
    }
}
