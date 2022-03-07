package ato.orramo.orramobackend.domain;

import org.springframework.stereotype.Service;

@Service
public class Calculate {

    private long mtnTax;
    private long orangeTax;
    private long orangeValue;
    private long mtnValue;
    private long mtnCharge;
    private long mtnTotal;
    private long orangeTotal;
    private long OrangeCharge;
    private String status;
    private long euTax;
    private long euValue;
    private long euTotal;
    private long euCharge;
    private Boolean update;


    public Calculate() {

    }

    public Calculate(long orangeValue, long mtnValue, long mtnCharge,
                     long mtnTotal, long orangeTotal,
                     long OrangeCharge, String status, long mtnTax, long orangeTax, long euTax, long euValue,
                     long euTotal, long euCharge, Boolean update) {
        this.orangeValue = orangeValue;
        this.mtnValue = mtnValue;
        this.mtnCharge = mtnCharge;
        this.mtnTotal = mtnTotal;
        this.mtnTax = mtnTax;
        this.orangeTax = orangeTax;
        this.orangeTotal = orangeTotal;
        this.OrangeCharge = OrangeCharge;
        this.status = status;
        this.euTax = euTax;
        this.euCharge = euCharge;
        this.euTotal = euTotal;
        this.euValue = euValue;
        this.update = update;
    }

    public Calculate(long orangeValue, long orangeTotal,
                     long OrangeCharge, String status, long orangeTax, Boolean update) {
        this.orangeValue = orangeValue;

        this.orangeTax = orangeTax;
        this.orangeTotal = orangeTotal;
        this.OrangeCharge = OrangeCharge;
        this.status = status;
        this.update = update;


    }

    public Calculate(String status, long mtnTotal,
                     long mtnCharge, long mtnTax, long mtnValue, Boolean update) {
        this.mtnValue = mtnValue;
        this.mtnTax = mtnTax;
        this.mtnTotal = mtnTotal;
        this.mtnCharge = mtnCharge;
        this.status = status;
        this.update = update;

    }
    public Calculate(long euTotal,
                     long euCharge, long euTax, long euValue,String status, Boolean update) {
        this.euValue = euValue;

        this.euTax = euTax;
        this.euTotal = euTotal;
        this.euCharge = euCharge;
        this.status = status;
        this.update = update;

    }




    public void setMtnCharge(long mtnCharge) {
        this.mtnCharge = mtnCharge;
    }

    public long getMtnTotal() {
        return mtnValue + mtnCharge;
    }

    public long getMtnTax() {
        return mtnTax;
    }

    public void setMtnTax(long mtnTax) {
        this.mtnTax = mtnTax;
    }

    public long getOrangeTax() {
        return orangeTax;
    }

    public void setOrangeTax(long orangeTax) {
        this.orangeTax = orangeTax;
    }

    public void setMtnTotal(long mtnTotal) {
        this.mtnTotal = mtnTotal;
    }

    public void setOrangeTotal(long orangeTotal) {
        this.orangeTotal = orangeTotal;
    }

    public void setOrangeCharge(long orangeCharge) {
        OrangeCharge = orangeCharge;
    }

    public long getOrangeValue() {
        return orangeValue;
    }

    public void setOrangeValue(long orangeValue) {
        this.orangeValue = orangeValue;
    }

    public long getMtnValue() {
        return mtnValue;
    }

    public void setMtnValue(long mtnValue) {
        this.mtnValue = mtnValue;
    }

    public long getOrangeTotal() {
        return OrangeCharge + orangeValue;
    }

    long getWithdrawCharge(long value) {

      double tax =  ( value * 0.2/100);
        if (value >= 50 && value <= 6500) {
            value = value * 3 / 100 + (long) tax;
        } else if (value >= 6501 && value <= 10000) {
            value = 175 + (long) tax;
        } else if (value >= 10001 && value <= 13500) {
            value = 300 + (long) tax;
        } else if (value >= 13501 && value <= 25000) {
            value = 350 + (long) tax;
        } else if (value >= 25001 && value <= 50000) {
            value = 700 + (long) tax;
        } else if (value >= 50001 && value <= 80000) {
            value = 1350 + (long) tax;
        } else if (value >= 80001 && value <= 100000) {
            value = 1800 + (long) tax;
        } else if (value >= 100001 && value <= 200000) {
            value = 2150 + (long) tax;
        } else if (value >= 200001 && value <= 300000) {
            value = 2600 + (long) tax;
        } else if (value >= 300001 && value <= 400000) {
            value = 3100 + (long) tax;
        } else if (value >= 400001 && value <= 500000) {
            value = 3600 + (long) tax;
        }
        else if(value<50){
            value = 0;
        }
        return value;
    }

    long getSendingCharge(long value) {
        double tax =  ( value * 0.2/100);
        if (value >= 50 && value <= 6500) {
            value = value * 1 / 100  + (long) tax ;
        } else if (value >= 6501 && value <= 10000) {
            value = 50 + (long) tax;
        } else if (value >= 10001 && value <= 13500) {
            value = 100 + (long) tax;
        } else if (value >= 13501 && value <= 50000) {
            value = 150 + (long) tax;
        }
        else if (value >= 50001 && value <= 80000) {
            value = 200 + (long) tax;
        } else if (value >= 80001 && value <= 400000) {
            value = 300 + (long) tax;
        } else if (value >= 400001 && value <= 1000000) {
            value = 500 + (long) tax;
        }
        else if(value<50){
            value = 0;
        }
        return value;

    }

