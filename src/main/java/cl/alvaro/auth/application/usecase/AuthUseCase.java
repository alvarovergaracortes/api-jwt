package cl.alvaro.auth.application.usecase;

import org.springframework.stereotype.Service;

import cl.alvaro.auth.domain.port.AuthRepositoryPort;
import cl.alvaro.common.security.JwtUtil;

@Service
public class AuthUseCase{
	private final AuthRepositoryPort authRepositoryPort;
    private final JwtUtil jwtUtil;

    public AuthUseCase(AuthRepositoryPort authRepositoryPort, JwtUtil jwtUtil) {
        this.authRepositoryPort = authRepositoryPort;
        this.jwtUtil = jwtUtil;
    }

    public String login(String username, String password) {
        if (authRepositoryPort.validate(username, password)) {
        	System.out.println("Usuario: " + username + " " + password);
            return jwtUtil.generateToken(username);
        }
        throw new RuntimeException("Credenciales inválidas");
    }
}
