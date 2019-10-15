package kr.flab.ht.project.study;

import java.math.BigDecimal;

public class InstallmentSaving extends DepositInfo{
    BigDecimal interest;
    public  InstallmentSaving(){

    }

    public InstallmentSaving(BigDecimal interest){
        this.interest = interest;
    }
}
