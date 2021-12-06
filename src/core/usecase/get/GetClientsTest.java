package core.usecase.get;

import java.util.ArrayList;

import org.junit.Test;

import core.entity.Client;
import core.repository.ClientRepository;

public class GetClientsTest {

    class ClientRepositoryMemory implements ClientRepository {

        private ArrayList<Client> clients = new ArrayList<Client>();

        Client client_1 = new Client("lorem", "lorem", "lorem", "lorem", "lorem", "lorem");
        Client client_2 = new Client("lorem", "lorem", "lorem", "lorem", "lorem", "lorem");
        Client client_3 = new Client("lorem", "lorem", "lorem", "lorem", "lorem", "lorem");
        Client client_correct = new Client("correct_id", "lorem", "lorem", "lorem", "lorem", "lorem");

        public ClientRepositoryMemory() {
            clients.add(client_1);
            clients.add(client_2);
            clients.add(client_3);
            clients.add(client_correct);
        }

        @Override
        public Client getCientById(String id) {
            for (Client client : clients) {
                if (client.getId().equals(id)) {
                    return client;
                }
            }
            return null;
        }

        @Override
        public boolean saveClient(Client client) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public ArrayList<Client> getAll() {
            return clients;
        }

    }

    @Test
    public void assert_that_get_all_return_all_clients() {
        ClientRepositoryMemory clientRepository = new ClientRepositoryMemory();
        GetClients getClients = new GetClients(clientRepository);
        ArrayList<Client> clients = getClients.getAll();
        assert clients.size() == 4;
    }

    public void should_return_null_if_invalid_id_is_provided() {
        ClientRepositoryMemory clientRepository = new ClientRepositoryMemory();
        GetClients getClients = new GetClients(clientRepository);
        Client client = getClients.getCientById("invalid_id");
        assert client == null;
    }

    public void should_return_product_if_valid_id_is_provided() {
        ClientRepositoryMemory clientRepository = new ClientRepositoryMemory();
        GetClients getClients = new GetClients(clientRepository);
        Client client = getClients.getCientById("correct_id");
        assert client.getId().equals("correct_id");
    }
}
