package kr.flab.ht.project.study;

public class ControlIf {
    public static void main(String[] args){
        ControlIf control = new ControlIf();

        control.ifStatement();

    }

    public ControlIf(){

    }

    public void ifStatement(){
        if(true);
        if(true) System.out.println("It's True!");

        if(true)
            System.out.println("It's also true.");

        if(false) System.out.println("It;s false");
    }
}
