package core.repository;

import java.util.ArrayList;

import core.entity.Client;

public interface ClientRepository {
    public Client getCientById(String id);

    public boolean saveClient(Client client); // return true if client is saved

    public ArrayList<Client> getAll();
}
