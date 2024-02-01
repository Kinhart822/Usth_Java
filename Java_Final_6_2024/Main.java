package Java_Final_6_2024;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.turnOn();

        Computer computer1 = new Laptop("Processor1", 8, "Data1");
        System.out.println("Information of the processor of the laptop: " + computer1.getProcessor());
        System.out.println("Information of the memory of the laptop: " + computer1.getMemory());
        System.out.println("Information of the data of the laptop: " + ((Laptop) computer1).getData());

        ((Laptop) computer1).openLid();

        Computer computer2 = new Desktop("Processor2", 16);
        System.out.println("Information of the processor of the desktop: " + computer2.getProcessor());
        System.out.println("Information of the memory of the desktop: " + computer2.getMemory());
        
        ((Desktop) computer2).update("NewProcessor", 32);

        computer1.turnOff();
        computer2.turnOff();
    }
}
