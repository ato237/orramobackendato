package ato.orramo.orramobackend.currency.source;


import com.posadskiy.currencyconverter.Messages;
import com.posadskiy.currencyconverter.exception.CurrencyConverterException;
import com.posadskiy.currencyconverter.util.NetworkUtils;

import java.io.IOException;

public class CurrencyConverterCountrySource implements CountrySource {
    public static final String SERVICE_NAME = "CurrencyConverterApi.com";

    public String country(String apiKey) throws IOException{
        String collected = NetworkUtils.getBufferReaderByUrl(getUrlString(apiKey), true);

        String[] splitCountryInfo = collected.split(":");
        if(splitCountryInfo.length != 2) {
            throw new CurrencyConverterException(Messages.getServiceUnavailableMessage(SERVICE_NAME));
        }

        return splitCountryInfo[1];
    }

    private String getUrlString(String apiKey){
        return "/api/v7/currencies?apiKey="+ apiKey;
    }
}
