# Products
Programa que simula los productos contenidos en una base de datos (lista), realizado con una arquitectura basada en capas.

- Capa de Presentación (Presentation Layer): contiene los controladores tambien conocida como la capa de controladores (Controller Layer) y funge como puerta de entrada de la API para las solicitudes HTTP del cliente, validar la información y devolver una respuesta HTTP.
- Capa de Servicio (Service Layer): Funge como el cerebro 🧠 de la aplicación, orquesta la lógica de negocio. Cuando el controlador recibe una petición, la delega a un método en esta capa. El servicio coordina las operaciones, llama a otras capas si es necesario y procesa los datos para cumplir con el requerimiento.
- Capa de Dominio (Domain Layer):  Contiene las definiciones de los objetos de negocio, a menudo llamados entidades. Define qué es un "Cliente", un "Producto" o un "Pedido", incluyendo sus atributos y relaciones. A menudo conocida como Capa de Modelo (Model Layer)
- Capa de Acceso a Datos (Data Access Layer): Se encarga exclusivamente de la comunicación con la base de datos. Provee métodos para guardar, buscar, actualizar y eliminar datos (operaciones CRUD). Abstrae la complejidad de la base de datos del resto de la aplicación. También conocida como la Capa de Repositorios (Repository Layer).
