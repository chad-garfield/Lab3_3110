
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(ArrayList<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    //testing pulling
    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] Args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        BuddyInfo temp_buddy = addressBook.removeBuddy(0);
    }
}
