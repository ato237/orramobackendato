package ato.orramo.orramobackend.currency.service;

import com.posadskiy.currencyconverter.CurrencyConverter;
import com.posadskiy.currencyconverter.config.ConfigBuilder;

import java.math.BigDecimal;

public class Convert {


    public static final String CURRENCY_CONVERTER_API_API_KEY = "90ceb4238b7f49609b7e5f61f4666aac";

    CurrencyConverter converter = new CurrencyConverter(
            new ConfigBuilder()
                    .currencyConverterApiApiKey(CURRENCY_CONVERTER_API_API_KEY)
                    .build()
    );

    private Double Amount;
    private BigDecimal Results;
    private String from;
    private String to;

    public Convert(){

    }

    public Convert(Double amount, BigDecimal results, String from, String to) {
        Amount = amount;
        Results = results;
        this.from = from;
        this.to = to;
    }

    public void getConvertedValue(Double amount,String from, String to){
        Double FromToRate = converter.rate(from, to);
        Double converted = amount * FromToRate;
        BigDecimal result =  new BigDecimal(converted);
    BigDecimal truncatedResult = result.setScale(2,BigDecimal.ROUND_DOWN);
        setResults(truncatedResult);
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public BigDecimal getResults() {
        return Results;
    }

    public void setResults(BigDecimal results) {
        Results = results;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
