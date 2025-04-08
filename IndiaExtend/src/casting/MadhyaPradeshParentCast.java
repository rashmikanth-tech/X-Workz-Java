package casting;

public class MadhyaPradeshParentCast {
    public void cast(MadhyaPradeshParent obj) {
        System.out.println("Casting MadhyaPradeshParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof MadhyaPradeshParentDetails) {
            MadhyaPradeshParentDetails ref = (MadhyaPradeshParentDetails)obj;
            ref.extraMethod();
        }
    }
}
