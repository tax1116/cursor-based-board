package kr.flab.ht.project.study;

public class ControlLabel {
    public static void main(String[] args){
        ControlLabel control = new ControlLabel();
        control.printTimeTable();
    }

    ControlLabel(){

    }

    public void printTimeTable(){
        startLabel:
        for(int a=2; a<10; a++){
            for(int b=1; b<10; b++){
                if(b==4){
                    continue startLabel;
                }
                System.out.println(a+"*"+b+"="+(a*b));
            }
            System.out.println("----------");
        }
    }
}
