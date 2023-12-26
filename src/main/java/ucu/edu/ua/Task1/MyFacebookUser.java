package ucu.edu.ua.Task1;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public String getLastActiveDate() {
        return facebookUser.getLastActiveTime().toLocalDate();
    }
    
}
