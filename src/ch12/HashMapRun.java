package ch12;
/*
* HashMap 클래스 활용하기
* Map 인터페이스를 구현한 클래스와 가장 많이 사용되는 Map 인터페이스 기반 클래스
* key-value를 쌍으로 관리하는 메서드를 구현함
* 검색을 위한 자료구조
*
*
* */
public class HashMapRun {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();
        Member m1 = new Member(1000,"m1");
        Member m2 = new Member(1001,"m2");
        Member m3 = new Member(1002,"m3");

        memberHashMap.addMember(m1);
        memberHashMap.addMember(m2);
        memberHashMap.addMember(m3);

        memberHashMap.showAllMember();
    }
}
