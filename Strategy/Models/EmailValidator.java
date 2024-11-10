package Strategy.Models;

public class EmailValidator implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        return input != null && input.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
