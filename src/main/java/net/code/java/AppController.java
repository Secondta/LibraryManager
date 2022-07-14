package net.code.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("/new")
    public String showNewLibraryForm(Model model){
    Library library = new Library();
        model.addAttribute("library", library);

        return "new";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Library library) {
        service.save(library);

        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit");
        Library library = service.get(id);
        mav.addObject("library", library);

        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String deleteLibrary(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
}
