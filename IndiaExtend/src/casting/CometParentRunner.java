package casting;

public class CometParentRunner {
    public static void main(String[] args) {

        CometParent obj1 = new CometParent();
        obj1.category();
        obj1.famousComet();
        obj1.cometTailFormation();
        obj1.cometOrbit();
        obj1.cometComposition();
        System.out.println("----------------------");

        CometParent obj2 = new CometParentDetails();
        obj2.category();
        obj2.famousComet();
        obj2.cometTailFormation();
        obj2.cometOrbit();
        obj2.cometComposition();
        System.out.println("----------------------");

        CometParentDetails obj3 = new CometParentDetails();
        obj3.category();
        obj3.famousComet();
        obj3.cometTailFormation();
        obj3.cometOrbit();
        obj3.cometComposition();
        obj3.extraMethod();
        System.out.println("----------------------");

        CometParentCast caster = new CometParentCast();
        caster.cast(obj2);
    }
}
