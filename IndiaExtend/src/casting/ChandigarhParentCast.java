package casting;

public class ChandigarhParentCast {
    public void cast(ChandigarhParent obj) {
        System.out.println("Casting ChandigarhParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof ChandigarhParentDetails) {
            ChandigarhParentDetails ref = (ChandigarhParentDetails)obj;
            ref.extraMethod();
        }
    }
}
