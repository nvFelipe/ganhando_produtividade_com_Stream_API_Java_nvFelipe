package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Usar o Supplier com expressao lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao= () -> "Olá, seja bem-vindo";

        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList()); /*Este collecto, a propria IDE que alterar para um toLis
                mas é aplicado desta maneira*/
        listaSaudacoes.forEach(s -> System.out.println(s));/*Aqui a IDE tambem quer alterar para method reference*/
    }

}
