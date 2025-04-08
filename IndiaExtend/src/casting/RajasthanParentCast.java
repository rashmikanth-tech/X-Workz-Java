package casting;

public class RajasthanParentCast {
    public void cast(RajasthanParent obj) {
        System.out.println("Casting RajasthanParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof RajasthanParentDetails) {
            RajasthanParentDetails ref = (RajasthanParentDetails)obj;
            ref.extraMethod();
        }
    }
}
