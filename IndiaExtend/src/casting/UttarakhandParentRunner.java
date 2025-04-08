package casting;

public class UttarakhandParentRunner {
    public static void main(String[] args) {

        UttarakhandParent obj1 = new UttarakhandParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        UttarakhandParent obj2 = new UttarakhandParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        UttarakhandParentDetails obj3 = new UttarakhandParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        UttarakhandParentCast caster = new UttarakhandParentCast();
        caster.cast(obj2);
    }
}
