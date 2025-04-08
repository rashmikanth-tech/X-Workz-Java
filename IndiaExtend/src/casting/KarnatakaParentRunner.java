package casting;

public class KarnatakaParentRunner {
    public static void main(String[] args) {

        KarnatakaParent obj1 = new KarnatakaParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        KarnatakaParent obj2 = new KarnatakaParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        KarnatakaParentDetails obj3 = new KarnatakaParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        KarnatakaParentCast caster = new KarnatakaParentCast();
        caster.cast(obj2);
    }
}
