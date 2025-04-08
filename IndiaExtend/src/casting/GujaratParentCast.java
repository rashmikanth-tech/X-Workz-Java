package casting;

public class GujaratParentCast {
    public void cast(GujaratParent obj) {
        System.out.println("Casting GujaratParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof GujaratParentDetails) {
            GujaratParentDetails ref = (GujaratParentDetails)obj;
            ref.extraMethod();
        }
    }
}
