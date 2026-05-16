-- Precarga de datos para H2
-- Este archivo se ejecuta automáticamente al iniciar la aplicación

-- Insertar Usuarios
INSERT INTO USUARIOS (nombre_completo, tipo_documento, num_documento, edad, genero, email, user_name, password, rol, fecha_registro) 
VALUES 
('Marlon Hoyos', 'Cedula', '1026141762', 30, 'Masculino','marlon@example.com','marhoy90','pass123','admin', CURRENT_DATE),
('María García', 'Cedula', '0987654321', 28, 'Femenino','maria@example.com','maria_garcia','pass123','user', CURRENT_DATE),
('Carlos López', 'Cedula', '1122334455', 35, 'Masculino','carlos@example.com','carloslopez','pass123','user', CURRENT_DATE);


-- Insertar Categorías
INSERT INTO CATEGORIAS (fecha_creacion, referencia, nombre, descripcion, estado, prioridad, color, icono, fecha_actualizacion) 
VALUES 
(CURRENT_DATE,'CAT-001','Alimentación','Gastos en comida y bebidas','Activo','Alta','Verde', 'bi-cup-hot',CURRENT_DATE),
(CURRENT_DATE,'CAT-002','Tecnología','Gastos en tecnología','Activo','Alta','Azul', 'bi-pc-display',CURRENT_DATE),
(CURRENT_DATE,'CAT-003','Hogar','Gastos en hogar','Activo','Media','Naranja', 'bi-house',CURRENT_DATE),
(CURRENT_DATE,'CAT-004','Salud','Gastos en salud','Activo','Alta','Rojo', 'bi-heart-pulse',CURRENT_DATE),
(CURRENT_DATE,'CAT-005','Transporte','Gastos en transporte','Activo','Alta','Cian', 'bi-bus',CURRENT_DATE),
(CURRENT_DATE,'CAT-006','Entretenimiento','Gastos en entretenimiento','Activo','Media','Morado', 'bi-gamepad',CURRENT_DATE);


-- Insertar Medios de Pago
INSERT INTO MEDIO_PAGO (nombre, tipo, estado, descripcion) 
VALUES 
('Efectivo', 'Efectivo', 'Activo', 'Pago en efectivo'),
('Tarjeta Débito', 'Débito', 'Activo', 'Tarjeta de débito'),
('Tarjeta Crédito', 'Crédito', 'Activo', 'Tarjeta de crédito'),
('Transferencia', 'Transferencia', 'Activo', 'Transferencia bancaria');

-- Insertar Comercios
INSERT INTO COMERCIOS (nit, nombre, ciudad, contacto, tipo_empresa, numero_empleados, sector, representante_legal, frecuencia_de_visita) 
VALUES 
('900123456', 'Supermercado XYZ', 'Bogotá', 'Juan Pérez', 'Retail', 50, 'Alimentos', 'Juan Carlos Mendez', 15),
('900654321', 'Farmacia Central', 'Bogotá', 'María López', 'Farmacias', 20, 'Salud', 'María Rodriguez', 10),
('900789123', 'Restaurante Delicia', 'Bogotá', 'Carlos Ruiz', 'Alimentos', 25, 'Restaurante', 'Carlos Gonzalez', 8);

-- Insertar Gastos
INSERT INTO GASTOS (fk_usuario, descripcion, fecha, valor, emocion, es_recurrente, nivel_necesidad, satisfaccion, es_planeado) 
VALUES 
(1, 'Compra de alimentos', CURRENT_DATE, 50000.00, 'Normal', false, 3, 8, true),
(1, 'Pasaje transporte', CURRENT_DATE, 15000.00, 'Estresado', true, 3, 7, true),
(2, 'Cena en restaurante', CURRENT_DATE, 80000.00, 'Feliz', false, 2, 9, false),
(2, 'Servicios del mes', CURRENT_DATE, 120000.00, 'Normal', true, 3, 6, true),
(3, 'Medicamentos', CURRENT_DATE, 35000.00, 'Preocupado', false, 3, 5, true);
