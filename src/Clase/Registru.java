package Clase;
import java.util.ArrayList;
import java.util.List;

public class Registru {
	private List<Memento> mementoList=new ArrayList<Memento>();

	public void add(Memento nrReteta)
	{
		mementoList.add(nrReteta);
	}
	public Memento get(int index)
	{
		return mementoList.get(index);
	}
}
