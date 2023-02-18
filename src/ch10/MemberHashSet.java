package ch10;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> memberHashSet;

    public MemberHashSet() {
        this.memberHashSet = new HashSet<>();
    }
    public MemberHashSet(int size) {
        this.memberHashSet = new HashSet<>(size);
    }
    public void addMember(Member member){
        memberHashSet.add(member);
    }
    public boolean removeMember(int memberId){
        Iterator<Member> memberIterator = memberHashSet.iterator();
        while (memberIterator.hasNext()){
            Member tempMember = memberIterator.next();
            if(tempMember.getMemberId() == memberId){
                memberHashSet.remove(tempMember);
                return true;
            }
        }
        System.out.println("해당 멤버 아이디 없음");
        return false;
    }

    public void showAllMember(){
        for (Member member : memberHashSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
