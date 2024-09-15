
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(ArrayList<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }

    public static void main(String[] Args){
        System.out.println("Address Book");
    }
}
