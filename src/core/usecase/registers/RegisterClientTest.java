package core.usecase.registers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import core.entity.Client;
import core.repository.ClientRepository;

public class RegisterClientTest {

    class ClientRepositoryMemory implements ClientRepository {

        @Override
        public boolean saveClient(Client client) {
            if (client.getId() == null ||
                    client.getName() == null ||
                    client.getSurname() == null ||
                    client.getPhone() == null ||
                    client.getAddress() == null ||
                    client.getDocument() == null

            ) {
                return false;
            }
            return true;
        }

        @Override
        public ArrayList<Client> getAll() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Client getCientById(String id) {
            // TODO Auto-generated method stub
            return null;
        }
    }

    @Test
    public void register_with_some_atr_null() {
        ClientRepositoryMemory registerClientRepository = new ClientRepositoryMemory();
        RegisterClient registerClient = new RegisterClient(registerClientRepository);
        boolean registration_result;
        Client client;
        // ensure that the client is not registered if least one field is null
        client = new Client("valid", null, "valid", "valid", "valid", "valid");
        registration_result = registerClient.execute(client);
        assertEquals(false, registration_result);

        client = new Client("valid", "valid", null, "valid", "valid", "valid");
        registration_result = registerClient.execute(client);
        assertEquals(false, registration_result);

        client = new Client("valid", "valid", "valid", null, "valid", "valid");
        registration_result = registerClient.execute(client);
        assertEquals(false, registration_result);

        client = new Client("valid", "valid", "valid", "valid", null, "valid");
        registration_result = registerClient.execute(client);
        assertEquals(false, registration_result);

        client = new Client("valid", "valid", "valid", "valid", "valid", null);
        registration_result = registerClient.execute(client);
        assertEquals(false, registration_result);
    }
}
