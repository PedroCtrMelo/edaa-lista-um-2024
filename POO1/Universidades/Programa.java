package ListaUm.Universidades;

public class Programa {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Universidade facul = new Universidade();
        Disciplina materia = new Disciplina();
        Aluno aluno = new Aluno();

        aluno.setNome("Pedrim");
        aluno.setId(5622);
        aluno.setNotaAtual(80.00);
        aluno.setPresenca(0);

        prof.setNome("Daniel");
        prof.setTurno("Tarde");
        prof.setNota(50);
        prof.setId(8852);

        materia.setNome("Ciências da computação");
        materia.setModulos(5);

        facul.setNome("UNA CONTAGEM");
        facul.setEndereco("Avenida João Cesár de Oliveira");

        aluno.irNaAula();

        double notaFinal = prof.lancarNota(43);

        System.out.println("DADOS DO ALUNO:");
        System.out.println(aluno.getNome());
        System.out.println("ID do aluno: " + aluno.getId());
        System.out.println(facul.getNome());
        System.out.println(materia.getNome());
        System.out.println("Módulo: " + materia.getModulos());
        System.out.println("\n O aluno veio hoje.");
        System.out.println("Presença de hoje: " + aluno.getPresenca());

        System.out.println("\n DADOS DO PROFESSOR:");
        System.out.println(prof.getNome());
        System.out.println("ID do professor: " + prof.getId());
        System.out.println("Turno: " + prof.getTurno());
        System.out.println("Nota a ser lançada para o aluno "+ aluno.getNome() +": "+ prof.getNota()+ " pontos.");
        System.out.println("Nota atual do aluno: " + aluno.getNotaAtual());
        System.out.println("Nota final do aluno: " + notaFinal);
    }
}
