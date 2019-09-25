package kr.flab.ht.project.study;

public class ManageStudent {
    public ManageStudent(){};
    public static void main(String[] args){
        Student[] student;
        ManageStudent manage = new ManageStudent();

        student = manage.addStudent();
        manage.printStudents(student);
    }

    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook","Seoul","01012341234","ask@godofjava.com");
        return student;
    }

    public void printStudents(Student[] student){

        for(int i=0;i<3;i++){
            System.out.println(student[i]);
        }
    }
}
