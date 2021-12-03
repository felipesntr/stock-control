package core.usecase;

import core.entity.Client;
import core.repository.RegisterClientRepository;

public class RegisterClient {
    private RegisterClientRepository registerClientRepository;

    public RegisterClient(RegisterClientRepository registerClientRepository) {
        this.registerClientRepository = registerClientRepository;
    }

    public boolean execute(Client client) {
        boolean result = registerClientRepository.saveClient(client);
        return result;
    }
}
