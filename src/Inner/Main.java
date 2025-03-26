package Inner;

public class Main {
    public static void main(String[] args) {
            JailRecords jailRecords = new JailRecords();
            jailRecords.addDetails();

        SatelliteRecords setteliteRecords = new SatelliteRecords();
            setteliteRecords.addDetails();

            IDCardRecord idCardRecord = new IDCardRecord();
            idCardRecord.addIdcard();


            AlianRecords alianRecords = new AlianRecords();
            alianRecords.AlianInit();

            CameraRecords cameraRecords = new CameraRecords();
            cameraRecords.addData();
        }
    }

