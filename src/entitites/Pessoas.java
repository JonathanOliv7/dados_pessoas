package entitites;

public class Pessoas {
	private double altura;
	private char sexo;
	
  public Pessoas() {
	}

  public Pessoas(double altura, char sexo) {
	this.altura = altura;
	this.sexo = sexo;
  }

  public Double getAltura() {
	return altura;
  }

  public void setAltura(double altura) {
	this.altura = altura;
  }

  public char getSexo() {
	return sexo;
  }

  public void setSexo(char sexo) {
	this.sexo = sexo;
  }

  public static double mediaGeral(Pessoas[] lista) {
	 double soma = 0.0;
	 int contador = 0;
	 for(Pessoas p : lista) {
		 if(p.getSexo() == 'F' || p.getSexo() == 'f') {
			 soma += p.getAltura();
			 contador ++;
		 } 
	 }
	 return soma/contador;
	 
} public static double menorAltura(Pessoas[] lista) {
	  double verificar = 0;
	  double resultado = lista[0].getAltura();
	  for(Pessoas p : lista) {
		 verificar = p.getAltura();
		 if(verificar < resultado) {
			 resultado = verificar;
		 }
	  }return resultado;
  } public static double maiorAltura(Pessoas[] lista) {
	  double verificar = 0;
	  double resultado = lista[0].getAltura();
	  for(Pessoas p : lista) {
		 verificar = p.getAltura();
		 if(verificar > resultado) {
			 resultado = verificar;
		 }
	  }return resultado;

} public static int contarHomens(Pessoas[] lista) {
	int homens = 0;
	for(Pessoas p : lista) {
		if(p.getSexo() == 'm' ||p.getSexo() == 'M') {
			homens ++;
		}
	}return homens;
	
}
}