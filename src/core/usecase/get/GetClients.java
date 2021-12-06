package core.usecase.get;

import java.util.ArrayList;

import core.entity.Client;
import core.repository.ClientRepository;

public class GetClients {

    private ClientRepository clientRepository;

    public GetClients(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ArrayList<Client> getAll() {
        return clientRepository.getAll();
    }

    public Client getCientById(String id) {
        return clientRepository.getCientById(id);
    }
}