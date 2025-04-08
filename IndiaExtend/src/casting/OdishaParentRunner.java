package casting;

public class OdishaParentRunner {
    public static void main(String[] args) {

        OdishaParent obj1 = new OdishaParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        OdishaParent obj2 = new OdishaParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        OdishaParentDetails obj3 = new OdishaParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        OdishaParentCast caster = new OdishaParentCast();
        caster.cast(obj2);
    }
}
