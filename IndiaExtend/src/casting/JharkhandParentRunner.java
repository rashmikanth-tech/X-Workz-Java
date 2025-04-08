package casting;

public class JharkhandParentRunner {
    public static void main(String[] args) {

        JharkhandParent obj1 = new JharkhandParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        JharkhandParent obj2 = new JharkhandParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        JharkhandParentDetails obj3 = new JharkhandParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        JharkhandParentCast caster = new JharkhandParentCast();
        caster.cast(obj2);
    }
}
