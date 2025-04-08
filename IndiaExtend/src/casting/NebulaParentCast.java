package casting;

public class NebulaParentCast {
    public void cast(NebulaParent obj) {
        System.out.println("Casting NebulaParent");
        obj.category();
        obj.famousNebula();
        obj.nebulaTypes();
        obj.nebulaFormation();
        obj.nebulaImportance();
        if(obj instanceof NebulaParentDetails) {
            NebulaParentDetails ref = (NebulaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
