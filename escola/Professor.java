package escola;

public class Professor extends Pessoa implements Secretaria {
    private int cargaHoraria;
    private String fone;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Professor(int cargaHoraria, String fone, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.cargaHoraria = cargaHoraria;
        this.fone = fone;
    }
    
    public void info(){
        super.mostrar();
        System.out.println("Carga Hóraria: " + this.cargaHoraria);
        System.out.println("Telefone: " + this.fone);
        System.out.println("Fim das INFORMAÇÕES!");
    }

    @Override
    public void dadosAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
