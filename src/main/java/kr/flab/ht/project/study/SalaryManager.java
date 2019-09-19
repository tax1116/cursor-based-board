package kr.flab.ht.project.study;

public class SalaryManager {
    public static void main(String[] args){
        SalaryManager salary = new SalaryManager();

        int yearlySalary = 20000000;

        System.out.println("월 급여: "+salary.getMonthlySalary(yearlySalary));

    }

    public double getMonthlySalary(int yearlySalary){
        double month = (double) yearlySalary/12.0;
        double tax = calculateTax(month);
        double pension = calculateNationalPension(month);
        double insurance = calculateHealthInsurance(month);
        double minusElement = tax + pension + insurance;

        System.out.println("근로소득세: "+tax);
        System.out.println("국민연금: "+pension);
        System.out.println("건강 보험료: "+insurance);

        month -= minusElement;

        return month;
    }

    public double calculateTax(double monthSalary){
        double tax = (monthSalary*12.5)/100;

        return tax;
    }

    public double calculateNationalPension(double monthlySalary){
        double nationalPension = (monthlySalary*8.1)/100;

        return nationalPension;
    }

    public double calculateHealthInsurance(double monthlySalary){
        double healthInsurance = (monthlySalary*13.5)/100;

        return healthInsurance;
    }
}
