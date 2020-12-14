# Spring Boot Config Client

### Refresh Environment

`POST - http://localhost:8080/actuator/refresh`

### Testing

- Load different properties changing active profile, whether using `bootstrap.properties` file or by passing profile using an env variable.

##### query properties

`GET - http://localhost:8080/properties`
