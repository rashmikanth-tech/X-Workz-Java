package casting;

public class TelanganaParentRunner {
    public static void main(String[] args) {

        TelanganaParent obj1 = new TelanganaParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        TelanganaParent obj2 = new TelanganaParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        TelanganaParentDetails obj3 = new TelanganaParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        TelanganaParentCast caster = new TelanganaParentCast();
        caster.cast(obj2);
    }
}
