package casting;

public class OdishaParentCast {
    public void cast(OdishaParent obj) {
        System.out.println("Casting OdishaParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof OdishaParentDetails) {
            OdishaParentDetails ref = (OdishaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
