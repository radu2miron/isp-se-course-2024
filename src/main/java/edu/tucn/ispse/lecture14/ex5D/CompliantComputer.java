package edu.tucn.ispse.lecture14.ex5D;

/**
 * @author Radu Miron
 * @version 1
 * This is not compliant with DIP.
 * The computer is decoupled from keybord and monitor through interfaces,
 * and you can provide it with any implementation of Monitor and Keyboard.
 */
public class CompliantComputer {
    private Keyboard keyboard;
    private Monitor monitor;

    public CompliantComputer(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

class MainC {
    public static void main(String[] args) {
        CompliantComputer compliantComputer1 =
                new CompliantComputer(new FancyKeyboard(), new FancyMonitor());

        CompliantComputer compliantComputer2 =
                new CompliantComputer(new FancyKeyboard(), new NotSoFancyMonitor());
    }
}