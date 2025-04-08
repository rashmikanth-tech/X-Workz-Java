package casting;

public class PunjabParentRunner {
    public static void main(String[] args) {

        PunjabParent obj1 = new PunjabParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        PunjabParent obj2 = new PunjabParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        PunjabParentDetails obj3 = new PunjabParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        PunjabParentCast caster = new PunjabParentCast();
        caster.cast(obj2);
    }
}
