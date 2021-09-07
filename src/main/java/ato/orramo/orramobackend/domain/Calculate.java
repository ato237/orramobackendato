package ato.orramo.orramobackend.domain;

import org.springframework.stereotype.Service;

@Service
public class Calculate {

    private int orangeValue;
    private int mtnValue;
    private int mtnCharge;
    private int mtnTotal;
    private int orangeTotal;
    private int OrangeCharge;
    private String status;

    public Calculate() {

    }

    public Calculate(int orangeValue, int mtnValue, int mtnCharge,
                     int mtnTotal, int orangeTotal,
                     int OrangeCharge, String status) {
        this.orangeValue = orangeValue;
        this.mtnValue = mtnValue;
        this.mtnCharge = mtnCharge;
        this.mtnTotal = mtnTotal;
        this.orangeTotal = orangeTotal;
        this.OrangeCharge = OrangeCharge;
        this.status = status;
    }

    int getWithdrawMtn(int value) {
        if (value >= 100 && value <= 5999) {
            value = value * 3 / 100;
        } else if (value >= 6000 && value <= 10050) {
            value = 175;
        } else if (value >= 10051 && value <= 13550) {
            value = 300;
        } else if (value >= 13551 && value <= 25050) {
            value = 350;
        } else if (value >= 25051 && value <= 50050) {
            value = 700;
        } else if (value >= 50051 && value <= 75100) {
            value = 1350;
        } else if (value >= 75101 && value <= 100100) {
            value = 1800;
        } else if (value >= 100101 && value <= 200500) {
            value = 2150;
        } else if (value >= 200501 && value <= 300500) {
            value = 2600;
        } else if (value >= 300501 && value <= 400500) {
            value = 3100;
        } else if (value >= 400501 && value <= 500000) {
            value = 3500;
        }
        return value;
    }

    int getSendingMtn(int value) {
        if (value >= 100 && value <= 5999) {
            value = value * 1 / 100;
        } else if (value >= 6000 && value <= 13550) {
            value = 100;
        } else if (value >= 13551 && value <= 50050) {
            value = 150;
        } else if (value >= 50051 && value <= 75100) {
            value = 200;
        } else if (value >= 75101 && value <= 400500) {
            value = 300;
        } else if (value >= 400501 && value <= 500000) {
            value = 400;
        } else if (value >= 500001 && value <= 1000000){
            value =500;
        }
        return value;
    }

    public int getMtnCharge() {
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

        }
        return mtnCharge;
    }

    public void setMtnCharge(int mtnCharge) {
        this.mtnCharge = mtnCharge;
    }

    public int getMtnTotal() {
        return mtnValue + mtnCharge;
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
        if (value >= 50 && value <= 6500) {
            value = value * 3 / 100;
        } else if (value >= 6501 && value <= 10000) {
            value = 180;
        } else if (value >= 10001 && value <= 13500) {
            value = 300;
        } else if (value >= 13501 && value <= 25000) {
            value = 350;
        } else if (value >= 25001 && value <= 50000) {
            value = 700;
        } else if (value >= 50001 && value <= 80000) {
            value = 1350;
        } else if (value >= 80001 && value <= 100000) {
            value = 1800;
        } else if (value >= 100001 && value <= 200000) {
            value = 2150;
        } else if (value >= 200001 && value <= 300000) {
            value = 2600;
        } else if (value >= 300001 && value <= 400000) {
            value = 3100;
        } else if (value >= 400000 && value <= 500001) {
            value = 3600;
        }
        return value;
    }

    int getSendingCharge(int mtnvalue) {

        if (mtnvalue >= 50 && mtnvalue <= 6500) {
            mtnvalue = mtnvalue * 1 / 100;
        } else if (mtnvalue >= 6501 && mtnvalue <= 10000) {
            mtnvalue = 50;
        } else if (mtnvalue >= 10001 && mtnvalue <= 13500) {
            mtnvalue = 100;
        } else if (mtnvalue >= 13501 && mtnvalue <= 25000) {
            mtnvalue = 150;
        } else if (mtnvalue >= 25001 && mtnvalue <= 50000) {
            mtnvalue = 150;
        } else if (mtnvalue >= 50001 && mtnvalue <= 80000) {
            mtnvalue = 200;
        } else if (mtnvalue >= 80001 && mtnvalue <= 100000) {
            mtnvalue = 300;
        } else if (mtnvalue >= 100001 && mtnvalue <= 200000) {
            mtnvalue = 300;
        } else if (mtnvalue >= 200001 && mtnvalue <= 300000) {
            mtnvalue = 300;
        } else if (mtnvalue >= 300001 && mtnvalue <= 400000) {
            mtnvalue = 300;
        } else if (mtnvalue >= 400000 && mtnvalue <= 500001) {
            mtnvalue = 500;
        } else if (mtnvalue >= 500001 && mtnvalue <= 1000000) {
            mtnvalue = 500;
        }
        return mtnvalue;

    }

    public int getOrangeCharge() {
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
                if (orangeValue > 1000000) {
                    int divident = orangeValue / 1000000;
                    int extra = orangeValue % 1000000;
                    OrangeCharge = (getSendingCharge(1000000) * divident) + getSendingCharge(extra);

                } else {
                    OrangeCharge = getSendingCharge(orangeValue);
                }

        }

        return OrangeCharge;

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


}