package exemploscaixasdedialogos;

import javax.swing.JOptionPane;

public class Calculadora {
    
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                null, 
                "Digite o primeiro valor:"
        );
        
        String valor2 = JOptionPane.showInputDialog(
                null, 
                "Digite o segundo valor:"
        );
        
        int vInt        = Integer.parseInt(valor1);
        double vDouble1 = Double.parseDouble(valor1);
        double vDouble2 = Double.parseDouble(valor2);
        float vFloat    = Float.parseFloat(valor1);
        
        double resultado = vDouble1 + vDouble2;
        
        JOptionPane.showMessageDialog(
                null, 
                "Total: "+resultado
        );
        
        
    }
    
}
