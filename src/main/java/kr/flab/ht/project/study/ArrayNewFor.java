package kr.flab.ht.project.study;

public class ArrayNewFor {
    public static void main(String[] args){
        ArrayNewFor array=new ArrayNewFor();


    }

    public ArrayNewFor(){

    }

    public void newFor(){
        int[] oneDim=new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int data:oneDim){
            System.out.println(data);
        }

    }
}
