class Erro02 {
  public static void main (String[] args){
    System.out.println("Você digitou: " + 1/0);
  }
}
/*Outro erro, erro de Tempo de Execução. Esse erro, diferentemente
dos outros erros, não é gerado na hora de compilar e sim na hora
de rodar o código. Neste exemplo, ele compilará tudo certinho,
porém na hora de rodar ele dará um erro, porque o Java não
divide números por zero.*/