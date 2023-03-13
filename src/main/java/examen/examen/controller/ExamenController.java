package examen.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ExamenController {

@GetMapping("/")
public ModelAndView index() {
    ModelAndView mav = new ModelAndView("index");
    
    return mav;
    }

@PostMapping("/api/ALUMNOS/LIST")
public ModelAndView list() {
    ModelAndView mav = new ModelAndView("list");
    
    return mav;
    }
}
