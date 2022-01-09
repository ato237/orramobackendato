package ato.orramo.orramobackend.domain;

import org.springframework.stereotype.Service;

@Service
public class Calculate {

    private int mtnTax;
    private int orangeTax;
    private int orangeValue;
    private int mtnValue;
    private int mtnCharge;
    private int mtnTotal;
    private int orangeTotal;
    private int OrangeCharge;
    private String status;
    private int euTax;
    private int euValue;
    private int euTotal;
    private int euCharge;


    public Calculate() {

    }

    public Calculate(int orangeValue, int mtnValue, int mtnCharge,
                     int mtnTotal, int orangeTotal,
                     int OrangeCharge, String status, int mtnTax, int orangeTax, int euTax, int euValue,
                     int euTotal, int euCharge) {
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

    }


    public void setMtnCharge(int mtnCharge) {
        this.mtnCharge = mtnCharge;
    }

    public int getMtnTotal() {
        return mtnValue + mtnCharge;
    }

    public int getMtnTax() {
        return mtnTax;
    }

    public void setMtnTax(int mtnTax) {
        this.mtnTax = mtnTax;
    }

    public int getOrangeTax() {
        return orangeTax;
    }

    public void setOrangeTax(int orangeTax) {
        this.orangeTax = orangeTax;
    }

    public void setMtnTotal(int mtnTotal) {
        this.mtnTotal = mtnTotal;
    }

    public void setOrangeTotal(int orangeTotal) {
        this.orangeTotal = orangeTotal;
    }

    public void setOrangeCharge(int orangeCharge) {
        OrangeCharge = orangeCharge;
    }

    public int getOrangeValue() {
        return orangeValue;
    }

    public void setOrangeValue(int orangeValue) {
        this.orangeValue = orangeValue;
    }

    public int getMtnValue() {
        return mtnValue;
    }

    public void setMtnValue(int mtnValue) {
        this.mtnValue = mtnValue;
    }

    public int getOrangeTotal() {
        return OrangeCharge + orangeValue;
    }

    int getWithdrawCharge(int value) {

      double tax =  ( value * 0.2/100);
        if (value >= 50 && value <= 6500) {
            value = value * 3 / 100 + (int) tax;
        } else if (value >= 6501 && value <= 10000) {
            value = 180 + (int) tax;
        } else if (value >= 10001 && value <= 13500) {
            value = 300 + (int) tax;
        } else if (value >= 13501 && value <= 25000) {
            value = 350 + (int) tax;
        } else if (value >= 25001 && value <= 50000) {
            value = 700 + (int) tax;
        } else if (value >= 50001 && value <= 80000) {
            value = 1350 + (int) tax;
        } else if (value >= 80001 && value <= 100000) {
            value = 1800 + (int) tax;
        } else if (value >= 100001 && value <= 200000) {
            value = 2150 + (int) tax;
        } else if (value >= 200001 && value <= 300000) {
            value = 2600 + (int) tax;
        } else if (value >= 300001 && value <= 400000) {
            value = 3100 + (int) tax;
        } else if (value >= 400000 && value <= 500001) {
            value = 3600 + (int) tax;
        }
        return value;
    }

    int getSendingCharge(int value) {
        double tax =  ( value * 0.2/100);
        if (value >= 50 && value <= 6500) {
            value = value * 1 / 100  + (int) tax ;
        } else if (value >= 6501 && value <= 10000) {
            value = 50 + (int) tax;
        } else if (value >= 10001 && value <= 13500) {
            value = 100 + (int) tax;
        } else if (value >= 13501 && value <= 50000) {
            value = 150 + (int) tax;
        }
        else if (value >= 50001 && value <= 80000) {
            value = 200 + (int) tax;
        } else if (value >= 80001 && value <= 400000) {
            value = 300 + (int) tax;
        } else if (value >= 400000 && value <= 1000000) {
            value = 500 + (int) tax;
        }
        return value;

    }

