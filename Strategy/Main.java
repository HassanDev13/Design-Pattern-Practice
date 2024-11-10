package Strategy;

import Strategy.Models.EmailValidator;
import Strategy.Models.IntegerValidator;

public class Main {
    public static void main(String[] args) {

        Validator integerValidator = new Validator(new IntegerValidator());
        System.out.println("Is '123' a valid integer? " + integerValidator.validate("123"));
        System.out.println("Is 'abc' a valid integer? " + integerValidator.validate("abc"));
        // Validate email input
        Validator emailValidator = new Validator(new EmailValidator());
        System.out.println("Is 'example@domain.com' a valid email? " + emailValidator.validate("example@domain.com"));
        System.out.println("Is 'invalid-email' a valid email? " + emailValidator.validate("invalid-email"));

        // Change the strategy to IntegerValidator dynamically
        emailValidator.setStrategy(new IntegerValidator());
        System.out.println("Is '123' a valid integer (after changing strategy)? " + emailValidator.validate("123"));

    }
}
