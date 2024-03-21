package edu.tucn.ispse.lecture5.ex5record.ex54;

/**
 * @author Radu Miron
 * @version 1
 */
public record Phone(String brand, String model) implements Device {
    @Override
    public void start() {
        System.out.println(this + " starts");
    }

    @Override
    public void stop() {
        System.out.println(this + " stops");
    }
}
