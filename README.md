# Proyecto-Scalable-E-Commerce-Plataform
Este proyecto es una implementación de una plataforma de comercio electrónico basada en una arquitectura de microservicios. 
La arquitectura de microservicios divide la aplicación en varios servicios pequeños e independientes que pueden desarrollarse, 
desplegarse y escalarse de manera autónoma.

**#Microservicios Principales**

##1. Servicio de Usuarios
Maneja el registro de usuarios, la autenticación y la gestión de perfiles.

**TAREAS**
1. Registro de nuevos usuarios.
Función de Usuario: '/api/user/register' **POST**
Función de Usuario: '/api/user/login' **POST**
Función de Admin: '/api/admin/ver/users' **GET**

2. Inicio de sesión y autenticación con JWT (JSON Web Tokens).
Función automática de la api

3. Actualización de perfiles de usuario.
Función de Usuario: '/api/user/editar/user/{id}' **PUT**

4. Gestión de contraseñas y recuperación de cuentas.
Función del Usuario: '/api/user/editar/password/{id}' **PUT**

##2.Servicio de Catálogo de Productos
Administra la lista de productos, las categorías y el inventario.


**TAREAS**
1. Gestión de productos (añadir, actualizar, eliminar).
Función de Admin: '/api/admin/producto' **POST**
                  '/api/admin/producto' **PUT**
                  '/api/admin/producto' **DELETE**

2. Categorización de productos.
Función de User: '/api/user/categoria/{id}' **GET**

3. Control de inventario y disponibilidad de productos.
Función de Sistema: 
Definir tres estados (disponible ,casi agotado ,agotado)

4. Búsqueda y filtrado de productos.
Función del Admin: '/api/admin/producto' **GET**
                   '/api/admin/estado/{id}' **GET**



