package am.panov.models.requests;

public class RegisterUser {
    private String name;
    private String currency;

    public RegisterUser(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    public RegisterUser() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
