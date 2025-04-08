package casting;

public class GujaratParentRunner {
    public static void main(String[] args) {

        GujaratParent obj1 = new GujaratParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        GujaratParent obj2 = new GujaratParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        GujaratParentDetails obj3 = new GujaratParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        GujaratParentCast caster = new GujaratParentCast();
        caster.cast(obj2);
    }
}
