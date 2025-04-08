package casting;

public class PunjabParentCast {
    public void cast(PunjabParent obj) {
        System.out.println("Casting PunjabParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof PunjabParentDetails) {
            PunjabParentDetails ref = (PunjabParentDetails)obj;
            ref.extraMethod();
        }
    }
}
