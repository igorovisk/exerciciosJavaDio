import java.util.*;

public class ExercicioPropostoListas {


    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 6; i++){
            System.out.println("Qual a temperatura do " + (i+1) + " mês do ano?");
            Double temp = scanner.nextDouble();
            temperaturas.add(temp);
        }

        System.out.println("Temperaturas: " + temperaturas.toString());

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma = soma + next;
        }

        System.out.println("Soma: " + soma.toString());
        Double mediaSemetrais = soma/temperaturas.size();
        System.out.println("Media: " + mediaSemetrais.toString());

        Iterator<Double> iteratormedia = temperaturas.iterator();

        ArrayList<Double> teste = new ArrayList<>(); //criado para testar iterator para copiar outra List ao final do código
        LinkedList<Double> teste2 = new LinkedList<>(); // criado para testar metodo clone() ao final do código
        teste2.addAll(temperaturas);
        Double next = iteratormedia.next();

        System.out.println("Temperaturas Abaixo da Média: ");

        while(iteratormedia.hasNext()) {
            teste.add(next);
            next = iteratormedia.next();

            if (next < mediaSemetrais) {
                System.out.print(" / " + next.toString());
            }
        }

        System.out.println("\n\nMeses com temperatura acima da média: ");
        for (Double temp: temperaturas){ //para cada temperatura dentro da lista temperaturas faça:
            if(temp > mediaSemetrais){ //se temp for maior que a média
                int index = temperaturas.indexOf(temp);
                switch (index){

                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " Graus Celsius");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp + " Graus Celsius");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp + " Graus Celsius");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp + " Graus Celsius");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp + " Graus Celsius");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp + " Graus Celsius");
                        break;
                    case 6:
                        System.out.println((index + 1) + " - JULHO: " + temp + " Graus Celsius");
                        break;
                }
            }
        }


        System.out.println("");
        System.out.println("TESTE1 CLONANDO ARRAYLIST: " + teste.toString());
        System.out.println("TESTE2 USANDO METODO ADD ALL: " + teste2.toString());



    }
}

