package kr.flab.ht.project.study;
import java.util.Scanner;

public class MemberManagement {
    Scanner scan = new Scanner(System.in);
    public CustomerInfo[] createMember(CustomerInfo obj,CustomerInfo[] cmp){//id를 Primary Key 값으로 중복검사 실행.
        CustomerInfo member = new CustomerInfo(obj.id, obj.name, obj.phone, obj.email, obj.password);
            //System.out.println(member.toString(member)); 디버깅용 소스
            for(int i=0;i<cmp.length; i++){
                if(cmp[i] == null){
                    cmp[i] = member;
                    System.out.println("가입이 완료되었습니다.");
                    return cmp;
                }
            }
            System.out.println("DB 공간 부족. 관리자에게 문의하세요.");
        return cmp;
    }

    public int readMember(String id, String password, CustomerInfo[] cmp, int memberNum){
        if(cmp[0] == null){
            System.out.println("가입정보가 없습니다. 회원가입을 하세요.");
            return -1;
        }

        for(int i=0; i<memberNum;i++){
            if(id.equals(cmp[i].id)) {
                if(password.equals(cmp[i].password)) {
                    return i;
                }
                else {
                    System.out.println("비밀번호가 다릅니다.");
                    return -1;
                }
            }
        }
        System.out.println("가입정보가 없습니다.");
        return -1;//null 값이 넘어가면 가입정보 없음 출력 요망
    }

    public CustomerInfo updateMember(CustomerInfo obj) {
        CustomerInfo member = new CustomerInfo();
        String check;
        System.out.println("비밀번호를 확인합니다.");
        System.out.print("비밀번호를 입력해주세요: ");
        check = scan.nextLine();

        if(check.equals(obj.password)){
            member.id = obj.id;
            System.out.println("변경하실 내용을 입력하세요.");
            System.out.print("이름: ");
            member.name = scan.nextLine();
            System.out.print("전화번호: ");
            member.phone = scan.nextLine();
            System.out.print("이메일: ");
            member.email = scan.nextLine();
            System.out.print("비밀번호: ");
            member.password = scan.nextLine();
            return member;
        }
        else{ return null; }
    }

    public CustomerInfo[] deleteMember(CustomerInfo[] cmp, int index, int memberNum){
        CustomerInfo[] tmp= new CustomerInfo[50];//동적으로 바꿀수 있는 방법 알아보기.
        for (int i=0; i<(memberNum-1); i++) {
            if(i>=index){
                tmp[i]=cmp[i+1];
            }
            else {
                tmp[i] = cmp[i];
            }
        }
        return tmp;
    }

    /*public enum DeleteResult {
        SUCCESS, FAIL;
    }*/
}
