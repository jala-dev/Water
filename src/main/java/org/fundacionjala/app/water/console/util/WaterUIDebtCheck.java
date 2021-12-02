package org.fundacionjala.app.water.console.util;

import org.fundacionjala.app.water.service.WaterBillingService;

public class WaterUIDebtCheck {

    WaterBillingService billingService;

    public WaterUIDebtCheck(WaterBillingService system) {
        this.billingService = system;
    }

    public void process() {
        System.out.println("======================================");
        System.out.println("1. Ingrese el codigo del socio: ");
        int id = Integer.parseInt(InputReader.readLine());
        try {
            double debt = billingService.calculateDebtAmount(id);
            System.out.println("La deuda actual del socio " + id + " es de " + debt + " Bs");
        } catch (Exception ex) {
            System.out.println("Un error ocurrio durante la operacion. " + ex.getMessage());
        }
    }
}
