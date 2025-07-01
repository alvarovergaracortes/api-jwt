package cl.alvaro.auth.infrastructure.persistence;

import org.springframework.stereotype.Service;

import cl.alvaro.auth.domain.port.AuthRepositoryPort;

@Service
public class DefaultAuthService implements AuthRepositoryPort {
    @Override
    public boolean validate(String username, String password) {
        return "user".equals(username) && "1234".equals(password);
    }
}

