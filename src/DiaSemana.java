import java.util.ArrayList;

public enum DiaSemana {
	SEGUNDA,
	TERCA,
	QUARTA,
	QUINTA,
	SEXTA,
	SABADO,
	DOMINGO;

	private ArrayList<String> tarefas;
	
	DiaSemana() {
		this.tarefas = new ArrayList<String>();
	}
	
	public void setTarefas(ArrayList<String> tarefas) {
		this.tarefas = tarefas;
	}
	
	public ArrayList<String> getTarefas() {
		return tarefas;
	}
	
	public DiaSemana nextday() {
		if (this.ordinal() == 6)
			return SEGUNDA;
		return this.values()[this.ordinal() + 1];
	}
	
}
