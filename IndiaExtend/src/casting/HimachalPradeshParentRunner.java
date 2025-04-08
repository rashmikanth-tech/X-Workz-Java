package casting;

public class HimachalPradeshParentRunner {
    public static void main(String[] args) {

        HimachalPradeshParent obj1 = new HimachalPradeshParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        HimachalPradeshParent obj2 = new HimachalPradeshParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        HimachalPradeshParentDetails obj3 = new HimachalPradeshParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        HimachalPradeshParentCast caster = new HimachalPradeshParentCast();
        caster.cast(obj2);
    }
}
