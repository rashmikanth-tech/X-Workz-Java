package casting;

public class WestBengalParentRunner {
    public static void main(String[] args) {

        WestBengalParent obj1 = new WestBengalParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        WestBengalParent obj2 = new WestBengalParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        WestBengalParentDetails obj3 = new WestBengalParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        WestBengalParentCast caster = new WestBengalParentCast();
        caster.cast(obj2);
    }
}
