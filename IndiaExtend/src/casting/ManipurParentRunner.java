package casting;

public class ManipurParentRunner {
    public static void main(String[] args) {

        ManipurParent obj1 = new ManipurParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        ManipurParent obj2 = new ManipurParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        ManipurParentDetails obj3 = new ManipurParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        ManipurParentCast caster = new ManipurParentCast();
        caster.cast(obj2);
    }
}
