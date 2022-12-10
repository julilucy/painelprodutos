package view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import controller.controladorCliente;

public class TelaPrincipalHD extends JPanel{
	private static final long serialVersionUID = 1L;

	public void adicionarHD() {
        CadastroGabinete cliente = new CadastroGabinete();

        boolean manterJanelaAberta = true;

        while (manterJanelaAberta) {
            Object[] options = {"Adicionar", "Cancelar"};
            int ret = JOptionPane.showOptionDialog(
                    this,
                    cliente,
                    "Cadastro HD",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (ret == JOptionPane.OK_OPTION) {
                cliente.inserirCliente();
            } else {
                manterJanelaAberta = false;
            }
        }
    }

    public void consultarCliente() {
        ConsultarGabinete cliente = new ConsultarGabinete();

        boolean manterJanelaAberta = true;

        while (manterJanelaAberta) {
            Object[] options = {"Consultar", "Cancelar"};
            int ret = JOptionPane.showOptionDialog(
                    this,
                    cliente,
                    "Consultar Equipamento",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);


            if (ret == JOptionPane.OK_OPTION) {

                cliente.consultarCliente();

            } else {
                manterJanelaAberta = false;
            }
        }
    }
    public void adicionarProcessador1(){
    	
    }

}
