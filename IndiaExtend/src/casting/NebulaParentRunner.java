package casting;

public class NebulaParentRunner {
    public static void main(String[] args) {

        NebulaParent obj1 = new NebulaParent();
        obj1.category();
        obj1.famousNebula();
        obj1.nebulaTypes();
        obj1.nebulaFormation();
        obj1.nebulaImportance();
        System.out.println("----------------------");

        NebulaParent obj2 = new NebulaParentDetails();
        obj2.category();
        obj2.famousNebula();
        obj2.nebulaTypes();
        obj2.nebulaFormation();
        obj2.nebulaImportance();
        System.out.println("----------------------");

        NebulaParentDetails obj3 = new NebulaParentDetails();
        obj3.category();
        obj3.famousNebula();
        obj3.nebulaTypes();
        obj3.nebulaFormation();
        obj3.nebulaImportance();
        obj3.extraMethod();
        System.out.println("----------------------");

        NebulaParentCast caster = new NebulaParentCast();
        caster.cast(obj2);
    }
}
