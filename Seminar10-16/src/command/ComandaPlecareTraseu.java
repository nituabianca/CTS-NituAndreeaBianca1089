package command;

public class ComandaPlecareTraseu implements Command{
	private Autobuz autobuz;
	private int nrLinie;
	public ComandaPlecareTraseu(int nrLinie, Autobuz autobuz) {
		this.autobuz = autobuz;
		this.nrLinie = nrLinie;
	}
	
	public void executa() {
		autobuz.pleacaInCursa(nrLinie);
	}
}
