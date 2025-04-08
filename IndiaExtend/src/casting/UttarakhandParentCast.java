package casting;

public class UttarakhandParentCast {
    public void cast(UttarakhandParent obj) {
        System.out.println("Casting UttarakhandParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof UttarakhandParentDetails) {
            UttarakhandParentDetails ref = (UttarakhandParentDetails)obj;
            ref.extraMethod();
        }
    }
}
