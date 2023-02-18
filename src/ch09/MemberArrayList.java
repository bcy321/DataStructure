package ch09;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> memberArrayList;

    public MemberArrayList() {
        memberArrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        memberArrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){
        memberArrayList.add(member);
    }
    public boolean removeMember(int memberId){
//        for (int i=0; i<memberArrayList.size(); i++){
//            Member tempMember = memberArrayList.get(i);
//            int tempId = tempMember.getMemberId();
//            if (tempId == memberId){
//                memberArrayList.remove(i);
//                return true;
//            }
//        }

        Iterator<Member> memberIterator = memberArrayList.iterator();
        while(memberIterator.hasNext()){
            Member nextMember = memberIterator.next();
            if(nextMember.getMemberId() == memberId){
                memberArrayList.remove(nextMember);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : memberArrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
