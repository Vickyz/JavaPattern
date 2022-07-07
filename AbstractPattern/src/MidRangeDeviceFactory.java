public class MidRangeDeviceFactory extends ElectronicDeviceAbtractFactory{
    @Override
    Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
