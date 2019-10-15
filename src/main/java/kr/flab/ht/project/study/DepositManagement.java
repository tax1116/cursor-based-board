package kr.flab.ht.project.study;

import java.util.Scanner;

public class DepositManagement {
    public static int loginIndex=0;
    public static CustomerInfo login = new CustomerInfo();
    public static CustomerInfo[] customer = new CustomerInfo[50];//50이라는 숫자는 상수로 선언.
    public static int memberIndex=0;
    public static DepositInfo[][] deposit = new DepositInfo[50][10];

    public static void main(String[] args){
        DepositManagement manage = new DepositManagement();
        MemberManagement member = new MemberManagement();
        CustomerInfo info = new CustomerInfo();
        /*if (member.deleteMember("", "", null) == MemberManagement.DeleteResult.SUCCESS) {

        }*/
        byte select = 0;
        Scanner scan = new Scanner(System.in);


        while(select < 11) {
            switch (select) {
                case 0:
                    System.out.println("---------------------------------------");
                    System.out.println("계좌관리 서비스입니다. 항목을 선택하세요.");
                    System.out.println("---------------------------------------");
                    System.out.println("1. 회원가입");
                    System.out.println("2. 로그인");
                    System.out.println("3. 나가기");
                    System.out.print("입력하세요(1. 회원가입 2. 로그인 3. 나가기): ");

                    select = scan.nextByte();
                    if(select == 3){
                        select += 8;
                    }
                    if(select>3){
                        System.out.println("잘못된 입력입니다.");
                        select = 0;
                    }
                    break;
                case 1:
                    scan.nextLine();
                    System.out.print("id를 입력하세요: ");
                    info.id = scan.nextLine();

                    System.out.print("이름을 입력하세요: ");
                    info.name = scan.nextLine();

                    System.out.print("전화번호를 입력하세요: ");
                    info.phone = scan.nextLine();

                    System.out.print("이메일을 입력하세요: ");
                    info.email = scan.nextLine();

                    System.out.print("비밀번호를 입력하세요: ");
                    info.password = scan.nextLine();

                    customer=member.createMember(info, customer);
                    memberIndex++;
                    /*for(int i=0; i<memberIndex; i++){
                        System.out.println(customer[i].id);
                    }디버깅용 소스*/
                    select = 0;
                    break;

                case 2:
                    scan.nextLine();
                    System.out.println("로그인");
                    System.out.print("id를 입력하세요: ");
                    login.id = scan.nextLine();//info 객체를 한 번 더 사용하지 안 한 이유: 위에 가입란에 남아있는 값이 같이 들어갈꺼라 생각.
                    System.out.print("비밀번호를 입력하세요: ");
                    login.password = scan.nextLine();

                    loginIndex = member.readMember(login.id, login.password, customer, memberIndex);
                    if (loginIndex<0) {
                        select = 0;
                        break;

                    } else {
                        System.out.println(customer[loginIndex].name + "님 환영합니다.");
                    }

                case 3:
                    System.out.println("메뉴를 선택하세요.");
                    System.out.println("1. 계좌조회");//case 3
                    System.out.println("2. 계좌이체");//case 4
                    System.out.println("3. 계좌개설");//case 5
                    System.out.println("4. 계좌해지");//case 6
                    System.out.println("5. 입금/출금");//case 7
                    System.out.println("6. 회원정보 수정");//case 8
                    System.out.println("7. 탈퇴");//case 9
                    System.out.println("8. 로그아웃");//case 10
                    System.out.print("입력하세요: ");
                    select = (byte) (scan.nextByte() + 2);
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    System.out.println("회원정보 수정");
                    customer[loginIndex] = member.updateMember(login);
                    login =customer[loginIndex];
                    if(login!=null){
                        System.out.println("성공적으로 변경되었습니다.");
                        System.out.println("메뉴로 돌아갑니다.");
                        select = 3;
                    }
                    else{
                        System.out.println("다시 입력하세요!");
                        select = 8;
                    }

                    break;

                case 9:
                    byte delete = 0;
                    System.out.println("정말 탈퇴하시겠습니까?(1. Yes/ 2. No)");
                    delete = scan.nextByte();

                    if(delete == 1){
                        if(member.deleteMember(customer,loginIndex,memberIndex)==null){
                            System.out.println("탈퇴에 실패하였습니다. 메뉴로 돌아갑니다.");
                            select = 3;
                            break;
                        }
                        customer=member.deleteMember(customer, loginIndex, memberIndex);
                        System.out.println("성공적으로 탈퇴하였습니다.");
                        memberIndex--;
                        /*if(customer[0]==null){
                            System.out.println("DB is Empty!");
                        }디버깅 용도*/
                        select = 0;
                    }
                    else{
                        System.out.println("메뉴로 돌아갑니다.");
                        select = 3;
                    }
                    break;


                case 10:
                    System.out.println("안녕히 가세요.");
                    select = 0;
                    break;

                default:
                    break;
            }
        }
        System.out.println("시스템을 종료합니다.");
    }
}
