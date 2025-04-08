package casting;

public class DesertParentRunner {
    public static void main(String[] args) {

        DesertParent obj1 = new DesertParent();
        obj1.category();
        obj1.largestDesert();
        obj1.hottestDesert();
        obj1.averageRainfall();
        obj1.desertFlora();
        System.out.println("----------------------");

        DesertParent obj2 = new DesertParentDetails();
        obj2.category();
        obj2.largestDesert();
        obj2.hottestDesert();
        obj2.averageRainfall();
        obj2.desertFlora();
        System.out.println("----------------------");

        DesertParentDetails obj3 = new DesertParentDetails();
        obj3.category();
        obj3.largestDesert();
        obj3.hottestDesert();
        obj3.averageRainfall();
        obj3.desertFlora();
        obj3.extraMethod();
        System.out.println("----------------------");

        DesertParentCast caster = new DesertParentCast();
        caster.cast(obj2);
    }
}
