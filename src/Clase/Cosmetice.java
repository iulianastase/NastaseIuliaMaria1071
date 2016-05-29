package Clase;

public abstract class Cosmetice {
	abstract void producere();
	abstract void vanzare();
	
	public final void cicluCosmetice()
	{
		producere();
		vanzare();
	}

}
