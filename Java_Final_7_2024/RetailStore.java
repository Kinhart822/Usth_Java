package Java_Final_7_2024;

public class RetailStore {
    public static void main(String[] args) {
        Equipment equipments = new Equipment(null, null, 0);

        Equipment equipment1 = new Equipment("PlayStation", "Console", 1200);
        equipments.addEquipment(equipment1);

        Equipment equipment2 = new Equipment("Xbox", "Console1", 1100);
        equipments.addEquipment(equipment2);

        Equipment equipment3 = new Equipment("Nintendo Switch", "Console2", 1000);
        equipments.addEquipment(equipment3);

        equipments.writeToFile();
    }
}
