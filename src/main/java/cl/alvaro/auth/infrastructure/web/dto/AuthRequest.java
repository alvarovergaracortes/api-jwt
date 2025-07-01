package cl.alvaro.auth.infrastructure.web.dto;

public record AuthRequest(
    String username,
    String password    
){}
