package org.fundacionjala.app.water.model;

import java.util.Date;

public class WaterConsumption {
    int memberID;
    int monthConsumption;
    Date readingDate;

    public WaterConsumption(int id, int consumption, Date readingDate) {
        this.memberID = id;
        this.monthConsumption = consumption;
        this.readingDate = readingDate;
    }
}
