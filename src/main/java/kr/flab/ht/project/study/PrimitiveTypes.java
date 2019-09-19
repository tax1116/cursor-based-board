package kr.flab.ht.project.study;

import java.security.PublicKey;

public class PrimitiveTypes {
    int intDefault1;

    public static void main (String[] args){
        PrimitiveTypes types = new PrimitiveTypes();//types 라는 이름의 객체 생성.

        types.checkChar();
    }

    public PrimitiveTypes(){

    }

    public void checkByte(){
        byte byteMin=-128;
        byte byteMax=127;
        System.out.println("byteMin= " + byteMin);
        System.out.println("byteMax= " + byteMax);

        byteMin=(byte)(byteMin-1);
        byteMax=(byte)(byteMax+1);

        System.out.println("byteMin-1= " + byteMin);
        System.out.println("byteMax+1= " + byteMax);
    }

    public void checkOtherTypes(){
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
    }

    public void checkChar(){
        char charMin='\u0000';
        char charMax='\uffff';

        System.out.println("charMin=["+charMin+"]");
        System.out.println("charMax=["+charMax+"]");

        int intValue = 'a';
        System.out.println("intValue["+intValue+"]");

    }

    public void defaultValues(){
        int intDefault2=0;
        System.out.println(intDefault1);
        System.out.println(intDefault2);
    }
}
