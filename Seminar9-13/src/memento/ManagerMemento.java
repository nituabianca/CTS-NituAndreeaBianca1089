package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

	private List<MementoAutobuz>listaMemento;
	
	public ManagerMemento() {
		this.listaMemento=new ArrayList<>();
	}
	
	public void addMemento(MementoAutobuz memento) {
		this.listaMemento=listaMemento;
	}
	
	public MementoAutobuz getMemento(Integer index) {
		return listaMemento.get(index);	}
}
