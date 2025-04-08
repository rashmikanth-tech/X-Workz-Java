package casting;

public class VolcanoParentRunner {
    public static void main(String[] args) {

        VolcanoParent obj1 = new VolcanoParent();
        obj1.category();
        obj1.mostActiveVolcano();
        obj1.highestVolcano();
        obj1.eruptionFrequency();
        obj1.lavaComposition();
        System.out.println("----------------------");

        VolcanoParent obj2 = new VolcanoParentDetails();
        obj2.category();
        obj2.mostActiveVolcano();
        obj2.highestVolcano();
        obj2.eruptionFrequency();
        obj2.lavaComposition();
        System.out.println("----------------------");

        VolcanoParentDetails obj3 = new VolcanoParentDetails();
        obj3.category();
        obj3.mostActiveVolcano();
        obj3.highestVolcano();
        obj3.eruptionFrequency();
        obj3.lavaComposition();
        obj3.extraMethod();
        System.out.println("----------------------");

        VolcanoParentCast caster = new VolcanoParentCast();
        caster.cast(obj2);
    }
}
