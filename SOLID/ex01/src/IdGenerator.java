class IdGenerator {

    private int counter = 1;

    String generate() {
        return String.format("SST-2026-%04d", counter++);
    }
}