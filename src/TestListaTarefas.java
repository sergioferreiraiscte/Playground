import java.util.ArrayList;

public class TestListaTarefas {

	public static void main(String[] args) {
		
		ArrayList<String> tarefas = new ArrayList<String>();
		tarefas.add("2ª T1");
		tarefas.add("2ª T2");
		tarefas.add("2ª T3");
		DiaSemana segunda = DiaSemana.SEGUNDA;
		segunda.setTarefas(tarefas);

		ArrayList<String> tarefasTerca = new ArrayList<String>();
		tarefasTerca.add("3ª T1");
		tarefasTerca.add("3ª T2");
		tarefasTerca.add("3ª T3");
		DiaSemana terca = DiaSemana.TERCA;
		terca.setTarefas(tarefasTerca);

		for (DiaSemana ds : DiaSemana.values()) {
			System.out.println(ds);
			for (String tarefa : ds.getTarefas()) {
				System.out.println("    " + tarefa);
			}
		}
		
	}

}
