package org.fundacionjala.app.water.console.util;

import org.fundacionjala.app.water.service.WaterBillingService;

public class UIMemberRegister {

    WaterBillingService billingService;

    public UIMemberRegister(WaterBillingService billingService) {
        this.billingService = billingService;
    }

    public void process() {
        System.out.println("======================================");
        System.out.println("Ingrese nombre del socio: ");
        String name = InputReader.readLine();
        try {
            billingService.registerNewMember(name);
            System.out.println("El nuevo socio " + name + " ha sido registrado.");
        } catch (Exception ex) {
            System.out.println("Un error ocurrio durante la operacion. " + ex.getMessage());
        }
    }
}
