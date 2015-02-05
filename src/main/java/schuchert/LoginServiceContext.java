package schuchert;

/**
 * Created by q on 2/4/15.
 */
public abstract class LoginServiceContext {
    private LoginServiceState state;

    public LoginServiceContext(LoginServiceState state) {
        this.state = state;
    }

    public void setState(LoginServiceState state) {
        this.state = state;
    }

    public LoginServiceState getState() {
        return state;
    }
}