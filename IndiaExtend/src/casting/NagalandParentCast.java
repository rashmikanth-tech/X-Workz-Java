package casting;

public class NagalandParentCast {
    public void cast(NagalandParent obj) {
        System.out.println("Casting NagalandParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof NagalandParentDetails) {
            NagalandParentDetails ref = (NagalandParentDetails)obj;
            ref.extraMethod();
        }
    }
}
