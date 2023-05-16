import br.newtonpaiva.lp.domain.Cliente;
import br.newtonpaiva.lp.domain.Operacao;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JLabel lblSabor;
        JLabel lblPagamento;
        JLabel lblQuantidade;
        JLabel lblTamanho;
        JLabel lblTotal;

        JComboBox<String> cmbSabor, cmbPagamento, cmbQuantidade, cmbTamanho;
        JButton btnAdicionar, btnFinalizar;
        JTextArea txtAreaPedidos;
        double total = 0.0;

        String[] sabores = {"Chocolate", "Morango", "Baunilha"};
        String[] pagamentos = {"Dinheiro", "Cartão de Crédito"};
        String[] tamanhos = {"Pequeno", "Médio", "Grande"};


            public static void main(String[] args) {
                SwingUtilities.invokeLater(SorveteriaGUI::new);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnAdicionar) {
                    String sabor = (String) cmbSabor.getSelectedItem();
                    String pagamento = (String) cmbPagamento.getSelectedItem();
                    int quantidade = Integer.parseInt((String) cmbQuantidade.getSelectedItem());
                    String tamanho = (String) cmbTamanho.getSelectedItem();

                    double valor = calcularValorPedido(sabor, tamanho) * quantidade;

                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    String pedido = quantidade + "x " + tamanho + " " + sabor + " - " + pagamento + ": R$" + decimalFormat.format(valor) + "\n";
                    txtAreaPedidos.append(pedido);
                    total += valor;
                    lblTotal.setText("Total: R$" + decimalFormat.format(total));
                } else if (e.getSource() == btnFinalizar) {
                    // Implemente aqui a lógica para finalizar o pedido, como enviar para o sistema de pagamento, salvar em banco de dados, etc.
                    JOptionPane.showMessageDialog(this, "Pedido finalizado! Total: R$" + total);
                }
            }

            private double calcularValorPedido(String sabor, String tamanho) {
                double valorBase = 0.0;
                switch (sabor) {
                    case "Chocolate":
                        valorBase = 5.0;
                        break;
                    case "Morango":
                        valorBase = 4.5;
                        break;
                    case "Baunilha":
                        valorBase = 4.0;
                        break;
                }

                switch (tamanho) {
                    case "Pequeno":
                        return valorBase;
                    case "Médio":
                        return valorBase * 1.5;
                    case "Grande":
                        return valorBase * 2;
                    default:
                        return valorBase;
                }
            }
        }

    public SorveteriaGUI() {
        super("Sorveteria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblSabor = new JLabel("Sabor:");
        cmbSabor = new JComboBox<>(sabores);

        lblPagamento = new JLabel("Pagamento:");
        cmbPagamento = new JComboBox<>(pagamentos);

        lblQuantidade = new JLabel("Quantidade:");
        cmbQuantidade = new JComboBox<>(quantidades);

        lblTamanho = new JLabel("Tamanho:");
        cmbTamanho = new JComboBox<>(tamanhos);

        btnAdicionar = new JButton("Adicionar ao Pedido");
        btnAdicionar.addActionListener(this);

        btnFinalizar = new JButton("Finalizar Pedido");
        btnFinalizar.addActionListener(this);

        lblTotal = new JLabel("Total: R$0.00");

        txtAreaPedidos = new JTextArea(10, 30);
        txtAreaPedidos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaPedidos);

        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.add(lblSabor);
        panel.add(cmbSabor);
        panel.add(lblPagamento);
        panel.add(cmbPagamento);
        panel.add(lblQuantidade);
        panel.add(cmbQuantidade);
        panel.add(lblTamanho);
        panel.add(cmbTamanho);
        panel.add(btnAdicionar);
        panel.add(btnFinalizar);
        panel.add(lblTotal);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(panel);
        container.add(scrollPane);

        pack();
        setVisible(true);
    }

}