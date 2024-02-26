package Animal;



public class Programa {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setId(45);
        gato.setTipo("Domestico");
        gato.setHabitat("Terrestre");
        gato.setNome("Ragna");
        gato.setRaca("Gato");
        gato.setIdade(1);

        System.out.println(gato.getNome());
        System.out.println(gato.getIdade());
        System.out.println(gato.getRaca());
        System.out.println(gato.getTipo());
        System.out.println(gato.getHabitat());
        System.out.println("ID do animal: " + gato.getId());
    }
    
}
