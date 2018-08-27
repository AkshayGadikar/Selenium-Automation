public class HomePage {

    static String url = "http://www.pluralsight.com";
    static String title = "Pluralsight | Unlimited Online Developer, IT and Creative Training";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
