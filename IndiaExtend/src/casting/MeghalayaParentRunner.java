package casting;

public class MeghalayaParentRunner {
    public static void main(String[] args) {

        MeghalayaParent obj1 = new MeghalayaParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        MeghalayaParent obj2 = new MeghalayaParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        MeghalayaParentDetails obj3 = new MeghalayaParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        MeghalayaParentCast caster = new MeghalayaParentCast();
        caster.cast(obj2);
    }
}
