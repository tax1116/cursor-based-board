package kr.flab.ht.project.study;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class DepositInfo{
    String name;
    BigDecimal balance;
    String code;
    String passWd;
    Date open;
    Date close;


    public DepositInfo(){

    }

    public DepositInfo(String id){
        this.name = id;
    }

    public DepositInfo(String id, BigDecimal balance){
        this.name = id;
        this.balance = balance;
    }

    public DepositInfo(String id, BigDecimal balance, String code){
        this.name = id;
        this.balance = balance;
        this.code = code;
    }

    public DepositInfo(String id, BigDecimal balance, String code, String passWd){
        this.name = id;
        this.balance = balance;
        this.code = code;
        this.passWd = passWd;
    }

    public DepositInfo(String id, BigDecimal balance, String code, String passWd, Date open){
        this.name = id;
        this.balance = balance;
        this.code = code;
        this.passWd = passWd;
        this.open = open;
    }

    public DepositInfo(String id, BigDecimal balance, String code, String passWd, Date open, Date close){
        this.name = id;
        this.balance = balance;
        this.code = code;
        this.passWd = passWd;
        this.open = open;
        this.close = close;
    }
}

