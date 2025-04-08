package casting;

public class KeralaParentRunner {
    public static void main(String[] args) {

        KeralaParent obj1 = new KeralaParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        KeralaParent obj2 = new KeralaParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        KeralaParentDetails obj3 = new KeralaParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        KeralaParentCast caster = new KeralaParentCast();
        caster.cast(obj2);
    }
}
