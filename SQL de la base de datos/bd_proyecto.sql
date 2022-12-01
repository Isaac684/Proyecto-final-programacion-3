CREATE TABLE tbl_especialidad(
	codigocarrera varchar(6) NOT NULL PRIMARY KEY, 
	nombrecarrera VARCHAR(100)
	
);
create table tbl_estudiantes (
	carnetestudiante varchar(7) NOT NULL PRIMARY KEY,
	nombreestudiante VARCHAR(100),
	apellidoestudiante varchar(100),
	codigocarrera VARCHAR(6),
	anio_carrera VARCHAR(20),
	CONSTRAINT fk_carrera FOREIGN KEY (codigocarrera)          
	REFERENCES tbl_especialidad(codigocarrera)
	
	
);

CREATE TABLE tbl_asistencia(
	idasistencia SERIAL NOT NULL PRIMARY KEY, 
	carnetestudiante VARCHAR(7),
	fechaasistencia date,
	asistio bool,
	diasemana varchar(10),
	evento VARCHAR(10),
	CONSTRAINT fk_asistencia FOREIGN KEY (carnetestudiante)          
	REFERENCES tbl_estudiantes(carnetestudiante)
);


insert into tbl_especialidad(codigocarrera,nombrecarrera)values('L10157','Licenciatura en Enfermeria');
insert into tbl_especialidad(codigocarrera,nombrecarrera)values('A10507','Arquitectura');
insert into tbl_especialidad(codigocarrera,nombrecarrera)values('I10501','Ingenieria Civil');
insert into tbl_especialidad(codigocarrera,nombrecarrera)values('I10515','Ingenieria de Sistemas Informaticos');



insert into tbl_estudiantes(carnetestudiante,nombreestudiante,apellidoestudiante,codigocarrera, anio_carrera)
values('IS21001','Angel Fernando','Iraheta Sanchez','I10515','2° Año');
insert into tbl_estudiantes(carnetestudiante,nombreestudiante,apellidoestudiante,codigocarrera, anio_carrera)
values('GP21022','Diego Isaac','Garcia Pimentel','I10515', '2° Año');
















