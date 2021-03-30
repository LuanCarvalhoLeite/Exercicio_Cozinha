import java.util.ArrayList;

class Cozinha {

  int horaAbertura, horaFechamento;
  String pratoPrincipal,tipo;

  public Cozinha(int horaAbertura, int horaFechamento, String pratoPrincipal, String tipo){
    this.horaAbertura = horaAbertura;
    this.horaFechamento = horaFechamento;
    this.pratoPrincipal = pratoPrincipal;
    this.tipo = tipo;
    
  }
  ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
  ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
}