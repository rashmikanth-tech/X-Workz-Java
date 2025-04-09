package casting;

public class ChandigarhParentRunner {
    public static void main(String[] args) {

        ChandigarhParent obj1 = new ChandigarhParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        ChandigarhParent obj2 = new ChandigarhParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        ChandigarhParentDetails obj3 = new ChandigarhParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        ChandigarhParentCast caster = new ChandigarhParentCast();
        caster.cast(obj2);

    }
}
