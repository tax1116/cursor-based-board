package kr.flab.ht.project.study;

import java.math.BigDecimal;

public class DepositInfo {
    String id;
    BigDecimal balance;
    String code;
    String passWd;
    String open;
    String close;

    public DepositInfo(){

    }

    public DepositInfo(String id){
        this.id = id;
    }

    public DepositInfo(String id, BigDecimal balance){
        this.id = id;
        this.balance = balance;
    }

    public DepositInfo(String id, BigDecimal balance, String code){
        this.id = id;
        this.balance = balance;
        this.code = code;
    }

    public DepositInfo(String id, BigDecimal balance, String code, String passWd){
        this.id = id;
        this.balance = balance;
        this.code = code;
        this.passWd = passWd;
    }

    public DepositInfo(String id, BigDecimal balance, String code, String passWd, String open){
        this.id = id;
        this.balance = balance;
        this.code = code;
        this.passWd = passWd;
        this.open = open;
    }

    public DepositInfo(String id, BigDecimal balance, String code, String passWd, String open, String close){
        this.id = id;
        this.balance = balance;
        this.code = code;
        this.passWd = passWd;
        this.open = open;
        this.close = close;
    }
}

