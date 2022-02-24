package ato.orramo.orramobackend.currency.source;

import java.io.IOException;

public interface CountrySource {
    String country(String apiKey) throws IOException;
}
