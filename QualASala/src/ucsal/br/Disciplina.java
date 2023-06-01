package ucsal.br;

public class Disciplina {
    private String nome;
    private String horario;
    private SalaDeAula sala;
    private Professor professor;
    
    public Disciplina(String nome, String horario, SalaDeAula sala, Professor professor) {
        // ...
        this.professor = professor;
    }
    

    public Disciplina(String nome, String horario, SalaDeAula sala) {
        this.nome = nome;
        this.horario = horario;
        this.sala = sala;
    }

    public String getNome() {
    	return nome == null ? "" : nome;
    }

    public String getHorario() {
        return horario;
    }

    public SalaDeAula getSala() {
        return sala;
    }
    public Professor getProfessor() {
        return professor;
    }
}
