package schuchert;

/**
 * Created by q on 2/4/15.
 */
public interface IAccount {
    boolean passwordMatches(String candiate);
    void setLoggedIn(boolean value);
    void setRevoked(boolean value);
    boolean isLoggedIn();
    boolean isRevoked();
    String getId();
}