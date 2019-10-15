package kr.flab.ht.project.study;

import java.math.BigDecimal;
import java.util.Calendar;

public class InstallmentSaving extends DepositInfo{
    BigDecimal interest;


    public  InstallmentSaving(){

    }

    public InstallmentSaving(BigDecimal interest, int month){
        this.interest = interest;

    }
}