    int getNonTransferOrange(int value) {
        double tax =  ( value * 0.2/100);

        if (value >= 50 && value <= 6500) {
            value = value * 4 / 100 + (int) tax;
        } else if (value >= 6501 && value <= 10000) {
            value = 250 + (int) tax;
        } else if (value >= 10001 && value <= 13500) {
            value = 400 + (int) tax;
        } else if (value >= 13501 && value <= 25000) {
            value = 525 + (int) tax;
        } else if (value >= 25001 && value <= 50000) {
            value = 900 + (int) tax;
        } else if (value >= 50001 && value <= 80000) {
            value = 1700 + (int) tax;
        } else if (value >= 80001 && value <= 100000) {
            value = 2300 + (int) tax;
        } else if (value >= 100001 && value <= 200000) {
            value = 2700 + (int) tax;
        } else if (value >= 200001 && value <= 300000) {
            value = 3100 + (int) tax;
        } else if (value >= 300001 && value <= 400000) {
            value = 3600 + (int) tax;
        } else if (value >= 400000 && value <= 500001) {
            value = 4000 + (int) tax;
        }
        return value;
    }
    int getWithdrawMtn(int value) {

        double tax =  ( value * 0.2/100);
        if (value >= 100 && value <= 5999) {
            value = value * 3 / 100 + (int) tax;
        } else if (value >= 6000 && value <= 10050) {
            value = 175 + (int) tax;
        } else if (value >= 10051 && value <= 13550) {
            value = 300 + (int) tax;
        } else if (value >= 13551 && value <= 25050) {
            value = 350 + (int) tax;
        } else if (value >= 25051 && value <= 50050) {
            value = 700 + (int) tax;
        } else if (value >= 50051 && value <= 75100) {
            value = 1350 + (int) tax;
        } else if (value >= 75101 && value <= 100100) {
            value = 1800 + (int) tax;
        } else if (value >= 100101 && value <= 200500) {
            value = 2150 + (int) tax;
        } else if (value >= 200501 && value <= 300500) {
            value = 2600 + (int) tax;
        } else if (value >= 300501 && value <= 400500) {
            value = 3100 + (int) tax;
        } else if (value >= 400501 && value <= 500000) {
            value = 3500 + (int) tax;
        }
        return value;
    }

    int getSendingMtn(int value) {
        double tax =  ( value * 0.2/100);
        if (value >= 100 && value <= 10050) {
            value = value * 1 / 100 + (int) tax;
        } else if (value >= 6000 && value <= 13550) {
            value = 100 + (int) tax;
        } else if (value >= 13551 && value <= 50050) {
            value = 150 + (int) tax;
        } else if (value >= 50051 && value <= 75100) {
            value = 200 + (int) tax;
        } else if (value >= 75101 && value <= 400500) {
            value = 300 + (int) tax;
        } else if (value >= 400501 && value <= 500000) {
            value = 400 + (int) tax;
        } else if (value >= 500001 && value <= 1000000){
            value =500 + (int) tax;
        }
        return value;
    }

    int getNonTransferMTN(int value) {
        double tax =  ( value * 0.2/100);
        if (value >= 100 && value <= 100100) {
            value = value * 3 / 100 + (int) tax;
        } else if (value >= 100101 && value <= 200500) {
            value = 3100 + (int) tax;
        } else if (value >= 200501 && value <= 400500) {
            value = 3500 + (int) tax;
        } else if (value >= 400501 && value <= 500001) {
            value = 4000 + (int) tax;
        }
        return value;
    }

