import java.util.Arrays;
import java.util.Random;

import javax.management.InvalidAttributeValueException;

public class M {

	public static String converter(int n) {
		String[] diaDaSemana = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
		try {
			if (n < 1 || n > 7)
				throw new InvalidAttributeValueException();
			return diaDaSemana[n - 1];
		} catch (InvalidAttributeValueException e) {
			return "Erro. Valores de 1 a 7";
		}
	}

	public static String gerar(int n) {
		Random random = new Random();

		StringBuilder numerosRandomicos = new StringBuilder(n + " números randomicos:");

		for (int i = 0; i < n; i++) {
			if (i % 39 == 0)
				numerosRandomicos.append("\n");
			numerosRandomicos.append(random.nextInt(1000) + " ");
		}

		return numerosRandomicos.toString();
	}

	public static int comparar(int n1, int n2, int n3) {

		int[] numeros = { n1, n2, n3 };
		int maior = Arrays.stream(numeros).max().getAsInt();

		return maior;
	}

	public static String contar(int n1, int n2) {
		int passoContagem = 1;
		if (n1 > n2)
			passoContagem = -1;

		StringBuilder contagem = new StringBuilder();
		int pulaLinha = 0;
		for (int i = n1; (n1 > n2 ? i >= n2 : i <= n2); i = i + passoContagem) {
			if (pulaLinha == 30) {
				contagem.append("\n");
				pulaLinha = 0;
			}
			contagem.append(i + " ");
			pulaLinha++;
		}

		return contagem.toString();
	}

	public static String gerarSenha(Integer numeroDigitosSenha) {

		StringBuilder senha = new StringBuilder();
		int pulaLinha = 0;
		for (int i = 0; i < numeroDigitosSenha; i++) {

			int charRandom = new Random().nextInt(52);
			char charSenha = '0';
			if (charRandom <= 9) {
				charSenha = (char) (charRandom + '0');
			}
			if (charRandom > 9 && charRandom <= 35) {
				charSenha = (char) (charRandom - 10 + 'a');
			}

			if (charRandom > 35 && charRandom <= 61) {
				charSenha = (char) (charRandom - 36 + 'A');
			}
			if (pulaLinha == 50) {
				pulaLinha = 0;
				senha.append("\n");
			}

			senha.append(charSenha);

			pulaLinha++;
		}

		return senha.toString();
	}

	public static String alocar(Integer numeroPassageiros) {

		return Integer.toString(numeroPassageiros % 45 == 0 ? (numeroPassageiros / 45) : (numeroPassageiros / 45 + 1));

	}
}
