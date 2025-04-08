package casting;

public class QuasarParentRunner {
    public static void main(String[] args) {

        QuasarParent obj1 = new QuasarParent();
        obj1.category();
        obj1.quasarEnergySource();
        obj1.brightestQuasar();
        obj1.quasarRedshift();
        obj1.quasarDiscovery();
        System.out.println("----------------------");

        QuasarParent obj2 = new QuasarParentDetails();
        obj2.category();
        obj2.quasarEnergySource();
        obj2.brightestQuasar();
        obj2.quasarRedshift();
        obj2.quasarDiscovery();
        System.out.println("----------------------");

        QuasarParentDetails obj3 = new QuasarParentDetails();
        obj3.category();
        obj3.quasarEnergySource();
        obj3.brightestQuasar();
        obj3.quasarRedshift();
        obj3.quasarDiscovery();
        obj3.extraMethod();
        System.out.println("----------------------");

        QuasarParentCast caster = new QuasarParentCast();
        caster.cast(obj2);
    }
}
