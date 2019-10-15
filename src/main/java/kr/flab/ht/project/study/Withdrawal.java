package kr.flab.ht.project.study;

import java.math.BigDecimal;

public class Withdrawal extends DepositInfo{
    BigDecimal transferLimit;

    public  Withdrawal(){

    }

    public Withdrawal(BigDecimal transferLimit){
        this.transferLimit = transferLimit;
    }
}
