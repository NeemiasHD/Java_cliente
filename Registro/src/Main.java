import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente("neemias","70527530140", "fulanodetal@gmail.com");
        JOptionPane.showMessageDialog(null, cliente1);
        Cliente cliente2 = new Cliente("gustavo o gay","24242424242", "gustavomtgay@gmail.com");
        JOptionPane.showMessageDialog(null, cliente2);

        System.out.println("\n\n"+Pessoa.codigo_st);//printando o codigo que está dentro da propria classe mãe Cliente.
        
        
    }
}
