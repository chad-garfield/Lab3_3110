public class BuddyInfo {

    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo() {
        this.name = null;
        this.address = null;
        this.phone_number = null;
    }

    public BuddyInfo(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Greg");
        System.out.println("Hello " + buddy.getName());
    }
}
