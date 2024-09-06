# Proyecto-Scalable-E-Commerce-Plataform
Esta API está desarrollada en Java utilizando el framework Spring Boot y está diseñada para gestionar el comportamiento completo de una tienda virtual o e-commerce. La API incluye funcionalidades como la gestión de usuarios, catálogos de productos, y carritos de compra, así como servicios para administradores que permiten la creación y eliminación de productos y usuarios.

Tecnologías Utilizadas
Java: Lenguaje de programación principal.
Spring Boot: Framework para la creación de aplicaciones web y servicios REST.
JWT (JSON Web Token): Utilizado para la autenticación y autorización de usuarios.
Spring Security: Para proteger los endpoints y gestionar el control de acceso.
Hibernate/JPA: Para la persistencia de datos y la interacción con bases de datos relacionales.
Servicios Principales
Servicio de Usuarios:

Maneja el registro, autenticación y gestión de perfiles de usuarios.
Utiliza JWT para proteger los endpoints y garantizar que solo los usuarios autenticados puedan acceder a ciertos recursos.
Servicio de Catálogo de Productos:

Gestiona la creación, actualización y eliminación de productos en el catálogo.
Permite la búsqueda de productos por nombre y categoría, lo que facilita la navegación del usuario en la tienda virtual.
Servicio de Carrito de Compras:

Permite a los usuarios añadir, eliminar y modificar los productos en su carrito de compras.
Actualiza automáticamente los precios y cantidades de los productos en el carrito.
Servicio de Administración (Administrador):

Proporciona un conjunto de endpoints exclusivos para los administradores, que permiten la gestión de productos y usuarios.
Incluye funcionalidades como la promoción de usuarios a administradores, creación de nuevos productos y eliminación de usuarios o productos.
