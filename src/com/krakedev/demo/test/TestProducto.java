package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(101, "Coca Cola");

		producto1.setDescripcion("Bebida gaseosa de 500ml");
		producto1.setPeso(0.55);

		System.out.println("Codigo: " + producto1.getCodigo());
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Descripcion: " + producto1.getDescripcion());
		System.out.println("Peso: " + producto1.getPeso());
	}
}