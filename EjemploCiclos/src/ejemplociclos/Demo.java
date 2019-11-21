/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclos;

/**
 *
 * @author reroes
 */
public class Demo {

    public static void main(String[] args) {
        String cadena = String.format("%1$-10s %2$20s", "demotext", "cadena siguiente");
        String cadenaDos = String.format("%1$-30s %s", "demotext", "cadena siguiente");

        System.out.printf("%s\n", cadena);
        System.out.printf("%s\n", cadenaDos);

    }
}
