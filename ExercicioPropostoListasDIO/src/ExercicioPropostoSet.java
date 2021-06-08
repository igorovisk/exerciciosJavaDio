import java.util.*;
/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioPropostoSet {
    public static void main(String[] args) {
        System.out.println("a) Exiba todas as cores o arco-íris");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Verde");
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Violeta");
        System.out.println(coresArcoIris);

        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra;");
        for (String cores : coresArcoIris) {
            System.out.println(cores);
        }

        System.out.println("b) A quantidade de cores que o arco-íris tem: ");
        System.out.println(coresArcoIris.size());

        System.out.println("c) Exiba as cores em ordem alfabética");
        Set<String> coresOrdemAlfabeto = new TreeSet<>(coresArcoIris);
        System.out.println(coresOrdemAlfabeto);

        System.out.println("d) Exiba as cores na ordem inversa da que foi informada");
        Set<String> coresOrdemInversa = new LinkedHashSet<>(Arrays.asList("Verde", "Vermelho", "Anil", "Azul", "Amarelo", "Laranja", "Violeta"));
        System.out.println(coresOrdemInversa);
        List<String> coresOrdemInversaList = new ArrayList<>(coresOrdemInversa);
        Collections.reverse(coresOrdemInversaList);
        System.out.println(coresOrdemInversaList);

        System.out.println("e) Exiba todas as cores que começam com a letra ”v”");

        Set<String> coresCase = new HashSet<String>();

        Iterator<String> iteratorCase = coresArcoIris.iterator();

    while(iteratorCase.hasNext()){
        coresCase.add(iteratorCase.next().toLowerCase());
    }

        for (String cores : coresCase) {
            if (cores.startsWith("v")) {
                System.out.print(cores + " ");
            }
        }

        System.out.println("\nf) Remova todas as cores que não começam com a letra V");

       Iterator<String> iteratorRemove = coresArcoIris.iterator();
       while(iteratorRemove.hasNext()){
           if(iteratorRemove.next().startsWith("V")) iteratorRemove.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("g) Limpe o conjunto");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("h) Confira se o conjunto está vazio");
        if(coresArcoIris.isEmpty()){
            System.out.println("Está Vazio");} else System.out.println("Contém elementos");

    }
}


