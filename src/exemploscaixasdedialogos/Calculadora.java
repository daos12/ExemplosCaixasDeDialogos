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
        
        //Conversor Int
        int vInt        = Integer.parseInt(valor1);
        
        //Conversor Double
        double vDouble1 = Double.parseDouble(valor1);
        double vDouble2 = Double.parseDouble(valor2);
        
        //Conversor Float
        float vFloat    = Float.parseFloat(valor1);
        
        double resultado = vDouble1 + vDouble2;
        
        //Conversor String
        String texto = String.valueOf(resultado);
        
        JOptionPane.showMessageDialog(
                null, 
                "Total: "+resultado
        );
    }
}
