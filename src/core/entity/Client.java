package core.entity;

public class Client {
    private String id;
    private String name;
    private String surname;
    private String phone;
    private String address;
    private String document;

    public Client(String id, String name, String surname, String phone, String address, String document) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.document = document;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getDocument() {
        return document;
    }
}