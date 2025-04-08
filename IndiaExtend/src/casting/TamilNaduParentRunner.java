package casting;

public class TamilNaduParentRunner {
    public static void main(String[] args) {

        TamilNaduParent obj1 = new TamilNaduParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        TamilNaduParent obj2 = new TamilNaduParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        TamilNaduParentDetails obj3 = new TamilNaduParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        TamilNaduParentCast caster = new TamilNaduParentCast();
        caster.cast(obj2);
    }
}
