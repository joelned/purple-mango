import java.util.HashMap;

public class IDandPasswords{
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){
        loginInfo.put("Joel", "abc1234");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}