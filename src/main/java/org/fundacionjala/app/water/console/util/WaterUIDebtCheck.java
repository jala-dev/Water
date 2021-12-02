package org.fundacionjala.app.water.console.util;

import java.util.Date;

import javax.swing.DefaultBoundedRangeModel;

import org.fundacionjala.app.water.model.ChargingSystem;

public class WaterUIDebtCheck {
    
    ChargingSystem localSystem;

    public WaterUIDebtCheck(ChargingSystem system) {
        this.localSystem = system;
    }

    public void process()
    {        
        System.out.println("======================================");
        System.out.println("1. Ingrese el codigo del socio: ");
        int id = Integer.parseInt(InputReader.readLine());
        try{
            int debt = localSystem.getDebtAmount(id);
            System.out.println("La deuda actual del socio "+ id + " es de "+ debt + " Bs");
        }
        catch (Exception ex)
        {
            System.out.println("Un error ocurrio durante la operacion. "+ex.getMessage());
        }
    }
}
