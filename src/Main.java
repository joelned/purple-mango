public class Main{
    public static void main(String[] args){
        IDandPasswords information = new IDandPasswords();
        LoginPage page = new LoginPage(information.getLoginInfo());
    }

}