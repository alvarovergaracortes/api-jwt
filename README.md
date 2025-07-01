# API JWT - Spring Boot

API RESTful desarrollada en **Java 21** con **Spring Boot**, que implementa autenticación basada en **JWT (JSON Web Tokens)**, manejo centralizado de errores y documentación interactiva con **Swagger OpenAPI 3**.  
Es una api simple con la intencion de mostrar las la seguridad utilizando Spring security en conjunto con JWT.

## 🚀 Características

* Autenticación con JWT
* Arquitectura Hexagonal con enfoque Vertical Slicing
* Manejo global de excepciones
* Swagger UI para probar la API
* Registro de logs con Log4j2

## 🛠️ Tecnologías utilizadas

* Java 21
* Spring Boot
* Spring Security
* JWT (jjwt)
* Maven
* Swagger OpenAPI 3
* Log4j2

## 📁 Estructura del proyecto

```
api-jwt/
├── src/main/java/cl/alvaro/
│   ├── common/                  # Configuración común (seguridad, excepciones, utilitarios)
│   └── auth/                    # Lógica del dominio de autenticación
│       ├── domain/             # Modelos y puertos
│       ├── application/        # Casos de uso
│       └── infrastructure/     # Adaptadores (web, persistencia)
│           └── web/rest/       # Controladores REST
├── src/main/resources/
│   ├── application.properties  # Configuración de la aplicación
│   └── log4j2.xml              # Configuración de logs
├── docs/                       # Documentación del proyecto
├── logs/                       # Archivos de log
└── pom.xml                     # Dependencias Maven
```

## ▶️ Cómo ejecutar el proyecto

```bash
# Clona el repositorio (si aplica)
git clone https://github.com/alvarovergaracortes/api-jwt.git
cd api-jwt

# Construir el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
```

La API estará disponible en: `http://localhost:8082`

## 🔐 Autenticación JWT

Para acceder a los endpoints protegidos:

1. Envía un POST a `/api/auth/login` con credenciales válidas:

```json
{
  "username": "admin",
  "password": "1234"
}
```

2. Recibirás un token JWT:

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."
}
```

3. Usa el token en el encabezado `Authorization`:

```
Authorization: Bearer <token>
```

## 📌 Endpoints principales
```json
| Método | Endpoint        | Descripción                       |
| ------ | --------------- | --------------------------------- |
| POST   | /api/auth/login | Autenticación y generación JWT    |
| GET    | /api/auth/hello | Endpoint protegido (requiere JWT) |
```

## 📖 Swagger UI

Puedes explorar la API desde la interfaz de Swagger:
👉 [http://localhost:8082/swagger-ui.html](http://localhost:8082/swagger-ui.html)

## 👨‍💻 Autor

**Alvaro Vergara Cortés**  
email: alvaro.vergara.cl@gmail.com

---
