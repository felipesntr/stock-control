package core.usecase.lists;

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

        public ClientRepositoryMemory() {
            clients.add(client_1);
            clients.add(client_2);
            clients.add(client_3);
        }

        @Override
        public Client getCientById(int id) {
            // TODO Auto-generated method stub
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
        ArrayList<Client> clients = getClients.execute();
        assert clients.size() == 3;
    }
}
