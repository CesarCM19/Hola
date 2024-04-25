import javax.swing.JOptionPane;

public class ClaseCésar {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bienvenidos a mi clase");
        int Contador =0;
        while(Contador<=5){
            System.out.println(Contador);
            Contador++;
        }
        JOptionPane.showMessageDialog(null,"El contador llegó a 5");

    }
}
