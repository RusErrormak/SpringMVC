package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "0") Integer count, ModelMap model) {
        CarServiceImpl carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
