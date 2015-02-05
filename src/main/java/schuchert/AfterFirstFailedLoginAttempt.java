package schuchert;

/**
 * Created by q on 2/4/15.
 */
public class AfterFirstFailedLoginAttempt extends LoginServiceState {
    private String previousAccountId;

    public AfterFirstFailedLoginAttempt(String previousAccountId) {
        this.previousAccountId = previousAccountId;
    }

    @Override
    public void handleIncorrectPassword(LoginServiceContext context, IAccount account,
                                        String password) {
        if (previousAccountId.equals(account.getId()))
            context.setState(new AfterSecondFailedLoginAttempt(account.getId()));
        else
            previousAccountId = account.getId();
    }
}