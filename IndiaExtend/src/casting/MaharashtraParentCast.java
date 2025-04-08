package casting;

public class MaharashtraParentCast {
    public void cast(MaharashtraParent obj) {
        System.out.println("Casting MaharashtraParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof MaharashtraParentDetails) {
            MaharashtraParentDetails ref = (MaharashtraParentDetails)obj;
            ref.extraMethod();
        }
    }
}
