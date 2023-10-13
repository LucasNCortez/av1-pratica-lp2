import br.ufrn.imd.model.*;

public class Main {
  public static void main(String[] args) {
    Petshop ILovePets = new Petshop();
    
    TutorDeAnimalEstimacao rodrigo = new TutorDeAnimalEstimacao("Rodrigo");
    TutorDeAnimalEstimacao lucas = new TutorDeAnimalEstimacao("Lucas");
    Vendedor victor = new Vendedor("Victor");
    PrestadorDeServicos vinicius = new PrestadorDeServicos("Vinicius");
  }
}
