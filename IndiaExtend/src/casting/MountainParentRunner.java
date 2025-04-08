package casting;

public class MountainParentRunner {
    public static void main(String[] args) {

        MountainParent obj1 = new MountainParent();
        obj1.category();
        obj1.highestPeak();
        obj1.mountainRange();
        obj1.climate();
        obj1.famousTrek();
        System.out.println("----------------------");

        MountainParent obj2 = new MountainParentDetails();
        obj2.category();
        obj2.highestPeak();
        obj2.mountainRange();
        obj2.climate();
        obj2.famousTrek();
        System.out.println("----------------------");

        MountainParentDetails obj3 = new MountainParentDetails();
        obj3.category();
        obj3.highestPeak();
        obj3.mountainRange();
        obj3.climate();
        obj3.famousTrek();
        obj3.extraMethod();
        System.out.println("----------------------");

        MountainParentCast caster = new MountainParentCast();
        caster.cast(obj2);
    }
}
