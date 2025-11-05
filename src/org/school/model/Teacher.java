package org.school.model;

public class Teacher extends Person {
    private final Subject subject;

    // TODO: Complete constructor and call super()
    public Teacher(String first, String last, Subject subject) {
        super(first, last);
        this.subject = subject;
    }

    @Override
    public String present() {
        // TODO: Return formatted string like: "Hello, I'm Mrs. Jones and I teach Math."
        return "Hello, I'm %s, and I teach %s.".formatted(fullName(), subject);
    }
}