class StudentRecord {

    private String id;
    private String name;
    private String email;
    private String phone;
    private String program;

    StudentRecord(String id, String name, String email, String phone, String program) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.program = program;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getProgram() { return program; }

    @Override
    public String toString() {
        return "StudentRecord{id='" + id + "', name='" + name + "', email='" + email +
                "', phone='" + phone + "', program='" + program + "'}";
    }
}