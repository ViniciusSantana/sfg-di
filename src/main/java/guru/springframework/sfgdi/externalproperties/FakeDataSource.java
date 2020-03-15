package guru.springframework.sfgdi.externalproperties;

public class FakeDataSource {
    private String user;
    private String password;
    private String url;

    public FakeDataSource(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public FakeDataSource() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
