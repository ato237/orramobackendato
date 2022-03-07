package ato.orramo.orramobackend.currency.service;

import com.posadskiy.currencyconverter.CurrencyConverter;
import com.posadskiy.currencyconverter.config.ConfigBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ConvertService {
    Convert convert = new Convert();

    public List<Convert> getConvertedValue(Double amount, String from, String to){
        convert.setAmount(amount);
        convert.setFrom(from);
        convert.setTo(to);
        convert.getConvertedValue(amount,from,to);
        return List.of(new Convert(convert.getAmount(), convert.getResults(),convert.getFrom(),convert.getTo(),false));
    }



}
