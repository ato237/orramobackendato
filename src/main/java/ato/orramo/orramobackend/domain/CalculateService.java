package ato.orramo.orramobackend.domain;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateService {
    Calculate cal = new Calculate();
    public List<Calculate> getOrangeValue(int value, String status){
        cal.setStatus(status);
        cal.setOrangeValue(value);
        return List.of(new Calculate(cal.getOrangeValue(),
                cal.getMtnValue(),cal.getMtnCharge(),
                cal.getMtnTotal(),cal.getOrangeTotal(),
                cal.getOrangeCharge(),cal.getStatus(), cal.getMtnTax(),cal.getOrangeTax(),
                cal.getEuTax(),cal.getEuValue(),cal.getEuTotal(),cal.getEuCharge()) );
    }
    public List<Calculate> getMtnValue(int value, String status){
        cal.setStatus(status);
        cal.setMtnValue(value);
        return List.of(new Calculate(cal.getOrangeValue(),
                cal.getMtnValue(),cal.getMtnCharge(),
                cal.getMtnTotal(),cal.getOrangeTotal(),cal.getOrangeCharge(),
                cal.getStatus(), cal.getMtnTax(),cal.getOrangeTax(),cal.getEuTax(),
                cal.getEuValue(),cal.getEuTotal(),cal.getEuCharge()));
    }

    public List<Calculate> getEuValue(int value, String status){
        cal.setStatus(status);
        cal.setEuValue(value);
        return List.of(new Calculate(cal.getOrangeValue(),
                cal.getMtnValue(),cal.getMtnCharge(),
                cal.getMtnTotal(),cal.getOrangeTotal(),cal.getOrangeCharge(),
                cal.getStatus(), cal.getMtnTax(),cal.getOrangeTax(),cal.getEuTax(),
                cal.getEuValue(),cal.getEuTotal(),cal.getEuCharge()));
    }

}
