package casting;

public class HimachalPradeshParentCast {
    public void cast(HimachalPradeshParent obj) {
        System.out.println("Casting HimachalPradeshParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof HimachalPradeshParentDetails) {
            HimachalPradeshParentDetails ref = (HimachalPradeshParentDetails)obj;
            ref.extraMethod();
        }
    }
}
