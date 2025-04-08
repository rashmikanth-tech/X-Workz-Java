package casting;

public class HaryanaParentCast {
    public void cast(HaryanaParent obj) {
        System.out.println("Casting HaryanaParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof HaryanaParentDetails) {
            HaryanaParentDetails ref = (HaryanaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
