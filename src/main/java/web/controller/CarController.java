package web.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import web.config.AppConfig;
import web.config.WebConfig;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "0") Integer count, ModelMap model) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            CarService carService = context.getBean(CarService.class);
            model.addAttribute("cars", carService.getCars(count));
        }
        return "cars";
    }
}
