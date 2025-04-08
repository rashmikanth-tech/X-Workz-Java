package casting;

public class TripuraParentCast {
    public void cast(TripuraParent obj) {
        System.out.println("Casting TripuraParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof TripuraParentDetails) {
            TripuraParentDetails ref = (TripuraParentDetails)obj;
            ref.extraMethod();
        }
    }
}
