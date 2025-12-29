package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado
 * 
 * Permite construir una instancia del WallPost.
 * Luego de la invocación, debe tener como texto: “Undefined post”,
 * no debe estar marcado como destacado y la cantidad de “Me gusta” debe ser 0.
 */

public class WallPost {
	private String descripcion;
	private int cantMg;
	private boolean destacado; // true --> destacado 	;		false --> NO destacado
	
	public WallPost() {
		this.descripcion = "Undefined post";
		this.cantMg = 0;
		this.destacado = false; 
	}
	/**
	 * Retorna el texto descriptivo de la publicación
	 * 
	 * @return
	 */
	String getText() {
		return this.descripcion;
	};

	/**
	 * Setea el texto descriptivo de la publicación
	 * @param text
	 */
	void setText(String text) {
		this.descripcion = text;
	};

	/**
	 * Retorna la cantidad de “me gusta”
	 * 
	 * @return
	 */
	int getLikes() {
		return this.cantMg;
	};

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	void like() {
		this.cantMg++;
	};

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	void dislike() {
		if (this.cantMg > 0) {
			this.cantMg--;
		}
	};

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	boolean isFeatured() {
		return this.destacado;
	};

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	void toggleFeatured() {
		this.destacado = !this.destacado;
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}