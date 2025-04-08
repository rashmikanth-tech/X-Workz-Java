package casting;

public class MadhyaPradeshParentRunner {
    public static void main(String[] args) {

        MadhyaPradeshParent obj1 = new MadhyaPradeshParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        MadhyaPradeshParent obj2 = new MadhyaPradeshParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        MadhyaPradeshParentDetails obj3 = new MadhyaPradeshParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        MadhyaPradeshParentCast caster = new MadhyaPradeshParentCast();
        caster.cast(obj2);
    }
}
