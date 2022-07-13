package net.code.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private LibraryService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Library> listLibrarys = service.listAll();
        model.addAttribute("listLibrarys", listLibrarys);
        return "index";
    }
}
