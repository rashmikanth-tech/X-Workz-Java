package casting;

public class KeralaParentCast {
    public void cast(KeralaParent obj) {
        System.out.println("Casting KeralaParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof KeralaParentDetails) {
            KeralaParentDetails ref = (KeralaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
