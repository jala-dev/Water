package org.fundacionjala.app.water.console.util;

import java.util.Date;

import org.fundacionjala.app.water.model.ChargingSystem;

public class WaterUIConsumption {

    ChargingSystem localSystem;

    public WaterUIConsumption(ChargingSystem system) {
        this.localSystem = system;
    }

    public void Register()
    {        
        System.out.println("======================================");
        System.out.println("1. Ingrese el codigo del socio: ");
        int id = Integer.parseInt(InputReader.readLine());
        System.out.println("2. Ingrese el valor del consumo: ");
        int waterConsumption = Integer.parseInt(InputReader.readLine());                
        localSystem.registerWaterComsumption(id, waterConsumption);
    }
}
