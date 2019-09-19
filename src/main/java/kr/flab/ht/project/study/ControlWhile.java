package kr.flab.ht.project.study;

public class ControlWhile {
    public static void main(String[] args){
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
    }

    public ControlWhile(){

    }

    public void whileLoop1(){
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;

        while(loop<12){
            loop++;
            control.switchCalendar(loop);
        }
    }
}
