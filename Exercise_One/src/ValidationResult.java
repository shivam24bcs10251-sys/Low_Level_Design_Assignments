import java.util.ArrayList;
import java.util.List;

class ValidationResult {

    private List<String> errors = new ArrayList<>();

    void addError(String error) {
        errors.add(error);
    }

    boolean isValid() {
        return errors.isEmpty();
    }

    List<String> getErrors() {
        return errors;
    }
}