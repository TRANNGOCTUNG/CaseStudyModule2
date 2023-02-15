package account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputAccountManager {
    private List<Account>  listAccountInput = new ArrayList<>();
    private static final String ACCOUNT_REGEX = "^[A-Za-z0-9]{5,16}";
    public String pathInputAccount = "src/fileSave/InputAccountManager";
    public List<Account> getListAccountInput() {
        return listAccountInput;
    }

    public void createAccount(Scanner scanner){
        boolean check = true;
        String name = null;
        String password = null;
        String passwordRe;
        while (check){
            System.out.println("Enter account name:");
            name = scanner.nextLine();
           Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
            Matcher matcher = pattern.matcher(name);
            if(matcher.matches()) {
            }
        }
    }
}
