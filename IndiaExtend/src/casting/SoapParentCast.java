package casting;

public class SoapParentCast {
    public void cast(SoapParent obj) {
        System.out.println("Casting SoapParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof SoapParentDetails) {
            SoapParentDetails ref = (SoapParentDetails)obj;
            ref.extraMethod();
        }
    }
}
