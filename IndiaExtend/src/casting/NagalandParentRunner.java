package casting;

public class NagalandParentRunner {
    public static void main(String[] args) {

        NagalandParent obj1 = new NagalandParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        NagalandParent obj2 = new NagalandParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        NagalandParentDetails obj3 = new NagalandParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        NagalandParentCast caster = new NagalandParentCast();
        caster.cast(obj2);
    }
}
