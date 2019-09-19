package kr.flab.ht.project.study;

public class OperatorCompound {

    public static void main(String[] args){
        OperatorCompound comp = new OperatorCompound();

        comp.compound();
    }

    public OperatorCompound(){

    }

    public void compound(){
        int intValue = 10;

        intValue += 5;
        System.out.println(intValue);

        intValue -= 5;
        System.out.println(intValue);

        intValue *= 5;
        System.out.println(intValue);

        intValue /= 5;
        System.out.println(intValue);

        intValue %= 5;
        System.out.println(intValue);
    }
}
