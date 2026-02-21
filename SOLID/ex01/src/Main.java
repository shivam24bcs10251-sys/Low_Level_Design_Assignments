public class Main {

    public static void main(String[] args) {

        System.out.println("=== Student Onboarding ===");

        String input = "name=Riya;email=riya@sst.edu;phone=9876543210;program=CSE";
        System.out.println("INPUT: " + input);

        StudentParser parser = new StudentParser();
        StudentValidator validator = new StudentValidator();
        IdGenerator idGenerator = new IdGenerator();
        StudentRepository repository = new FakeDb();
        OutputPrinter printer = new OutputPrinter();

        OnboardingService service =
                new OnboardingService(parser, validator, idGenerator, repository, printer);

        service.registerFromRawInput(input);

        repository.dump();
    }
}