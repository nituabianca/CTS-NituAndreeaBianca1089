package memento;

public class ManagerMemento {

	private List<MementoAutobuz>listaMemento;
	
	public ManagerMemento() {
		this.listaMemento=new ArrayList<>();
	}
	
	public void addmemento(MementoAutobuz memento) {
		this.listaMemento=listaMemento;
	}
}
