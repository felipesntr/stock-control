package core.usecase.registers;

import core.entity.Client;
import core.repository.ClientRepository;

public class RegisterClient {
    private ClientRepository registerClientRepository;

    public RegisterClient(ClientRepository registerClientRepository) {
        this.registerClientRepository = registerClientRepository;
    }

    public boolean execute(Client client) {
        boolean result = registerClientRepository.saveClient(client);
        return result;
    }
}
