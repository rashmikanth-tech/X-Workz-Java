package casting;

public class SikkimParentRunner {
    public static void main(String[] args) {

        SikkimParent obj1 = new SikkimParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        SikkimParent obj2 = new SikkimParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        SikkimParentDetails obj3 = new SikkimParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        SikkimParentCast caster = new SikkimParentCast();
        caster.cast(obj2);
    }
}
