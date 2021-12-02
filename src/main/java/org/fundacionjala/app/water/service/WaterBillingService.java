package org.fundacionjala.app.water.service;

import org.fundacionjala.app.water.model.Member;
import org.fundacionjala.app.water.model.MemberList;
import org.fundacionjala.app.water.model.WaterConsumption;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaterBillingService {
    private final String title;
    private final MemberList members;
    private final List<WaterConsumption> consumptionDB;
    int price = 3;

    public WaterBillingService(String title) {
        this.title = title;
        this.members = new MemberList();
        this.consumptionDB = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void registerNewMember(String name) {
        int id = getNewMemberID();
        Member newMember = new Member(id, name);
        members.addMember(newMember);
    }

    private int getNewMemberID() {
        int defaultId = 0;
        return defaultId;
    }

    public int findMemberIdByName(String name) {
        return members.getMemberID(name);
    }

    public void registerWaterConsumption(int memberId, int consumption) {
        consumptionDB.add(new WaterConsumption(memberId, consumption, new Date()));
    }

    public double calculateDebtAmount(int memberId) {
        double totalDebt = 0;
        for (WaterConsumption waterConsumption : consumptionDB) {
            if (waterConsumption.getMemberID() == memberId) {
                totalDebt += (waterConsumption.getMonthConsumption() * price);
            }
        }

        return totalDebt;
    }

}
