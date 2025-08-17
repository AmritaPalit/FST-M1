public class Activity7 {
    public static void main(String args[]) {
        Mountainbike mb = new Mountainbike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}