    int getWithdrawEu(int value){
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
        } else if (value >= 400001 && value <= 500001) {
            value = 2500;
        }
        return value;
    }

    int getSendingEU(int value) {
        value = 0;
        return value;
    }

    int getNonTransferEU(int value){
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
        } else if (value >= 400001 && value <= 500001) {
            value = 2500;
        }
        return value;
    }
    public int getMtnCharge() {
        setMtnTax((int) (getMtnValue() * 0.2/100));

        switch (status) {
            case "withdraw":
                int times = mtnValue % 500000;
                if (mtnValue > 500000) {
                    int divident = mtnValue / 500000;
                    int extra = mtnValue % 500000;
                    mtnCharge = (getWithdrawMtn(500000) * divident) + getWithdrawMtn(extra);

                } else {
                    mtnCharge = getWithdrawMtn(mtnValue);
                }
                break;
            case "send":
                if (mtnValue > 1000000) {
                    int divident = mtnValue / 1000000;
                    int extra = mtnValue % 1000000;
                    mtnCharge = (getSendingMtn(1000000) * divident) + getSendingMtn(extra);

                } else {
                    mtnCharge = getSendingMtn(mtnValue);
                }
                break;
            case "sendnone":
                if (mtnValue > 500001) {
                    int divident = mtnValue / 500001;
                    int extra = mtnValue % 500001;
                    mtnCharge = (getNonTransferMTN(500001) * divident) + getNonTransferMTN(extra);

                } else {
                    mtnCharge = getNonTransferMTN(mtnValue);
                }



        }
        return mtnCharge;
    }

    public int getOrangeCharge() {
        setOrangeTax((int) (getOrangeValue() * 0.2/100));
        switch (status) {
            case "withdraw":
                if (orangeValue > 500001) {
                    int divident = orangeValue / 500001;
                    int extra = orangeValue % 500001;
                    OrangeCharge = (getWithdrawCharge(500001) * divident) + getWithdrawCharge(extra);

                } else {
                    OrangeCharge = getWithdrawCharge(orangeValue);
                }
                break;
            case "send":
                if (orangeValue > 500001) {
                    int divident = orangeValue / 500001;
                    int extra = orangeValue % 500001;
                    OrangeCharge = (getSendingCharge(500001) * divident) + getSendingCharge(extra);

                } else {
                    OrangeCharge = getSendingCharge(orangeValue);
                }
                break;
            case "sendnone":
                if (orangeValue > 500001) {
                    int divident = orangeValue / 500001;
                    int extra = orangeValue % 500001;
                    OrangeCharge = (getNonTransferOrange(500001) * divident) + getNonTransferOrange(extra);

                } else {
                    OrangeCharge = getNonTransferOrange(orangeValue);
                }


        }

        return OrangeCharge;

    }

    public int getEuCharge(){

        switch (status) {
            case "withdraw":
                if (euValue > 500001) {
                    int divident = euValue / 500001;
                    int extra = euValue % 500001;
                    euCharge = (getWithdrawEu(500001) * divident) + getWithdrawEu(extra);

                } else {
                    euCharge = getWithdrawEu(euValue);
                }
                break;
            case "send":
                if (euValue > 500001) {
                    int divident = euValue / 500001;
                    int extra = euValue % 500001;
                    euCharge = (getSendingEU(500001) * divident) + getSendingEU(extra);

                } else {
                    euCharge = getSendingEU(euValue);
                }
                break;


            case "sendnone":
                if (euValue > 500001) {
                    int divident = euValue / 500001;
                    int extra = euValue % 500001;
                    euCharge = (getNonTransferEU(500001) * divident) + getNonTransferEU(extra);

                } else {
                    euCharge = getNonTransferEU(euValue);
                }



        }
return euCharge;
    }


    public void setCharge(int OrangeCharge) {
        this.OrangeCharge = OrangeCharge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEuTax() {
        return euTax;
    }

    public void setEuTax(int euTax) {
        this.euTax = euTax;
    }

    public int getEuValue() {
        return euValue;
    }

    public void setEuValue(int euValue) {
        this.euValue = euValue;
    }

    public int getEuTotal() {
        return euCharge + euValue;
    }

    public void setEuTotal(int euTotal) {
        this.euTotal = euTotal;
    }


    public void setEuCharge(int euCharge) {
        this.euCharge = euCharge;
    }


}