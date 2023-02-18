package ch10;

/*
* Set 인터페이스를 구현한 클래스와 멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야함
* 동일성 구현을 위해 필요에 따라 equals hashCode 메서드를 재정의 함
*
* */
public class HashSetRun {
    public static void main(String[] args) {
        MemberHashSet memberArrayList = new MemberHashSet();
        Member m1 = new Member(1001, "김유신");
        Member m2 = new Member(1002, "이순신");
        Member m3 = new Member(1003, "홍길동");
        Member m4 = new Member(1003, "김길동");

        memberArrayList.addMember(m1);
        memberArrayList.addMember(m2);
        memberArrayList.addMember(m3);
        memberArrayList.addMember(m4);
        memberArrayList.showAllMember();
    }
}
