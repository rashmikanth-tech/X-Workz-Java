package casting;

public class ManipurParentCast {
    public void cast(ManipurParent obj) {
        System.out.println("Casting ManipurParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof ManipurParentDetails) {
            ManipurParentDetails ref = (ManipurParentDetails)obj;
            ref.extraMethod();
        }
    }
}
