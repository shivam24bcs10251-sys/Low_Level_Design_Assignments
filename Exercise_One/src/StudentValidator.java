import java.util.Arrays;
import java.util.List;

class StudentValidator {

    private List<String> allowedPrograms = Arrays.asList("CSE", "ECE", "ME");

    ValidationResult validate(StudentRegistrationData data) {
        ValidationResult result = new ValidationResult();

        if (data.name == null || data.name.isEmpty())
            result.addError("Name cannot be empty");

        if (data.email == null || !data.email.contains("@"))
            result.addError("Invalid email");

        if (data.phone == null || !data.phone.matches("\\d+"))
            result.addError("Phone must contain digits only");

        if (!allowedPrograms.contains(data.program))
            result.addError("Invalid program");

        return result;
    }
}