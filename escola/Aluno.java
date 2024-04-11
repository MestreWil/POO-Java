package escola;

public class Aluno extends Pessoa implements Secretaria {
    private int RA;
    private String curso;
    private String turno;

    public Aluno(int RA, String curso, String turno, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.RA = RA;
        this.curso = curso;
        this.turno = turno;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    public void dadosAluno(){
        super.mostrar();
        System.out.println("RA: " + this.RA);
        System.out.println("Curso: " + this.curso);
        System.out.println("Turno: " + this.turno);
        System.out.println("Fim das INFORMAÇÕES!");
    }

    @Override
    public void info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
