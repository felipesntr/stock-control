package core.usecase.lists;

import java.util.ArrayList;

import core.entity.Client;
import core.repository.ClientRepository;

public class GetClients {

    private ClientRepository clientRepository;

    public GetClients(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ArrayList<Client> execute() {
        return clientRepository.getAll();
    }
}
