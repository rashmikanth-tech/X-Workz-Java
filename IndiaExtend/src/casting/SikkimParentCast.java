package casting;

public class SikkimParentCast {
    public void cast(SikkimParent obj) {
        System.out.println("Casting SikkimParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof SikkimParentDetails) {
            SikkimParentDetails ref = (SikkimParentDetails)obj;
            ref.extraMethod();
        }
    }
}
