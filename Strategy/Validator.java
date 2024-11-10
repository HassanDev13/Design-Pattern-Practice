package Strategy;

import Strategy.Models.ValidationStrategy;

public class Validator {
    private ValidationStrategy strategy;

    // Constructor accepts a validation strategy
    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to change the strategy at runtime
    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to validate the input using the current strategy
    public boolean validate(String input) {
        return strategy.validate(input);
    }
}
