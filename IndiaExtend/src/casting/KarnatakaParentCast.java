package casting;

public class KarnatakaParentCast {
    public void cast(KarnatakaParent obj) {
        System.out.println("Casting KarnatakaParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof KarnatakaParentDetails) {
            KarnatakaParentDetails ref = (KarnatakaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
