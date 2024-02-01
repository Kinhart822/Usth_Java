package Java_Final_6_2024;

class Laptop extends Computer {
    private String data;

    public Laptop(String processor, int memory, String data) {
        setProcessor(processor);
        setMemory(memory);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void openLid() {
        System.out.println("Opening lid...");
    }
}

