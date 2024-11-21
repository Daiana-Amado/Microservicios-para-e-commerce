# Microservicios para Ecommerce
Este repositorio contiene un proyecto de ecommerce desarrollado con una arquitectura basada en microservicios. Cada microservicio está diseñado para gestionar una funcionalidad específica, permitiendo una tienda robusta, escalable y confiable.

## Microservicios
- Productos: Gestión de productos disponibles en la tienda.
No consume a otros servicios.
- Carrito de Compras: Gestión de los productos añadidos por los usuarios.
  Consume el servicio de Productos.
- Ventas: Procesamiento de órdenes y registro de ventas.
  Consume los servicios de Carrito de Compras y Usuarios.
  Integra servicios/API externas para pagos.
- Usuarios: Gestión de clientes y sus datos.
  Consume el servicio de Ventas para obtener el historial de compras.

## Tecnologías y Herramientas
- Eureka Server: Registro y descubrimiento de servicios.
- Feign Client: Comunicación entre microservicios.
- Balanceo de Carga: Manejo eficiente de múltiples instancias.
- API Gateway: Gestión de acceso y protección de datos sensibles.
- Reverse Proxy: Complemento al API Gateway para optimización de peticiones.
- Circuit Breaker: Control de errores y resiliencia del sistema.
- Config Server: Configuración centralizada para todos los servicios.
- SMTP Server: Envío de notificaciones a usuarios.
- Docker: Contenedores individuales para cada servicio.

## Arquitectura
Cada microservicio está desacoplado y se comunica a través de HTTP utilizando Feign, con descubrimiento de servicios gestionado por Eureka Server. La configuración de servicios está centralizada en un Config Server. Las siguientes características fortalecen la arquitectura:

- Resiliencia: Circuit Breaker evita la caída de servicios en cadena.
- Escalabilidad: Balanceo de carga distribuye eficientemente las solicitudes.
- Seguridad: API Gateway protege datos sensibles y autentica solicitudes.
- Portabilidad: Docker aísla cada microservicio, simplificando despliegues.

## Contenedores Docker
Cada microservicio se empaqueta en su propio contenedor Docker, lo que permite:

- Aislamiento completo entre servicios.
- Fácil despliegue en cualquier entorno.
- Escalabilidad independiente por microservicio.

## Notificaciones por Correo
El servidor SMTP se encarga de enviar notificaciones automáticas como:

- Confirmación de compras.
- Promociones especiales.
