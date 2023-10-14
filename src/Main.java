import br.ufrn.imd.model.*;

public class Main {
  public static void main(String[] args) {
    Petshop ILovePets = new Petshop();
    
    TutorDeAnimalEstimacao rodrigo = new TutorDeAnimalEstimacao("Rodrigo");
    TutorDeAnimalEstimacao lucas = new TutorDeAnimalEstimacao("Lucas");
    Vendedor victor = new Vendedor("Victor");
    PrestadorDeServicos vinicius = new PrestadorDeServicos("Vinicius");

    Cao mel = new Cao("Mel");
    Rato remi = new Rato("Remi");
    
    Especialidade medicoDeHamster = new Especialidade("Médico de Hamster");

    ILovePets.adicionarUsuario(rodrigo);
    ILovePets.adicionarUsuario(lucas);
    ILovePets.adicionarUsuario(vinicius);
    ILovePets.adicionarUsuario(victor);

    ILovePets.adicionarAnimal(mel);
    ILovePets.adicionarAnimal(remi);

    rodrigo.adicionarAnimalEstimacao(mel);
    lucas.adicionarAnimalEstimacao(remi);

    vinicius.adicionarEspecialidade(medicoDeHamster);

    for (Usuario usuario : ILovePets.getUsuariosArrayList()) {
      if (usuario instanceof TutorDeAnimalEstimacao) {
        System.out.println(((TutorDeAnimalEstimacao) usuario).toString());
        System.out.println(((TutorDeAnimalEstimacao) usuario).getAnimaisEstimacao());
      } else if (usuario instanceof PrestadorDeServicos){
        System.out.println(((PrestadorDeServicos) usuario).toString());
        System.out.println(((PrestadorDeServicos) usuario).getEspecialidades());
      } else if (usuario instanceof Vendedor){
        System.out.println(((Vendedor) usuario).toString());
      }
    }
  }
}
