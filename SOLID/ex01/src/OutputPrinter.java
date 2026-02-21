class OutputPrinter {

    void printSuccess(StudentRecord record, int total) {
        System.out.println("OK: created student " + record.getId());
        System.out.println("Saved. Total students: " + total);
        System.out.println("CONFIRMATION:");
        System.out.println(record);
    }

    void printErrors(ValidationResult result) {
        for (String error : result.getErrors()) {
            System.out.println("ERROR: " + error);
        }
    }
}