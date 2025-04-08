package casting;

public class MizoramParentCast {
    public void cast(MizoramParent obj) {
        System.out.println("Casting MizoramParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof MizoramParentDetails) {
            MizoramParentDetails ref = (MizoramParentDetails)obj;
            ref.extraMethod();
        }
    }
}
