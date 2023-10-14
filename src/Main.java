import java.util.List;

import br.ufrn.imd.model.*;

public class Main {
  public static void main(String[] args) {
    Petshop ILovePets = new Petshop();
    
    TutorDeAnimalEstimacao rodrigo = new TutorDeAnimalEstimacao("Rodrigo");
    TutorDeAnimalEstimacao lucas = new TutorDeAnimalEstimacao("Lucas");
    Vendedor victor = new Vendedor("Victor");
    PrestadorDeServicos vinicius = new PrestadorDeServicos("Vinicius");

    Cao mel = new Cao("Mel");

    ILovePets.adicionarUsuario(rodrigo);
    ILovePets.adicionarUsuario(lucas);
    ILovePets.adicionarUsuario(victor);
    ILovePets.adicionarUsuario(vinicius);

    ILovePets.adicionarAnimal(mel);

    rodrigo.adicionarAnimalEstimacao(mel);

    for (Usuario usuario : ILovePets.getUsuariosArrayList()) {
      if (usuario instanceof TutorDeAnimalEstimacao) {
        System.out.println(((TutorDeAnimalEstimacao) usuario).getAnimaisEstimacao());;
      }
    }
  }
}
