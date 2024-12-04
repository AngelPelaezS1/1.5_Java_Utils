package Nivel1.Exercici5;

import java.io.*;

class SerializableMethod {

    public static void testMethods() {

        Person person = new Person("John", 28);

        serializePerson(person);
        deserializePerson();
    }

    public static void serializePerson(Person person) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.ser");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);

            System.out.println("Person object serialized to the file: person.ser");


            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error while serializing the Person object: " + e.getMessage());
        }
    }

    public static void deserializePerson() {
        try (FileInputStream fileInputStream = new FileInputStream("person.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Person personFromFile = (Person) objectInputStream.readObject();

            System.out.println("Person object deserialized from the file");
            System.out.println("The person: " + personFromFile.getName() + " is " + personFromFile.getAge());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing the Person object: " + e.getMessage());
        }
    }
}