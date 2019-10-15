package kr.flab.ht.project.study;

public class DepositProcess {
    public DepositInfo createDeposit(DepositInfo cmp, byte type){
        DepositInfo deposit = new DepositInfo(cmp.id, cmp.balance, cmp.code, cmp.passWd, cmp.open, cmp.close);
        System.out.println("계좌가 개설되었습니다.");
        return cmp;
    }
}
