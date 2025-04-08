package casting;

public class UttarPradeshParentRunner {
    public static void main(String[] args) {

        UttarPradeshParent obj1 = new UttarPradeshParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        UttarPradeshParent obj2 = new UttarPradeshParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        UttarPradeshParentDetails obj3 = new UttarPradeshParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        UttarPradeshParentCast caster = new UttarPradeshParentCast();
        caster.cast(obj2);
    }
}
