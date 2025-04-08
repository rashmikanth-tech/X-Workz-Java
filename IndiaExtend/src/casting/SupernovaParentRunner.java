package casting;

public class SupernovaParentRunner {
    public static void main(String[] args) {

        SupernovaParent obj1 = new SupernovaParent();
        obj1.category();
        obj1.typesOfSupernovae();
        obj1.supernovaBrightness();
        obj1.supernovaFormation();
        obj1.elementsFromSupernova();
        System.out.println("----------------------");

        SupernovaParent obj2 = new SupernovaParentDetails();
        obj2.category();
        obj2.typesOfSupernovae();
        obj2.supernovaBrightness();
        obj2.supernovaFormation();
        obj2.elementsFromSupernova();
        System.out.println("----------------------");

        SupernovaParentDetails obj3 = new SupernovaParentDetails();
        obj3.category();
        obj3.typesOfSupernovae();
        obj3.supernovaBrightness();
        obj3.supernovaFormation();
        obj3.elementsFromSupernova();
        obj3.extraMethod();
        System.out.println("----------------------");

        SupernovaParentCast caster = new SupernovaParentCast();
        caster.cast(obj2);
    }
}
