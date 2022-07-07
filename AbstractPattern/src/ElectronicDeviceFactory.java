public class ElectronicDeviceFactory {

    public static ElectronicDeviceAbtractFactory getFactory(Segment segment){
        switch (segment){
            case HIGH_END:
                return new HighEndDeviceFactory();
            case MID_RANGE:
                return new MidRangeDeviceFactory();
            default:
                throw new UnsupportedOperationException("This device unsupported");
        }
    }
}
