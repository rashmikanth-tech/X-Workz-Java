package casting;

public class QuasarParentCast {
    public void cast(QuasarParent obj) {
        System.out.println("Casting QuasarParent");
        obj.category();
        obj.quasarEnergySource();
        obj.brightestQuasar();
        obj.quasarRedshift();
        obj.quasarDiscovery();
        if(obj instanceof QuasarParentDetails) {
            QuasarParentDetails ref = (QuasarParentDetails)obj;
            ref.extraMethod();
        }
    }
}
