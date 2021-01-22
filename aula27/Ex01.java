/*
Escreva uma classe para representar uma lampada. Desenvolva métodos para ligar, desligar a lampada.
*/


public class Ex01
{
    public static void main(String[] args)
    {
        Lampada lampada = new Lampada();
    
        lampada.ligar();

        lampada.mostrarEstado();
 
        lampada.desligar();

        lampada.mostrarEstado();
    }
}


