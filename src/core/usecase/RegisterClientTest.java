package core.usecase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.entity.Client;
import core.repository.RegisterClientRepository;

public class RegisterClientTest {

    class RegisterClientRepositoryMemory implements RegisterClientRepository {

        @Override
        public Client getCientById(int id) {
            return null;
        }

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
    }

    @Test
    public void register_with_some_atr_null() {
        RegisterClientRepositoryMemory registerClientRepository = new RegisterClientRepositoryMemory();
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
