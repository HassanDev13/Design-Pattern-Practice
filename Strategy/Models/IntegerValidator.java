package Strategy.Models;

public class IntegerValidator implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
