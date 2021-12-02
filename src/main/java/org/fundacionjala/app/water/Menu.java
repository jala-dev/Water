package org.fundacionjala.app.water;

import org.fundacionjala.app.water.console.util.InputReader;
import org.fundacionjala.app.water.console.util.WaterUIConsumption;
import org.fundacionjala.app.water.console.util.WaterUIDebtCheck;
import org.fundacionjala.app.water.service.WaterBillingService;

public class Menu {

    WaterBillingService billingService;

    public Menu() {
        this.billingService = new WaterBillingService("Cooperativa Local de Agua");
    }

    public boolean process() {
        showMainMenu();
        char option = InputReader.readOption();
        boolean shouldExit = false;
        switch (option) {
            case '1':
                RegisterConsumption();
                break;
            case '2':
                ShowDebtAmount();
                break;
            case '3':

                break;
            case '4':

                break;
            case '5':
                shouldExit = true;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        System.out.println(System.lineSeparator());
        return shouldExit;
    }

    private void RegisterConsumption() {
        WaterUIConsumption UI = new WaterUIConsumption(billingService);
        UI.Register();
    }

    private void ShowDebtAmount() {
        WaterUIDebtCheck UI = new WaterUIDebtCheck(billingService);
        UI.process();
    }

    private void showMainMenu() {
        System.out.println("");
        System.out.println("Cooperativa Local de Agua");
        System.out.println("======================================");
        System.out.println("1. Registrar consumo de agua");
        System.out.println("2. Consultar deuda de socio");
        System.out.println("3. Consultar detalles del socio");
        System.out.println("4. Realizar cobro");
        System.out.println("5. Exit");
        System.out.println("======================================");
    }
}