    long getNonTransferOrange(long value) {
        double tax =  ( value * 0.2/100);

        if (value >= 50 && value <= 6500) {
            value = value * 4 / 100 + (long) tax;
        } else if (value >= 6501 && value <= 10000) {
            value = 250 + (long) tax;
        } else if (value >= 10001 && value <= 13500) {
            value = 400 + (long) tax;
        } else if (value >= 13501 && value <= 25000) {
            value = 525 + (long) tax;
        } else if (value >= 25001 && value <= 50000) {
            value = 900 + (long) tax;
        } else if (value >= 50001 && value <= 80000) {
            value = 1700 + (long) tax;
        } else if (value >= 80001 && value <= 100000) {
            value = 2300 + (long) tax;
        } else if (value >= 100001 && value <= 200000) {
            value = 2700 + (long) tax;
        } else if (value >= 200001 && value <= 300000) {
            value = 3100 + (long) tax;
        } else if (value >= 300001 && value <= 400000) {
            value = 3600 + (long) tax;
        } else if (value >= 400001 && value <= 500000) {
            value = 4000 + (long) tax;
        }
        else if(value<50){
            value = 0;
        }
        return value;
    }
    long getWithdrawMtn(long value) {

        double tax =  ( value * 0.2/100);
        if (value >= 100 && value <= 5999) {
            value = value * 3 / 100 + (long) tax;
        } else if (value >= 6000 && value <= 10050) {
            value = 175 + (long) tax;
        } else if (value >= 10051 && value <= 13550) {
            value = 300 + (long) tax;
        } else if (value >= 13551 && value <= 25050) {
            value = 350 + (long) tax;
        } else if (value >= 25051 && value <= 50050) {
            value = 700 + (long) tax;
        } else if (value >= 50051 && value <= 75100) {
            value = 1350 + (long) tax;
        } else if (value >= 75101 && value <= 100100) {
            value = 1800 + (long) tax;
        } else if (value >= 100101 && value <= 200500) {
            value = 2150 + (long) tax;
        } else if (value >= 200501 && value <= 300500) {
            value = 2600 + (long) tax;
        } else if (value >= 300501 && value <= 400500) {
            value = 3100 + (long) tax;
        } else if (value >= 400501 && value <= 500000) {
            value = 3500 + (long) tax;
        }
        else if(value<50){
            value = 0;
        }
        return value;
    }

    long getSendingMtn(long value) {
        double tax =  ( value * 0.2/100);
        if (value >= 100 && value <= 5999) {
            value = value * 1 / 100 + (long) tax;
        } else if (value >= 6000 && value <= 13550) {
            value = 100 + (long) tax;
        } else if (value >= 13551 && value <= 50050) {
            value = 150 + (long) tax;
        } else if (value >= 50051 && value <= 75100) {
            value = 200 + (long) tax;
        } else if (value >= 75101 && value <= 400500) {
            value = 300 + (long) tax;
        } else if (value >= 400501 && value <= 500000) {
            value = 400 + (long) tax;
        } else if (value >= 500001 && value <= 1000000){
            value =500 + (long) tax;
        }
        else if(value<100){
            value = 0;
        }
        return value;
    }

    long getNonTransferMTN(long value) {
        double tax =  ( value * 0.2/100);
        if (value >= 100 && value <= 100100) {
            value = value * 3 / 100 + (long) tax;
        } else if (value >= 100101 && value <= 200500) {
            value = 3100 + (long) tax;
        } else if (value >= 200501 && value <= 400500) {
            value = 3500 + (long) tax;
        } else if (value >= 400501 && value <= 500000) {
            value = 4000 + (long) tax;
        }
        else if(value<100){
            value = 0;
        }
        return value;
    }

    long getWithdrawEu(long value){
        if (value >= 100 && value <= 3000) {
            value = 100;
        } else if (value >= 3001 && value <= 10000) {
            value = 150 ;
        } else if (value >= 10001 && value <= 15000) {
            value = 350 ;
        } else if (value >= 15001 && value <= 20000) {
            value = 350 ;
        }  else if (value >= 20001 && value <= 25000) {
            value = 350 ;
        } else if (value >= 25001 && value <= 50000) {
            value = 650 ;
        } else if (value >= 50001 && value <= 80000) {
            value = 1350;
        } else if (value >= 80001 && value <= 100000) {
            value = 1650;
        } else if (value >= 100001 && value <= 200000) {
            value = 2100;
        } else if (value >= 200001 && value <= 300000) {
            value = 2300;
        } else if (value >= 300001 && value <= 400000) {
            value = 2400;
        } else if (value >= 400001 && value <= 500000) {
            value = 2500;
        }
        else if(value<50){
            value = 0;
        }
        return value;
    }

