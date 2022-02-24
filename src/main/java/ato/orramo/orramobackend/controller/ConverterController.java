package ato.orramo.orramobackend.controller;

import ato.orramo.orramobackend.currency.service.Convert;
import ato.orramo.orramobackend.currency.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(path = "api/converter/")
public class ConverterController {
    private final ConvertService convertService;
    @Autowired
    public ConverterController(ConvertService convertService) {
        this.convertService = convertService;
    }
    @PostMapping({"convert/{amount}/{from}/{to}"})
    public List<Convert> getConvertedValue(@PathVariable Double amount, @PathVariable String from, @PathVariable String to){
        return convertService.getConvertedValue(amount,from,to);
    }
}
