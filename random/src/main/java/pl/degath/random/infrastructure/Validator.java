package pl.degath.random.infrastructure;

import java.util.List;

public class Validator {

    private Validator() {
        throw new UnsupportedOperationException();
    }

    public static List<? extends Number> hasSizeBiggerThanOne(List<? extends Number> suppliers, String message) {
        if (suppliers == null || suppliers.size() <= 1) {
            throw new ValidationException(message);
        }
        return suppliers;
    }
}