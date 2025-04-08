package casting;

public class RajasthanParentRunner {
    public static void main(String[] args) {

        RajasthanParent obj1 = new RajasthanParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        RajasthanParent obj2 = new RajasthanParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        RajasthanParentDetails obj3 = new RajasthanParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        RajasthanParentCast caster = new RajasthanParentCast();
        caster.cast(obj2);
    }
}
