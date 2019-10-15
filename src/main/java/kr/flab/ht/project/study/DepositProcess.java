package kr.flab.ht.project.study;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Scanner;

public class DepositProcess {
    Calendar cal = Calendar.getInstance();
    Scanner scan = new Scanner(System.in);

    public Withdrawal createWithdrawal(String name, String phone){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.name = name;
        System.out.print("예치금 적립액을 입력하세요: ");
        withdrawal.balance = scan.nextBigDecimal();
        scan.nextLine();
        System.out.print("계좌 비밀번호를 입력하세요: ");
        withdrawal.passWd = scan.nextLine();
        withdrawal.code = "001-"+phone;
        withdrawal.open = cal.getTime();
        System.out.print("계좌 만기일을 입력하세요(년 단위 입력): ");
        byte year= scan.nextByte();
        cal.add(Calendar.YEAR, year);
        withdrawal.close = cal.getTime();
        System.out.print("이체 한도를 입력하세요: ");
        withdrawal.transferLimit = scan.nextBigDecimal();
        System.out.println("입출금 계좌가 개설되었습니다.");
        return withdrawal;
    }

    public InstallmentSaving createSaving(String name, String phone, int depositIndex){
        InstallmentSaving saving = new InstallmentSaving();
        saving.name = name;
        System.out.print("예치금 적립액을 입력하세요: ");
        saving.balance = scan.nextBigDecimal();
        scan.nextLine();
        System.out.print("계좌 비밀번호를 입력하세요: ");
        saving.passWd = scan.nextLine();
        saving.code = "002-"+phone+"-"+depositIndex;
        saving.open = cal.getTime();
        System.out.print("계좌 만기일을 입력하세요(년 단위 입력): ");
        byte year= scan.nextByte();
        cal.add(Calendar.YEAR, year);
        saving.close = cal.getTime();
        saving.interest = BigDecimal.valueOf(2);
        System.out.println("자유적금 계좌가 개설되었습니다.");
        return saving;
    }

    public Regular createRegular(String name, String phone, int depositIndex){
        Regular regular = new Regular();
        regular.name = name;
        System.out.print("예치금 적립액을 입력하세요: ");
        regular.balance = scan.nextBigDecimal();
        scan.nextLine();
        System.out.print("계좌 비밀번호를 입력하세요: ");
        regular.passWd = scan.nextLine();
        regular.code = "003-"+phone+"-"+depositIndex;
        regular.open = cal.getTime();
        System.out.print("계좌 만기일을 입력하세요(년 단위 입력): ");
        byte year= scan.nextByte();
        cal.add(Calendar.YEAR, year);
        regular.close = cal.getTime();
        regular.interest = BigDecimal.valueOf(3);
        regular.month = scan.nextBigDecimal();
        System.out.println("정기 적금계좌가 개설되었습니다.");
        return regular;
    }
}
