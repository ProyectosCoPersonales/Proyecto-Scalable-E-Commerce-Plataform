# Proyecto-Scalable-E-Commerce-Plataform

Servicio de Usuarios
Endpoints para la gestión de usuarios
Obtener todos los usuarios
Endpoint: GET /admin/users
Descripción: Obtiene una lista de todos los usuarios.
Respuesta:
200 OK: Devuelve una lista de usuarios.
Ejemplo de respuesta:
json
Copiar código
[
  {
    "id": 1,
    "nombre": "Juan Perez",
    "email": "juan@example.com",
    "rol": "usuario"
  },
  {
    "id": 2,
    "nombre": "Ana García",
    "email": "ana@example.com",
    "rol": "administrador"
  }
]
Promover usuario a administrador
Endpoint: POST /admin/promote/{userId}
Descripción: Asigna el rol de administrador a un usuario existente.
Parámetros:
userId: ID del usuario a promover (en la URL).
Respuesta:
200 OK: Devuelve el usuario con su rol actualizado.
404 Not Found: Si no se encuentra el usuario.
Servicio de Catálogo de Productos
Endpoints para la gestión de productos
Obtener todos los productos
Endpoint: GET /product/all
Descripción: Devuelve una lista de todos los productos disponibles.
Respuesta:
200 OK: Lista de productos.
Ejemplo de respuesta:
json
Copiar código
[
  {
    "id": 1,
    "nombre": "Camiseta",
    "categoría": "Ropa",
    "precio": 19.99
  },
  {
    "id": 2,
    "nombre": "Zapatos",
    "categoría": "Calzado",
    "precio": 49.99
  }
]
Buscar productos por nombre
Endpoint: GET /product/name/{name}
Descripción: Busca un producto por su nombre.
Parámetros:
name: Nombre del producto a buscar (en la URL).
Respuesta:
200 OK: Devuelve el producto encontrado.
404 Not Found: Si no se encuentra el producto.
Buscar productos por categoría
Endpoint: GET /product/category/{category}
Descripción: Busca productos que pertenecen a una categoría específica.
Parámetros:
category: Categoría de los productos (en la URL).
Respuesta:
200 OK: Lista de productos en la categoría especificada.
Servicio de Carrito de Compras
Endpoints para la gestión del carrito
Añadir ítem al carrito
Endpoint: POST /cart/add
Descripción: Añade un ítem al carrito. Si no existe, se crea uno nuevo.
Parámetros:
cartId: ID del carrito.
productId: ID del producto a añadir.
quantity: Cantidad del producto.
price: Precio del producto.
userId: ID del usuario.
Respuesta:
200 OK: Devuelve el carrito actualizado.
400 Bad Request: Si hay un error en los parámetros.
Eliminar ítem del carrito
Endpoint: DELETE /cart/remove
Descripción: Elimina un ítem del carrito.
Parámetros:
cartId: ID del carrito.
itemId: ID del ítem a eliminar.
Respuesta:
200 OK: Devuelve el carrito actualizado.
400 Bad Request: Si el ítem no existe en el carrito.
Eliminar carrito
Endpoint: DELETE /cart/delete/{cartId}
Descripción: Elimina el carrito especificado por su ID.
Parámetros:
cartId: ID del carrito (en la URL).
Respuesta:
204 No Content: El carrito fue eliminado.
404 Not Found: Si no se encuentra el carrito.
Crear un producto (Administrador)
Endpoint: POST /admin/products
Descripción: Crea un nuevo producto.
Parámetros:
product: Objeto del producto a crear (en el cuerpo de la solicitud).
Respuesta:
200 OK: Devuelve el producto creado.
Eliminar un producto (Administrador)
Endpoint: DELETE /admin/products/{productId}
Descripción: Elimina un producto por su ID.
Parámetros:
productId: ID del producto a eliminar (en la URL).
Respuesta:
204 No Content: El producto fue eliminado.
404 Not Found: Si no se encuentra el producto.
Eliminar un usuario (Administrador)
Endpoint: DELETE /admin/users/{userId}
Descripción: Elimina un usuario por su ID.
Parámetros:
userId: ID del usuario a eliminar (en la URL).
Respuesta:
204 No Content: El usuario fue eliminado.
404 Not Found: Si no se encuentra el usuario.



