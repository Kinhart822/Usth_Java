package Java_Final_6_2024;

class Desktop extends Computer {
    public Desktop(String processor, int memory) {
        setProcessor(processor);
        setMemory(memory);
    }

    public void update(String newProcessor, int newMemory) {
        System.out.println("Updating...");
        setProcessor(newProcessor);
        setMemory(newMemory);
    }
}
