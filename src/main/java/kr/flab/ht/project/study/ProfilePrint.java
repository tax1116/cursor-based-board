package kr.flab.ht.project.study;

public class ProfilePrint {
    byte age=0;
    String name="";
    boolean isMarried;

    public static void main (String[] args){
        ProfilePrint profile = new ProfilePrint();
        byte age=26;
        String name="OH";
        boolean isMarried = false;

        profile.setAge(age);
        profile.setName(name);
        profile.setMarried(isMarried);

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }

    public ProfilePrint(){

    }

    public void setAge(byte paraAge){
          age=paraAge;
    }

    public int getAge(){
        return age;
    }
    public void setName(String paraName){
        name=paraName;
    }

    public String getName(){
        return name;
    }

    public void setMarried(boolean flag){
        isMarried=flag;
    }

    public boolean isMarried(){
        return isMarried;
    }

}
