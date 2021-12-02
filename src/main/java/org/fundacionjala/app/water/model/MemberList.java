package org.fundacionjala.app.water.model;

import java.util.ArrayList;
import java.util.List;

public class MemberList {
    private List<Member> members;

    public MemberList() {
        this.members = new ArrayList<>();
    }

    public boolean addMember(Member newMember) {
        members.add(newMember);
        return true;
    }

    public int getMemberID(String name) {
        return members.get(0).id;
    }

    public boolean isEmpty() {
        return members.isEmpty();
    }
}