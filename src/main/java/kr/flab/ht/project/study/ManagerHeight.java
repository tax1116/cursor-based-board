package kr.flab.ht.project.study;

public class ManagerHeight {
    int[][] gradeHeight;

    public static void main(String[] args){
        ManagerHeight student = new ManagerHeight();

        student.setData();

        for (int i=1;i<6;i++){
            System.out.println("Class No.: "+i);
            //student.printHeight(i);
            student.printAverage(i);
        }
    }
    public ManagerHeight(){

    }

    public void setData(){
        gradeHeight=new int[5][];
        gradeHeight[0] = new int[]{170,180,173,175,177};
        gradeHeight[1] = new int[]{160,165,167,186};
        gradeHeight[2] = new int[]{158,177,187,176};
        gradeHeight[3] = new int[]{173,182,181};
        gradeHeight[4] = new int[]{170,180,165,177,172};
    }

    public void printHeight(int classNo){

        for(int data:gradeHeight[classNo-1]){
            System.out.println(data);
        }
    }

    public void printAverage(int classNo){
        double sum=0;
        double average=0;

        for (int data:gradeHeight[classNo-1]){
            sum+=data;
        }

        average= sum / gradeHeight[classNo-1].length;

        System.out.println("Height average: "+average);
    }

}
