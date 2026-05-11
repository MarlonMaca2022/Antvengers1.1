-- Precarga de datos para H2
-- Este archivo se ejecuta automáticamente al iniciar la aplicación

-- Insertar Usuarios
INSERT INTO usuarios (nombre_completo, tipo_documento, documento, edad, genero, email, username, contrasena, rol, fecha_registro) 
VALUES 
('Marlon Hoyos', 'CC', '1026141762', 30, 'Masculino','marlon@example.com','marhoy90','pass123','admin', CURRENT_DATE),
('María García', 'CC', '0987654321', 28, 'Femenino','maria@example.com','maria_garcia','pass123','user', CURRENT_DATE),
('Carlos López', 'CC', '1122334455', 35, 'Masculino','carlos@example.com','carloslopez','pass123','user', CURRENT_DATE);


-- Insertar Categorías
INSERT INTO categorias (nombre, descripcion) 
VALUES 
(CURRENT_DATE,'CAT-001','Gastos en comida y bebidas','Activo','Alta','Alimentación','verde', 'bi-cup-hot',CURRENT_DATE),
(CURRENT_DATE,'CAT-002','Gastos en tecnología','Activo','Alta','Tecnología','azul', 'bi-pc-display',CURRENT_DATE),
(CURRENT_DATE,'CAT-003','Gastos en hogar','Activo','Media','Hogar','naranja', 'bi-house',CURRENT_DATE),
(CURRENT_DATE,'CAT-004','Gastos en salud','Activo','Alta','Salud','rojo', 'bi-heart-pulse',CURRENT_DATE),
(CURRENT_DATE,'CAT-005','Gastos en transporte','Activo','Alta','Transporte','gris', 'bi bus',CURRENT_DATE),
(CURRENT_DATE,'CAT-006','Gastos en entretenimiento','Activo','Media','Entretenimiento','morado', 'bi-gamepad',CURRENT_DATE);


-- Insertar Medios de Pago
INSERT INTO medios_pago (nombre, descripcion) 
VALUES 
('Efectivo', 'Pago en efectivo'),
('Tarjeta Débito', 'Tarjeta de débito'),
('Tarjeta Crédito', 'Tarjeta de crédito'),
('Transferencia', 'Transferencia bancaria');

-- Insertar Comercios
INSERT INTO comercios (nombre, telefono, email, ubicacion) 
VALUES 
('Supermercado XYZ', '3001234567', 'info@supermercado.com', 'Calle 10 #5-50'),
('Farmacia Central', '3007654321', 'farmacia@central.com', 'Carrera 7 #8-30'),
('Restaurante Delicia', '3009876543', 'contacto@delicia.com', 'Avenida Principal #100');

-- Insertar Gastos de ejemplo
INSERT INTO gastos (usuario_id, categoria_id, medio_pago_id, comercio_id, monto, fecha, descripcion) 
VALUES 
(1, 1, 1, 1, 50000.00, CURRENT_DATE, 'Compra de alimentos'),
(1, 2, 2, 2, 15000.00, CURRENT_DATE, 'Pasaje transporte'),
(2, 3, 3, 3, 80000.00, CURRENT_DATE, 'Cena en restaurante'),
(2, 4, 1, 1, 120000.00, CURRENT_DATE, 'Servicios del mes'),
(3, 5, 2, 2, 35000.00, CURRENT_DATE, 'Medicamentos');
