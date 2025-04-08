package casting;

public class RiverParentRunner {
    public static void main(String[] args) {

        RiverParent obj1 = new RiverParent();
        obj1.category();
        obj1.longestRiver();
        obj1.deepestRiver();
        obj1.riverSource();
        obj1.riverMouth();
        System.out.println("----------------------");

        RiverParent obj2 = new RiverParentDetails();
        obj2.category();
        obj2.longestRiver();
        obj2.deepestRiver();
        obj2.riverSource();
        obj2.riverMouth();
        System.out.println("----------------------");

        RiverParentDetails obj3 = new RiverParentDetails();
        obj3.category();
        obj3.longestRiver();
        obj3.deepestRiver();
        obj3.riverSource();
        obj3.riverMouth();
        obj3.extraMethod();
        System.out.println("----------------------");

        RiverParentCast caster = new RiverParentCast();
        caster.cast(obj2);
    }
}
