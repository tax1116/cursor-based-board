package kr.flab.ht.project.study;

public class InterestManager {
    public static void main(String[] args){
        InterestManager deposit = new InterestManager();

        for(int x=1; x<=365; x++){
            if((x%10)==0){
                System.out.println(x + "일의 이자율: " + deposit.getInterestRate(x));
                System.out.println(x + "일까지 예상금액: " + deposit.calculateAmount(x, 1000000) + "원");
                System.out.println("-------------------");
            }
        }

    }

    public InterestManager(){

    }

    public double getInterestRate(int day){
        double rate=0;

        if(day<=90){
            rate=0.001;
        }
        else if((day>90)&&(day<=180)){
            rate=0.01;
        }

        else if((day>180)&&(day<=364)){
            rate=0.02;
        }

        else if(day>360){
            rate=0.056;
        }

        else{
            System.out.println("잘못된 입력입니다.");
        }
        return rate;
    }

    public double calculateAmount(int day, long amount){
            double interest = (double) amount * getInterestRate(day);
            double total = (double) amount + interest;

            return total;
    }


}
