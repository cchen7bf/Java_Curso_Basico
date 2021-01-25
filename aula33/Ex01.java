/*
Reescreva os exercicios, criando todos os atributos do tipo privado, métodos getters e setters e construtores. Os métodos que serão utilizados pela classe de teste devem ser públicos. Se necessário, crie métodos privados como auxiliares para organizar o código fonte.

Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lâmpada.
*/

public class Ex01
{
    public static void main(String[] args)
    {
        Lampada lampada = new Lampada("Philips", 100);
/*        lampada.setMarca("Philips");
        lampada.setPotencia(100); */


    lampada.mostrarEstado();
    lampada.ligar();
    lampada.mostrarEstado();
    lampada.desligar();
    lampada.mostrarEstado();
    System.out.println(lampada.getMarca());
    System.out.println(lampada.getPotencia());
    }
}
