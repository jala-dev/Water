package org.fundacionjala.app.water.service;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WaterBillingServiceTest {

    private WaterBillingService service;

    @Before
    public void setup() {
        service = new WaterBillingService("Billing Service");
    }

    @Test
    public void testRegisterNewMember() {
        // given
        String username = "Peter";

        // when
        service.registerNewMember(username);
        int userId = service.findMemberIdByName(username);

        // Then
        assertTrue(userId > 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testThrowingExceptionForEmptyListMember() {
        int userId = service.findMemberIdByName("anonymous");
    }

    @Test
    public void testCalculateDebtAmountForASingleMember() {
        // given
        String usernameB = "Sara";
        int consumption = 100;
        int expectedDebt = 600;

        // when
        service.registerNewMember(usernameB);
        int userId = service.findMemberIdByName(usernameB);
        service.registerWaterConsumption(userId, consumption);
        service.registerWaterConsumption(userId, consumption);

        double debt = service.calculateDebtAmount(userId);

        assertTrue(debt > 0);
        assertEquals(Double.valueOf(expectedDebt), Double.valueOf(debt));
    }

    @Test
    public void testCalculateDebtAmountForMultipleMembers() {
        // given
        String usernameA = "Peter";
        String usernameB = "Sara";
        int consumptionFromPeter = 100;
        int consumptionFromSara = 80;

        int expectedDebtFromPeter = 300;
        int expectedDebtFromSara = 240;

        // ********************************
        int debtPeter = 0;
        int debtSara = 0;

        // TODO: Complete the required logic for the test

        // ********************************

        assertEquals(Double.valueOf(expectedDebtFromPeter), Double.valueOf(debtPeter));
        assertEquals(Double.valueOf(expectedDebtFromSara), Double.valueOf(debtSara));
    }
}
