  package cl.alvaro.auth.domain.port;

public interface AuthRepositoryPort {
	  boolean validate(String username, String password);
  }
