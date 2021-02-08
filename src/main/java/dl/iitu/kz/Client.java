package dl.iitu.kz;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
public class  Client {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 1000;
        System.out.println("Please enter pin-code:");
        String accountPincode = in.next();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DataUser duser = context.getBean("data", DataUser.class);
        Account account = Check(duser, accountPincode);
        while (choice != 0) {
            System.out.println("1.Deposit");
            System.out.println("2.Withrow");
            System.out.println("3.Check Ballance");

            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter your deposit:");
                    double amount = in.nextDouble();
                    account.deposit(amount);
                    break;


                case 2:
                    System.out.println("Please enter your deposit:");
                    double amount1 = in.nextDouble();
                    account.withdraw(amount1);
                    break;

                case 3:
                    account.info();
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
            }
        }
    }

        public static Account Check (DataUser duser, String pincode){
            for (Account account : duser.getUsersList()) {
                if (account.getPincode().equals(pincode)) { //чекаем вход
                    account.info();
                    return account;
                }
            }
            System.out.println("User not found");
            return null;
        }
    }

