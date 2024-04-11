package escola;
public class Escola {
    public static void main(String[] args) {
        Professor prof1 = new Professor(12, "(51)98374-6982", "Ivonei", 40, "123.456.789-00");
        prof1.info();
        
        Aluno a1 = new Aluno(998877, "Análise e Desenvolvimento de Sistemas", "Matutino", "William Tavares", 25, "321.654.987-00");
        a1.dadosAluno();
    }
    
}
