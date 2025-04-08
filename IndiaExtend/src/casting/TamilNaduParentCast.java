package casting;

public class TamilNaduParentCast {
    public void cast(TamilNaduParent obj) {
        System.out.println("Casting TamilNaduParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof TamilNaduParentDetails) {
            TamilNaduParentDetails ref = (TamilNaduParentDetails)obj;
            ref.extraMethod();
        }
    }
}
