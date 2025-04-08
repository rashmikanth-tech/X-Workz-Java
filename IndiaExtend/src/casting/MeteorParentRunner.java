package casting;

public class MeteorParentRunner {
    public static void main(String[] args) {

        MeteorParent obj1 = new MeteorParent();
        obj1.category();
        obj1.meteorShowers();
        obj1.meteorSpeed();
        obj1.meteorComposition();
        obj1.meteorImpact();
        System.out.println("----------------------");

        MeteorParent obj2 = new MeteorParentDetails();
        obj2.category();
        obj2.meteorShowers();
        obj2.meteorSpeed();
        obj2.meteorComposition();
        obj2.meteorImpact();
        System.out.println("----------------------");

        MeteorParentDetails obj3 = new MeteorParentDetails();
        obj3.category();
        obj3.meteorShowers();
        obj3.meteorSpeed();
        obj3.meteorComposition();
        obj3.meteorImpact();
        obj3.extraMethod();
        System.out.println("----------------------");

        MeteorParentCast caster = new MeteorParentCast();
        caster.cast(obj2);
    }
}