    long getSendingEU(long value) {
        value = 0;
        return value;
    }

    long getNonTransferEU(long value){
        if (value >= 100 && value <= 3000) {
            value = 150;
        } else if (value >= 3001 && value <= 10000) {
            value = 150 ;
        } else if (value >= 10001 && value <= 15000) {
            value = 400 ;
        }  else if (value >= 15001 && value <= 20000) {
            value = 500 ;
        } else if (value >= 20001 && value <= 25000) {
            value = 500 ;
        } else if (value >= 25001 && value <= 50000) {
            value = 900 ;
        } else if (value >= 50001 && value <= 80000) {
            value = 1400;
        } else if (value >= 80001 && value <= 100000) {
            value = 1900;
        } else if (value >= 100001 && value <= 200000) {
            value = 2200;
        } else if (value >= 200001 && value <= 300000) {
            value = 2300;
        } else if (value >= 300001 && value <= 400000) {
            value = 2400;
        } else if (value >= 400001 && value <= 500000) {
            value = 2500;
        }
        else if(value<100){
            value = 0;
        }
        return value;
    }
    public long getMtnCharge() {
        setMtnTax((long) (getMtnValue() * 0.2/100));

        switch (status) {
            case "withdraw":
                long times = mtnValue % 500000;
                if (mtnValue > 500000) {
                    long divident = mtnValue / 500000;
                    long extra = mtnValue % 500000;
                    mtnCharge = (getWithdrawMtn(500000) * divident) + getWithdrawMtn(extra);

                } else {
                    mtnCharge = getWithdrawMtn(mtnValue);
                }
                break;
            case "send":
                if (mtnValue > 1000000) {
                    long divident = mtnValue / 1000000;
                    long extra = mtnValue % 1000000;
                    mtnCharge = (getSendingMtn(1000000) * divident) + getSendingMtn(extra);

                } else {
                    mtnCharge = getSendingMtn(mtnValue);
                }
                break;
            case "sendnone":
                if (mtnValue > 500000) {
                    long divident = mtnValue / 500000;
                    long extra = mtnValue % 500000;
                    mtnCharge = (getNonTransferMTN(500000) * divident) + getNonTransferMTN(extra);

                } else {
                    mtnCharge = getNonTransferMTN(mtnValue);
                }



        }
        return mtnCharge;
    }

    public long getOrangeCharge() {
        setOrangeTax((long) (getOrangeValue() * 0.2/100));
        switch (status) {
            case "withdraw":
                if (orangeValue > 500000) {
                    long divident = orangeValue / 500000;
                    long extra = orangeValue % 500000;
                    OrangeCharge = (getWithdrawCharge(500000) * divident) + getWithdrawCharge(extra);

                } else {
                    OrangeCharge = getWithdrawCharge(orangeValue);
                }
                break;
            case "send":
                if (orangeValue > 1000000) {
                    long divident = orangeValue / 1000000;
                    long extra = orangeValue % 1000000;
                    OrangeCharge = (getSendingCharge(1000000) * divident) + getSendingCharge(extra);

                } else {
                    OrangeCharge = getSendingCharge(orangeValue);
                }
                break;
            case "sendnone":
                if (orangeValue > 500000) {
                    long divident = orangeValue / 500000;
                    long extra = orangeValue % 500000;
                    OrangeCharge = (getNonTransferOrange(500000) * divident) + getNonTransferOrange(extra);

                } else {
                    OrangeCharge = getNonTransferOrange(orangeValue);
                }


        }

        return OrangeCharge;

    }

    public long getEuCharge(){

        switch (status) {
            case "withdraw":
                if (euValue > 500000) {
                    long divident = euValue / 500000;
                    long extra = euValue % 500000;
                    euCharge = (getWithdrawEu(500000) * divident) + getWithdrawEu(extra);

                } else {
                    euCharge = getWithdrawEu(euValue);
                }
                break;
            case "send":
                if (euValue > 500000) {
                    long divident = euValue / 500000;
                    long extra = euValue % 500000;
                    euCharge = (getSendingEU(500000) * divident) + getSendingEU(extra);

                } else {
                    euCharge = getSendingEU(euValue);
                }
                break;


            case "sendnone":
                if (euValue > 500000) {
                    long divident = euValue / 500000;
                    long extra = euValue % 500000;
                    euCharge = (getNonTransferEU(500000) * divident) + getNonTransferEU(extra);

                } else {
                    euCharge = getNonTransferEU(euValue);
                }



        }
return euCharge;
    }


    public void setCharge(long OrangeCharge) {
        this.OrangeCharge = OrangeCharge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getEuTax() {
        return euTax;
    }

    public void setEuTax(long euTax) {
        this.euTax = euTax;
    }

    public long getEuValue() {
        return euValue;
    }

    public void setEuValue(long euValue) {
        this.euValue = euValue;
    }

    public long getEuTotal() {
        return euCharge + euValue;
    }

    public void setEuTotal(long euTotal) {
        this.euTotal = euTotal;
    }


    public void setEuCharge(long euCharge) {
        this.euCharge = euCharge;
    }


}