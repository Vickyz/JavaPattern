public class HighEndDeviceFactory extends ElectronicDeviceAbtractFactory{
    @Override
    Phone getPhone() {
        return new HighEndPhone();
    }

    @Override
    Laptop getLaptop() {
        return new HighEndLaptop();
    }
}
