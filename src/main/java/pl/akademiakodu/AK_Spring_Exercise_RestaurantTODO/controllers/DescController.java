package pl.akademiakodu.AK_Spring_Exercise_RestaurantTODO.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescController {

    @GetMapping("/desc") public String descGet(){
        // test
        return "desc";
    }

}
