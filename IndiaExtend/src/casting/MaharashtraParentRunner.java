package casting;

public class MaharashtraParentRunner {
    public static void main(String[] args) {

        MaharashtraParent obj1 = new MaharashtraParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        MaharashtraParent obj2 = new MaharashtraParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        MaharashtraParentDetails obj3 = new MaharashtraParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        MaharashtraParentCast caster = new MaharashtraParentCast();
        caster.cast(obj2);
    }
}
