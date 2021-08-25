package ato.orramo.orramobackend.controller;

import ato.orramo.orramobackend.domain.Calculate;
import ato.orramo.orramobackend.domain.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/calculate")
public class CalculateController {
    private final CalculateService calculateService;
   private Calculate calculate;

    @Autowired
    public CalculateController(CalculateService calculateService, Calculate calculate){
        this.calculateService = calculateService;
        this.calculate = calculate;
    }

    @PostMapping({"orange/{value}/{status}"})
    public List<Calculate> getOrangeCharge(@PathVariable int value, @PathVariable String status){
        return calculateService.getOrangeValue(value,status);
    }
    @PostMapping({"mtn/{value}/{status}"})
    public List<Calculate> getMtnCharge(@PathVariable int value, @PathVariable String status){
        return calculateService.getMtnValue(value,status);
    }
}
