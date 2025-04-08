package casting;

public class TelanganaParentCast {
    public void cast(TelanganaParent obj) {
        System.out.println("Casting TelanganaParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof TelanganaParentDetails) {
            TelanganaParentDetails ref = (TelanganaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
