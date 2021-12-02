package org.fundacionjala.app.water.model;

import java.util.Date;

public class WaterConsumption {
    Date readingDate;
    private int memberID;
    private int monthConsumption;

    public WaterConsumption(int id, int consumption, Date readingDate) {
        this.memberID = id;
        this.monthConsumption = consumption;
        this.readingDate = readingDate;
    }

    public int getMemberID() {
        return memberID;
    }

    public int getMonthConsumption() {
        return monthConsumption;
    }
}
