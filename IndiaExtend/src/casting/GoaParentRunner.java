package casting;

public class GoaParentRunner {
    public static void main(String[] args) {

        GoaParent obj1 = new GoaParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        GoaParent obj2 = new GoaParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        GoaParentDetails obj3 = new GoaParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        GoaParentCast caster = new GoaParentCast();
        caster.cast(obj2);
    }
}
