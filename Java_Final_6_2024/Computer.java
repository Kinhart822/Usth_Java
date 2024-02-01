package Java_Final_6_2024;

public class Computer {
    private String processor;
    private int memory;

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void turnOn() {
        System.out.println("Turning on...");
    }

    public void turnOff() {
        System.out.println("Turning off...");
    }
}