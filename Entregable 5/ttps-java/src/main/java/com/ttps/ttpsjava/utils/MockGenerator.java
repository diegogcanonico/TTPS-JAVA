package com.ttps.ttpsjava.utils;

import com.ttps.ttpsjava.enums.RedSocialEmpresaEnum;
import com.ttps.ttpsjava.models.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class MockGenerator {
	
	public static Emprendimiento getEmprendimiento1() {
		Emprendimiento emprendimiento = new Emprendimiento();
		emprendimiento.setNombre("Juan1");
		emprendimiento.setDominio("DominioDeJuan");
		emprendimiento.setDescripcion("DescripcionDeJuan");
		emprendimiento.setBanner("https://wwww.bannerDeJuan.com/imagen.png");
		//Se setea una lista de categorías
		Categoria categoria1 = new Categoria();
		Categoria categoria2 = new Categoria();
		categoria1.setNombre("Categoria1");
		categoria1.setDescripcion("DescripcionCategoria1");
		categoria1.setEmprendimiento(emprendimiento);
		categoria2.setNombre("Categoria2");
		categoria2.setDescripcion("DescripcionCategoria2");
		categoria2.setEmprendimiento(emprendimiento);
		Set<Categoria> categorias = new HashSet<Categoria>();
		categorias.add(categoria1);
		categorias.add(categoria2);
		emprendimiento.setCategoria(categorias);
		//Se finaliza la carga de categorias
		emprendimiento.setVistaDonadores(true);
		emprendimiento.setVistaManguitosRecibidos(true);
		//Inicia la carga de redes sociales
		RedSocial redSocial1 = new RedSocial();
		redSocial1.setDominio("redSocialDeJuan");
		redSocial1.setEmpresa(RedSocialEmpresaEnum.Instagram);
		redSocial1.setEmprendimiento(emprendimiento);
		Set<RedSocial>redesSociales = new HashSet<RedSocial>();
		redesSociales.add(redSocial1);
		emprendimiento.setRedSocial(redesSociales);
		emprendimiento.setPrecioActualPorManguito(100.0);
		Plan plan = new Plan();
		plan.setBeneficio("Membresía anual Spotify");
		plan.setCuotas(30);
		plan.setValor(10000.0);
		plan.setEmprendimiento(emprendimiento);
		Set<Plan> planes = new HashSet<Plan>();
		planes.add(plan);
		emprendimiento.setPlanes(planes);
		Donacion donacion = new Donacion();
		donacion.setCantidadManguitos(100);
		donacion.setFecha(LocalDate.now());
		donacion.setMensaje("Se envia una donacion");
		donacion.setNombreDonador("Carlos");
		donacion.setEmprendimiento(emprendimiento);
		Set<Plan> listaPlanes = new HashSet<Plan>();
		listaPlanes.add(plan);
		donacion.setPlan(listaPlanes);
		donacion.setPrecioHistoricoPorManguito(80.0);
		Set<Donacion>donaciones = new HashSet<Donacion>();
		donaciones.add(donacion);
		emprendimiento.setDonaciones(donaciones);
		Posteo posteo = new Posteo();
		posteo.setImagen("https://www.imagenDelPosteo.com/img.png");
		posteo.setNombrePosteo("NombreDelPosteo");
		posteo.setTexto("Este es un texto para el posteo del emprendimiento");
		Emprendimiento emprendimiento2 = new Emprendimiento();
		emprendimiento2.setBanner("emprendimiento 2!!!");
		posteo.setEmprendimiento(emprendimiento);
		posteo.setEmprendimiento(emprendimiento2);
		Set<Posteo>posteos = new HashSet<Posteo>();
		posteos.add(posteo);
		emprendimiento.setPosteos(posteos);
		Usuario usuario = new Usuario();
		usuario.setApellido("Perez");
		usuario.setNombre("Juan");
		usuario.setPassword("qwerty");
		usuario.setUsername("usernameDelUsuario");
		usuario.setEmprendimiento(emprendimiento);
		Rol rol = new Rol();
		rol.setNombreRol("Emprendedor");
		usuario.setRol(rol);
		emprendimiento.setUsuario(usuario);
		return emprendimiento;
	}


	public static Emprendimiento getEmprendimiento2() {
		Emprendimiento emprendimiento = new Emprendimiento();
		emprendimiento.setNombre("Roberto");
		emprendimiento.setDominio("DominioDeRoberto");
		emprendimiento.setDescripcion("DescripcionDeRoberto");
		emprendimiento.setBanner("https://wwww.bannerDeRoberto.com/imagen.png");
		//Se setea una lista de categorías
		Categoria categoria1 = new Categoria();
		Categoria categoria2 = new Categoria();
		categoria1.setNombre("Categoria1");
		categoria1.setDescripcion("DescripcionCategoria1");
		categoria1.setEmprendimiento(emprendimiento);
		categoria2.setNombre("Categoria2");
		categoria2.setDescripcion("DescripcionCategoria2");
		categoria2.setEmprendimiento(emprendimiento);
		Set<Categoria> categorias = new HashSet<Categoria>();
		categorias.add(categoria1);
		categorias.add(categoria2);
		emprendimiento.setCategoria(categorias);
		//Se finaliza la carga de categorias
		emprendimiento.setVistaDonadores(true);
		emprendimiento.setVistaManguitosRecibidos(true);
		//Inicia la carga de redes sociales
		RedSocial redSocial1 = new RedSocial();
		redSocial1.setDominio("redSocialDeRoberto");
		redSocial1.setEmpresa(RedSocialEmpresaEnum.Instagram);
		redSocial1.setEmprendimiento(emprendimiento);
		Set<RedSocial>redesSociales = new HashSet<RedSocial>();
		redesSociales.add(redSocial1);
		emprendimiento.setRedSocial(redesSociales);
		emprendimiento.setPrecioActualPorManguito(100.0);
		Plan plan = new Plan();
		plan.setBeneficio("Membresía anual Amazon Prime");
		plan.setCuotas(30);
		plan.setValor(10000.0);
		plan.setEmprendimiento(emprendimiento);
		Set<Plan> planes = new HashSet<Plan>();
		planes.add(plan);
		emprendimiento.setPlanes(planes);
		Donacion donacion = new Donacion();
		donacion.setCantidadManguitos(100);
		donacion.setFecha(LocalDate.now());
		donacion.setMensaje("Se envia una donacion");
		donacion.setNombreDonador("María");
		donacion.setEmprendimiento(emprendimiento);
		Set<Plan> listaPlanes = new HashSet<Plan>();
		listaPlanes.add(plan);
		donacion.setPlan(listaPlanes);
		donacion.setPrecioHistoricoPorManguito(80.0);
		Set<Donacion>donaciones = new HashSet<Donacion>();
		donaciones.add(donacion);
		emprendimiento.setDonaciones(donaciones);
		Posteo posteo = new Posteo();
		posteo.setImagen("https://www.imagenDelPosteo.com/img.png");
		posteo.setNombrePosteo("NombreDelPosteo");
		posteo.setTexto("Este es un texto para el posteo del emprendimiento");
		Emprendimiento emprendimiento2 = new Emprendimiento();
		emprendimiento2.setBanner("emprendimiento 2!!!");
		posteo.setEmprendimiento(emprendimiento);
		posteo.setEmprendimiento(emprendimiento2);
		Set<Posteo>posteos = new HashSet<Posteo>();
		posteos.add(posteo);
		emprendimiento.setPosteos(posteos);
		Usuario usuario = new Usuario();
		usuario.setApellido("Perez");
		usuario.setNombre("Valeria");
		usuario.setPassword("qwerty");
		usuario.setUsername("usernameDelUsuario");
		usuario.setEmprendimiento(emprendimiento);
		Rol rol = new Rol();
		rol.setNombreRol("Emprendedor");
		usuario.setRol(rol);
		emprendimiento.setUsuario(usuario);
		return emprendimiento;
	}
	

	public static RedSocial getRedSocial1() {
		RedSocial redSocial = new RedSocial();
		redSocial.setEmprendimiento(getEmprendimiento1());
		redSocial.setDominio("emprendimientoA");
		redSocial.setEmpresa(RedSocialEmpresaEnum.Facebook);
		return redSocial;
	}


	public static RedSocial getRedSocial2() {
		RedSocial redSocial = new RedSocial();
		redSocial.setEmprendimiento(getEmprendimiento2());
		redSocial.setDominio("emprendimientoB");
		redSocial.setEmpresa(RedSocialEmpresaEnum.Instagram);
		return redSocial;
	}

	
}


