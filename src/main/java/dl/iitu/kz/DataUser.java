package dl.iitu.kz;
import java.util.List;

public class DataUser {
    List<Account> usersList;

    public List<Account> getUsersList() {
        return usersList;

    }

    public void setUsersList(List<Account> usersList) {
        this.usersList = usersList;
    }
    public void listOfUsers() {
        for (Account account : this.getUsersList()) {
            System.out.println(account.getUsername());
        }
    }
}
