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

    public Calculate(){

    }
    public Calculate(int orangeValue, int mtnValue,  int mtnCharge,
                     int mtnTotal, int orangeTotal,
                     int OrangeCharge,String status) {
        this.orangeValue = orangeValue;
        this.mtnValue = mtnValue;
        this.mtnCharge = mtnCharge;
        this.mtnTotal = mtnTotal;
        this.orangeTotal = orangeTotal;
        this.OrangeCharge = OrangeCharge;
        this.status = status;
    }

    public int getMtnCharge() {
        switch (status){
            case "withdraw":
                if (mtnValue >= 100 && mtnValue <= 5550) {
                    mtnCharge = mtnValue * 3 / 100;
                } else if (mtnValue >= 5551 && mtnValue <= 10050) {
                    mtnCharge = 175;
                } else if (mtnValue >= 10051 && mtnValue <= 13550) {
                    mtnCharge = 300;
                } else if (mtnValue >= 13551 && mtnValue <= 25050) {
                    mtnCharge = 350;
                } else if (mtnValue >= 25051 && mtnValue <= 50050) {
                    mtnCharge = 700;
                } else if (mtnValue >= 50051 && mtnValue <= 75100) {
                    mtnCharge = 1350;
                } else if (mtnValue >= 75101 && mtnValue <= 100100) {
                    mtnCharge = 1800;
                } else if (mtnValue >= 100101 && mtnValue <= 200500) {
                    mtnCharge = 2150;
                } else if (mtnValue >= 200501 && mtnValue <= 300500) {
                    mtnCharge = 2600;
                } else if (mtnValue >= 300501 && mtnValue <= 400500) {
                    mtnCharge = 3100;
                } else if (mtnValue >= 400501 && mtnValue <= 500000) {
                    mtnCharge = 3500;
                }
                break;
            case "send":
                if (mtnValue >= 100 && mtnValue <= 5550) {
                    mtnValue = mtnValue * 1 / 100;
                } else if (mtnValue >= 5551 && mtnValue <= 10050) {
                    mtnCharge = 50;
                } else if (mtnValue >= 10051 && mtnValue <= 13550) {
                    mtnCharge = 100;
                } else if (mtnValue >= 13551 && mtnValue <= 25050) {
                    mtnCharge = 100;
                } else if (mtnValue >= 25051 && mtnValue <= 50050) {
                    mtnCharge = 100;
                } else if (mtnValue >= 50051 && mtnValue <= 75100) {
                    mtnCharge = 250;
                } else if (mtnValue >= 75101 && mtnValue <= 100100) {
                    mtnCharge = 250;
                } else if (mtnValue >= 100101 && mtnValue <= 200500) {
                    mtnCharge = 250;
                } else if (mtnValue >= 200501 && mtnValue <= 300500) {
                    mtnCharge = 250;
                } else if (mtnValue >= 300501 && mtnValue <= 400500) {
                    mtnCharge = 250;
                } else if (mtnValue >= 400501 && mtnValue <= 500000) {
                    mtnCharge = 500;
                }
                else if (mtnValue >= 500001 && mtnValue <= 1000000) {
                    mtnCharge = 500;
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

    int getWithdrawCharge(int value){
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
    public int getOrangeCharge() {
          switch (status){
              case "withdraw":
                  int times = orangeValue %500000;
                  if (orangeValue > 500001)
                  {
                      int divident = orangeValue / 500001;
                     int extra = orangeValue % 500001;
                    OrangeCharge = (getWithdrawCharge(500001) * divident) + getWithdrawCharge(extra);

                  }else{
                      OrangeCharge = getWithdrawCharge(orangeValue);
                  }
                  break;
              case "send":
                  if (orangeValue >= 50 && orangeValue <= 6500) {
                      OrangeCharge = orangeValue * 1 / 100;
                  } else if (orangeValue >= 6501 && orangeValue <= 10000) {
                      OrangeCharge = 50;
                  } else if (orangeValue >= 10001 && orangeValue <= 13500) {
                      OrangeCharge = 100;
                  } else if (orangeValue >= 13501 && orangeValue <= 25000) {
                      OrangeCharge = 150;
                  } else if (orangeValue >= 25001 && orangeValue <= 50000) {
                      OrangeCharge = 150;
                  } else if (orangeValue >= 50001 && orangeValue <= 80000) {
                      OrangeCharge = 200;
                  } else if (orangeValue >= 80001 && orangeValue <= 100000) {
                      OrangeCharge = 300;
                  } else if (orangeValue >= 100001 && orangeValue <= 200000) {
                      OrangeCharge = 300;
                  } else if (orangeValue >= 200001 && orangeValue <= 300000) {
                      OrangeCharge = 300;
                  } else if (orangeValue >= 300001 && orangeValue <= 400000) {
                      OrangeCharge = 300;
                  } else if (orangeValue >= 400000 && orangeValue <= 500001) {
                      OrangeCharge = 500;
                  }
                  else if (orangeValue >= 500001&& orangeValue <= 1000000){
                  OrangeCharge = 500;
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
