package kg.it.receptionoffice.controller.catalogs;

import kg.it.receptionoffice.model.Citizenship;
import kg.it.receptionoffice.service.CitizenshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/citizenship")
public class CitizenshipController {

    private final CitizenshipService cityzenshipService;
    @Autowired
    public CitizenshipController(CitizenshipService citizenshipService) {
        this.cityzenshipService = citizenshipService;
    }


    @GetMapping("/view")
    public String getUsers(Model model) throws SQLException {
        model.addAttribute("citizenship" , cityzenshipService.getAllCitizenship());
        return "/dictionaries/citizenshipView";
    }


    @GetMapping("/new")
    public ModelAndView newUser() {

        return new ModelAndView("dictionaries/citizenship/citizenshipCreate")
                .addObject("citizenship", new Citizenship());
    }

    @PostMapping( "/new")
    public String saveUser(@ModelAttribute @Valid Citizenship citizenship, BindingResult result)  {
        cityzenshipService.saveCitizenship(citizenship);
        return "redirect:/view";
    }
}
