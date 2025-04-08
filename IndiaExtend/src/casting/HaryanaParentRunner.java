package casting;

public class HaryanaParentRunner {
    public static void main(String[] args) {

        HaryanaParent obj1 = new HaryanaParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        HaryanaParent obj2 = new HaryanaParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        HaryanaParentDetails obj3 = new HaryanaParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        HaryanaParentCast caster = new HaryanaParentCast();
        caster.cast(obj2);
    }
}
