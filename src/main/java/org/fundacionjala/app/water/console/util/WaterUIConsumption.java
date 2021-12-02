package org.fundacionjala.app.water.console.util;

import org.fundacionjala.app.water.service.WaterBillingService;

public class WaterUIConsumption {

    WaterBillingService billingService;

    public WaterUIConsumption(WaterBillingService service) {
        this.billingService = service;
    }

    public void Register() {
        System.out.println("======================================");
        System.out.println("1. Ingrese el codigo del socio: ");
        int id = Integer.parseInt(InputReader.readLine());
        System.out.println("2. Ingrese el valor del consumo: ");
        int waterConsumption = Integer.parseInt(InputReader.readLine());
        billingService.registerWaterConsumption(id, waterConsumption);
    }
}
