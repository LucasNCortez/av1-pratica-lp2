import java.util.ArrayList;
import br.ufrn.imd.model.*;

public class Petshop {
  private ArrayList<Usuario> usuarios;
  private ArrayList<AnimalEstimacao> animais;

  public void adicionarUsuario(Usuario usuario){
    this.usuarios.add(usuario);
  }
  public boolean removerUsuario(Usuario usuario){
    return this.usuarios.remove(usuario);
  }

  public void adicionarAnimal(AnimalEstimacao animal){
    this.animais.add(animal);
  }
  public boolean removerAnimal(AnimalEstimacao animal){
    return this.animais.remove(animal);
  }

  public ArrayList<Usuario> getUsuariosArrayList(){
    return this.usuarios;
  }
  public Usuario getUsuarioById(int id){
    for (Usuario usuario : this.usuarios){
      if (usuario.getId() == id){
        return usuario;
      }
    }
    Usuario usuarioVazio = new Usuario(null);
    return usuarioVazio;
  }

  public ArrayList<AnimalEstimacao> getAnimaisArrayList(){
    return this.animais;
  }
  public AnimalEstimacao getAnimalById(int id){
    for (AnimalEstimacao animal : this.animais){
      if (animal.getId() == id){
        return animal;
      }
    }
    AnimalEstimacao animalVazio = new AnimalEstimacao();
    return animalVazio;
  }
}
