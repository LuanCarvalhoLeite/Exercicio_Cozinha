import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Defina as cozinhas para o seu restaurante:");

    Scanner scanner = new Scanner(System.in);

    String tipoCozinha, pratoPrincipal, nomeIngrediente, dataValidade, nomeFuncionario, atividade;
    int horaAbertura, horaFechamento, quantIngredientes, quantFuncionarios;

    //Cozinha Mineira
    System.out.println("Qual o tipo da cozinha?");
    tipoCozinha = scanner.nextLine();
      
    System.out.println("Qual a Hora de abertura?");
    horaAbertura = scanner.nextInt();

    System.out.println("Qual a hora de fechamento?");
    horaFechamento = scanner.nextInt();

    System.out.println("Qual o prato principal?");
    pratoPrincipal = scanner.next();

    Cozinha mineira = new Cozinha(horaAbertura, horaFechamento, pratoPrincipal, tipoCozinha);

    System.out.println("Obs: Digite os nomes dos ingredientes sem espaço.");
    System.out.println("Quantidade de ingredientes?");
    quantIngredientes = scanner.nextInt();

    for(int i=0;i<quantIngredientes;i++){
      System.out.println("Qual é o "+(i+1)+"º ingrediente?");
      nomeIngrediente = scanner.next();
        
      System.out.println("Qual é a data de validade do "+(i+1)+"º ingrediente?");
      dataValidade = scanner.next();

      mineira.ingredientes.add(new Ingrediente(nomeIngrediente,dataValidade));
    }
    System.out.println("Quantidade de funcionarios?");
    quantFuncionarios = scanner.nextInt();
      
    for(int j=0;j<quantFuncionarios;j++){
      System.out.println("Nome do "+(j+1)+"º funcionário?");
      nomeFuncionario = scanner.next();

      System.out.println("Qual a função do "+(j+1)+"º funcionário?");
      atividade = scanner.next();

      mineira.funcionarios.add(new Funcionario(nomeFuncionario,atividade));
    }

    //Cozinha Chinesa
    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Qual o tipo da cozinha?");
    tipoCozinha = scanner1.nextLine();
      
    System.out.println("Qual a Hora de abertura?");
    horaAbertura = scanner1.nextInt();

    System.out.println("Qual a hora de fechamento?");
    horaFechamento = scanner1.nextInt();

    System.out.println("Qual o prato principal?");
    pratoPrincipal = scanner1.next();

    Cozinha chinesa = new Cozinha(horaAbertura, horaFechamento, pratoPrincipal, tipoCozinha);

    System.out.println("Obs: Digite os nomes dos ingredientes sem espaço.");
    System.out.println("Quantidade de ingredientes?");
    quantIngredientes = scanner1.nextInt();

    for(int i=0;i<quantIngredientes;i++){
      System.out.println("Qual é o "+(i+1)+"º ingrediente?");
      nomeIngrediente = scanner1.next();
        
      System.out.println("Qual é a data de validade do "+(i+1)+"º ingrediente?");
      dataValidade = scanner1.next();

      chinesa.ingredientes.add(new Ingrediente(nomeIngrediente,dataValidade));
    }
    System.out.println("Quantidade de funcionarios?");
    quantFuncionarios = scanner1.nextInt();
      
    for(int j=0;j<quantFuncionarios;j++){
      System.out.println("Nome do "+(j+1)+"º funcionário?");
      nomeFuncionario = scanner1.next();

      System.out.println("Qual a função do "+(j+1)+"º funcionário?");
      atividade = scanner1.next();

      chinesa.funcionarios.add(new Funcionario(nomeFuncionario,atividade));
    }
    
    //Cozinha Italiana
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Qual o tipo da cozinha?");
    tipoCozinha = scanner2.nextLine();
      
    System.out.println("Qual a Hora de abertura?");
    horaAbertura = scanner2.nextInt();

    System.out.println("Qual a hora de fechamento?");
    horaFechamento = scanner2.nextInt();

    System.out.println("Qual o prato principal?");
    pratoPrincipal = scanner2.next();

    Cozinha italiana = new Cozinha(horaAbertura, horaFechamento, pratoPrincipal, tipoCozinha);

    System.out.println("Obs: Digite os nomes dos ingredientes sem espaço.");
    System.out.println("Quantidade de ingredientes?");
    quantIngredientes = scanner2.nextInt();

    for(int i=0;i<quantIngredientes;i++){
      System.out.println("Qual é o "+(i+1)+"º ingrediente?");
      nomeIngrediente = scanner2.next();
        
      System.out.println("Qual é a data de validade do "+(i+1)+"º ingrediente?");
      dataValidade = scanner2.next();

      italiana.ingredientes.add(new Ingrediente(nomeIngrediente,dataValidade));
    }
    System.out.println("Quantidade de funcionarios?");
    quantFuncionarios = scanner2.nextInt();
      
    for(int j=0;j<quantFuncionarios;j++){
      System.out.println("Nome do "+(j+1)+"º funcionário?");
      nomeFuncionario = scanner2.next();

      System.out.println("Qual a função do "+(j+1)+"º funcionário?");
      atividade = scanner2.next();

      italiana.funcionarios.add(new Funcionario(nomeFuncionario,atividade));
    }
  
  }
}