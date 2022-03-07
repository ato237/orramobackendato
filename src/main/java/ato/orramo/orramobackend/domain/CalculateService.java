package ato.orramo.orramobackend.domain;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateService {
    Calculate cal = new Calculate();
    public List<Calculate> getOrangeValue(long value, String status){
        cal.setStatus(status);
        cal.setOrangeValue(value);
        return List.of(new Calculate(cal.getOrangeValue(),
                cal.getOrangeTotal(),
                cal.getOrangeCharge(),cal.getStatus(), cal.getOrangeTax(), false) );
    }
    public List<Calculate> getMtnValue(long value, String status){
        cal.setStatus(status);
        cal.setMtnValue(value);
        return List.of(new Calculate( cal.getStatus(), cal.getMtnTotal(),cal.getMtnCharge(),cal.getMtnTax(),cal.getMtnValue(),false));
    }

    public List<Calculate> getEuValue(long value, String status){
        cal.setStatus(status);
        cal.setEuValue(value);
        return List.of(new Calculate(
                cal.getEuTotal(),cal.getEuCharge(),
                cal.getEuTax(),cal.getEuTotal(),cal.getStatus(), false));
    }

}
