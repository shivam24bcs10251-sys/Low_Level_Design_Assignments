class OnboardingService {

    private StudentParser parser;
    private StudentValidator validator;
    private IdGenerator idGenerator;
    private StudentRepository repository;
    private OutputPrinter printer;

    OnboardingService(StudentParser parser,
                      StudentValidator validator,
                      IdGenerator idGenerator,
                      StudentRepository repository,
                      OutputPrinter printer) {

        this.parser = parser;
        this.validator = validator;
        this.idGenerator = idGenerator;
        this.repository = repository;
        this.printer = printer;
    }

    void registerFromRawInput(String rawInput) {

        StudentRegistrationData data = parser.parse(rawInput);

        ValidationResult result = validator.validate(data);

        if (!result.isValid()) {
            printer.printErrors(result);
            return;
        }

        String id = idGenerator.generate();

        StudentRecord record = new StudentRecord(
                id,
                data.name,
                data.email,
                data.phone,
                data.program
        );

        repository.save(record);

        printer.printSuccess(record, repository.count());
    }
}