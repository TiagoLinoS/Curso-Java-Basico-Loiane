class Argumentos {
	public static void main (String[] args) {
		System.out.println("Você digitou " + args[0]);
		//Um programa em Java, executado pelo cmd recebe argumentos, no caso acima, estamos puxando o index '0'
		/*Para passar o argumento pelo cmd, primeiro você compila o arquivo (javac arq.java), depois, antes de rodar
		o .class (java arq), você coloca um argumento (por exemplo, "java arq CachorroBonito", veja escrevi tudo 
		junto, porque estamos puxando apenas a primeira posição 'args[0]'. Entretanto caso passemos "Cachorro 
		Bonito", entre aspas, ele puxará tudo, porque ele entende como apenas um argumento)*/
		 
	}
}