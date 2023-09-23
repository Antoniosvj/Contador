import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner (System.in);
        System.out.println(("Digite o primeiro parametro"));
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        } finally {
            terminal.close();
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
            //validar se p1 é maior que p2 e lançar a exceção
            throw new ParametrosInvalidosException ("O segundo parametro deve ser maior que o primeiro");
        }
       
        //realizar o for para imprimir os numeros com base na variavel contagem
        for (int i = parametroUm; i <= parametroDois; i++){
            System.out.println(i);
        }
    }

}