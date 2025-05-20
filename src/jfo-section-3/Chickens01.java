public class Chickens01 {
    public static void main(String[] args) {
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs = chickenCount * eggsPerChicken;
        totalEggs = ++chickenCount * eggsPerChicken;
        
        System.out.println(++totalEggs);
    }   
}
