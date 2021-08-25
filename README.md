# Ejemplo de Http Basic authentication con SpringBoot


## Parte 1: Configuración por defecto de SpringBoot 

1. Este repositorio contiene un único endpoint que devuelve datos en JSON. 

- Cuál es el endpoint? Qué datos devuelve?
- Comprueba si puedes acceder al endpoint desde un navegador

2. Añade la siguiente dependencia a tu proyecto para activar la seguridad de SpringBoot

```
 'org.springframework.boot:spring-boot-starter-security'
```

Intenta ahora volver a acceder al endpoint. [Más información...](https://www.appsdeveloperblog.com/spring-security-default-username-password-role/)

3. Vuelve a lanzar el servidor, pero antes de introducir el nombre de usuario y contraseña, abre el inspector de red (network) de tu navegador. 

- Examina los `Headers` de la petición `GET /books`.
- Como puedes observar, una vez introducimos usuario y contraseña la aplicación no nos los vuelve a pedir. Dónde crees que se almacena esta información?


## Parte 2: Configurando HTTP Basic Authentication

1. Abre [este tutorial](https://www.baeldung.com/spring-security-basic-authentication) y copia las clases `MyBasicAuthenticationEntryPoint` 
y `CustomWebSecurityConfigurerAdapter` en tu proyecto. Arregla los errores que pueda haber en el código y vuelve a lanzar el servidor.

   - ❗️Puedes **eliminar** este código de `CustomWebSecurityConfigurerAdapter` ya que no tenemos ningún `CustomFilter`:
    ```
        http.addFilterAfter(new CustomFilter(),
          BasicAuthenticationFilter.class);
    ```
   
2. Examina el código que has añadido: Cuál es el nombre y la contraseña?
3. Examina los headers de las peticiones http que hacemos a la aplicación. Dónde se almacena el nombre de usuario y contraseña? [Más información...](https://diego.com.es/autenticacion-http) 
4. Haz un login **incorrecto** y examina la respuesta (con error `401`). Qué información nos proporcionan los `Headers` de la respuesta?


