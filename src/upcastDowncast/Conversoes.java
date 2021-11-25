package upcastDowncast;

public class Conversoes {

	public static void main(String[] args) {

		
		
		byte b1;
		short s1 = 1000;
		b1 = (byte)s1; // Downcast = por acontecer perda de dados vc necessita explicar  o tipo da variavel
		
		long l1;
		int i1 = 10; // Upcast = como agora tem espaço de sobra voce nao precisa explicar ja que long é maior que o int
		l1 = i1;
		
		int i2;
		long l2 = 1000000000000000L; // Downcast = pq passou do long para o int entao necessita explicar o tipo da variavel 
		i2 = (int) l2;
		
		int i3;
		long l3 = 10000L; // Downcast
		i3 = (int) l2;
		
		double d1;
		float f1 = 10.5f; // Upcast = como irá caber normalmente nao houve perda de informaçoes
		d1 = f1;
		
		float f2;
		float f3;
		double d2 = 10000.58d; // Downcast = mas como o valor double cabe dentro do float nao houve perda de informação
		f2 = (float) d2;
		
		double d3 = 10000.5888888888888888888888888888888888888888888888888888d;
		f3 = (float) d3; // Downcast = como o flaot nao ira caber todas as casas decimais ocorreu um donwcast grande
		
		int i4;
		float f4 = 11.5697f;
		i4 = (int) f4; // Downcast = converter valores fracionados em inteiros é o caso com mais downcat ja que voce perde todas as casa decimais
		
		
		System.out.println("b1: " + b1);
		System.out.println("l1: " + l1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("d1: " + d1);
		System.out.println("f1: " + f2);
		System.out.println("f1: " + f3);
		System.out.println("i4: " + i4);
		
		b1 = (byte) d3;
		
		System.out.println("b1: " + b1);
				
		
		
	}

}
