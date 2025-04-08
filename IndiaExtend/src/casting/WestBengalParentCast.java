package casting;

public class WestBengalParentCast {
    public void cast(WestBengalParent obj) {
        System.out.println("Casting WestBengalParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof WestBengalParentDetails) {
            WestBengalParentDetails ref = (WestBengalParentDetails)obj;
            ref.extraMethod();
        }
    }
}
