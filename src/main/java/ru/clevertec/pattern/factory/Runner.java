package ru.clevertec.pattern.factory;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory factory = createFactoryBySpeciality("java");
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new IllegalArgumentException(speciality + " does not exist");
        }
    }
}
