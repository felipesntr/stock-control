package core.repository;

import core.entity.Client;

public interface ClientRepository {
    public Client getCientById(int id);

    public boolean saveClient(Client client); // return true if client is saved
}
