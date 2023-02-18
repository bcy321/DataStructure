package ch11;

/*
* TreeSet 클래스 활용하기
* 객체의 정렬에 사용하는 클래스
* Set 인터페이스를 구현하여 중복을 허용하지 않고 오름차순 이나 내림차순으로 객체를 정렬
* 내부적으로 이진검색트리로 구현됨
* 이진검색트리에 저장하기 위해 각 객체를 비교해야함
* 비교대상이 되는 객체에 Comparable 이나 Compartor 인터페이스를 구현해야 TreeSet에 추가 가능
* String Integer등 JDK 의 많은 클래스들이 이미 Comparable 을 구현 했음
*
* */
public class TreeSetRun {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();


        Member memberKim = new Member(1003, "김유신");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1002, "강감찬");


        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.showAllMember();

    }
}
