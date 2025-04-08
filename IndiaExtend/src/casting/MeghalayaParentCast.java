package casting;

public class MeghalayaParentCast {
    public void cast(MeghalayaParent obj) {
        System.out.println("Casting MeghalayaParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof MeghalayaParentDetails) {
            MeghalayaParentDetails ref = (MeghalayaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
