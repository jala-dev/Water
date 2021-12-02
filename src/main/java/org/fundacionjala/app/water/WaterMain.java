package org.fundacionjala.app.water;

public class WaterMain {

    public void run() {
        Menu menu = new Menu();
        boolean shouldExit = false;
        do {
            shouldExit = menu.process();
        } while (!shouldExit);
    }
}
