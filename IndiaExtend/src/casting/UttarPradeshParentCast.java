package casting;

public class UttarPradeshParentCast {
    public void cast(UttarPradeshParent obj) {
        System.out.println("Casting UttarPradeshParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof UttarPradeshParentDetails) {
            UttarPradeshParentDetails ref = (UttarPradeshParentDetails)obj;
            ref.extraMethod();
        }
    }
}
