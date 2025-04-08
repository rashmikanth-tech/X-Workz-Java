package casting;

public class MizoramParentRunner {
    public static void main(String[] args) {

        MizoramParent obj1 = new MizoramParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        MizoramParent obj2 = new MizoramParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        MizoramParentDetails obj3 = new MizoramParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        MizoramParentCast caster = new MizoramParentCast();
        caster.cast(obj2);
    }
}
