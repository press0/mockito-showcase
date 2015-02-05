package schuchert;

/**
 * Created by q on 2/4/15.
 */
public interface IAccountRepository {
    IAccount find(String accountId);
}