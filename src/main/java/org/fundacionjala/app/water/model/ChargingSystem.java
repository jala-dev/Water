package org.fundacionjala.app.water.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargingSystem {
    private final String title;
    private final MemberList members;
    private final List<WaterConsumption> consumptionDB;
    int price = 3;

    public ChargingSystem(String title) {
        this.title = title;
        this.members = new MemberList();
        this.consumptionDB = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void registerNewMember(String name)
    {
        int id = getNewMemberID();
        Member newMember = new Member(id, name);
        members.addMember(newMember);
        }

    private int getNewMemberID() {
        int defaultId = 0;
        return defaultId;
    }

    public void registerWaterComsumption(int memberId, int consumption)
    {
        consumptionDB.add(new WaterConsumption(memberId, consumption, new Date()));
    }

    public int getDebtAmount(int memberId)
    {
        int totalDebt = 0;
        for (WaterConsumption waterConsumption : consumptionDB) {
            if (waterConsumption.memberID == memberId)
            {
                totalDebt += (waterConsumption.monthConsumption * price);
            }
        }

        return totalDebt;
    }
}
