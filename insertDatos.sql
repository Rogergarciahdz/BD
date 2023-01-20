/*USUARIOS*/
INSERT INTO `mydb`.`usuario` (`nombre`, `apellido`, `correo`, `telefono`, `password`, `fecha_nacimiento`, `sexo`) 
VALUES ('rogelio', 'garcia', 'roge@gmal', '4343434634', '1234', '95-11-18', 'm');
INSERT INTO `mydb`.`usuario` (`nombre`, `apellido`, `correo`, `telefono`, `password`, `fecha_nacimiento`, `sexo`) 
VALUES ('Ana', 'Lopez', 'any_lop@gmal.com', '654358913', 'bggcvg', '97-02-06', 'f');
INSERT INTO `mydb`.`usuario` (`nombre`, `apellido`, `correo`, `telefono`, `password`, `fecha_nacimiento`, `sexo`) 
VALUES ('Sharon', 'Toral', 'shabeli@gmal.com', '550225252', 'lalalala', '96-12-06', 'f');
INSERT INTO `mydb`.`usuario` (`nombre`, `apellido`, `correo`, `telefono`, `password`, `fecha_nacimiento`, `sexo`) 
VALUES ('Carlos', 'Rodriguez', 'ro_kal@gmal.com', '436871532', 'l545uiga', '86-11-07', 'm');
INSERT INTO `mydb`.`usuario` (`nombre`, `apellido`, `correo`, `telefono`, `password`, `fecha_nacimiento`, `sexo`) 
VALUES ('Juan', 'Perez', 'juanpe62@gmal.com', '65486153210', 'contraseña', '78-05-24', 'm');
/*CATEGORÍAS*/
INSERT INTO `mydb`.`categoria` (`nombre`) VALUES ('carpinteria');
INSERT INTO `mydb`.`categoria` (`nombre`) VALUES ('plomeria');
INSERT INTO `mydb`.`categoria` (`nombre`) VALUES ('jardineria');
INSERT INTO `mydb`.`categoria` (`nombre`) VALUES ('mecánica');
INSERT INTO `mydb`.`categoria` (`nombre`) VALUES ('belleza');
/*PUBLICACIÓN*/
INSERT INTO `mydb`.`publicacion` (`ofrece`, `titulo`, `descripcion`, `img`, `usuario_id`, `categoria_id`, `fecha`) 
VALUES ('s', 'mi taller', 'este es mi taller, en el trabajo con mi familia', 'archivo.pnj', '1', '1', '23-01-04');
INSERT INTO `mydb`.`publicacion` (`ofrece`, `titulo`, `descripcion`, `img`, `usuario_id`, `categoria_id`, `fecha`) 
VALUES ('s', 'mi lugar de trabajo', 'este es mi taller donde trabajo', 'archivo.pnj', '2', '2', '23-10-04');
INSERT INTO `mydb`.`publicacion` (`ofrece`, `titulo`, `descripcion`, `img`, `usuario_id`, `categoria_id`, `fecha`) 
VALUES ('s', 'mueble', 'como queda una vez terminado', 'archivo.pnj', '3', '3', '23-12-10');
INSERT INTO `mydb`.`publicacion` (`ofrece`, `titulo`, `descripcion`, `img`, `usuario_id`, `categoria_id`, `fecha`) 
VALUES ('s', 'mi taller', 'este es mi taller mecanico', 'archivo.pnj', '4', '4', '22-12-07');
INSERT INTO `mydb`.`publicacion` (`ofrece`, `titulo`, `descripcion`, `img`, `usuario_id`, `categoria_id`, `fecha`) 
VALUES ('s', 'electricista', 'arreglando instalacion electrica', 'archivo.pnj', '5', '5', '22-11-02');
/*REACCIONES*/
INSERT INTO `mydb`.`reacciones` (`usuario_id`, `publicacion_id`) 
VALUES (1, 2);
INSERT INTO `mydb`.`reacciones` (`usuario_id`, `publicacion_id`) VALUES (2, 3);
INSERT INTO `mydb`.`reacciones` (`usuario_id`, `publicacion_id`) VALUES (3, 4);
INSERT INTO `mydb`.`reacciones` (`usuario_id`, `publicacion_id`) VALUES (4, 5);
INSERT INTO `mydb`.`reacciones` (`usuario_id`, `publicacion_id`) VALUES (3, 5);