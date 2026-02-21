class StudentParser {

    StudentRegistrationData parse(String raw) {
        String[] parts = raw.split(";");
        String name = "";
        String email = "";
        String phone = "";
        String program = "";

        for (String part : parts) {
            String[] kv = part.split("=");
            if (kv.length != 2) continue;

            String key = kv[0].trim();
            String value = kv[1].trim();

            if (key.equals("name")) name = value;
            if (key.equals("email")) email = value;
            if (key.equals("phone")) phone = value;
            if (key.equals("program")) program = value;
        }

        return new StudentRegistrationData(name, email, phone, program);
    }
}