package kr.flab.ht.project.study;

public class OperatorCasting {
    public static void main(String[] args){
        OperatorCasting operator = new OperatorCasting();
        operator.casting2();
    }

    public OperatorCasting(){

    }
    public void casting(){
        byte byteValue = 127;
        short shortValue = byteValue;

        shortValue++;
        System.out.println(shortValue);
        byteValue = (byte) shortValue;
        System.out.println(byteValue);
    }

    public void casting2(){
        short shortValue=254;
        byte byteValue=(byte) shortValue;
        System.out.println(byteValue);
        shortValue = 255;
        byteValue = (byte) shortValue;
        System.out.println(byteValue);
    }
}
