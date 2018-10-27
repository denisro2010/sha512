package sha512;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class ventana extends JFrame {

	/**
	 * Se ha reutilizado el codigo de la interfaz grafica de la practica de bases de datos del segundo curso.
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JPanel panel_1;
	private JLabel lblPorFavorIntroduce;
	private JPanel panel_2;
	private JSeparator separator;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private static String entrada;
	private JTextField textField;
	private JButton btnCerrar;
	private JTextArea lblNewLabel_1;
	private JLabel lblSalida;
	private JButton btnCopiarSalida;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private String sal;

	public static String getEntrada() {
		return entrada;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		setResizable(false);
		setTitle("Sha512 - Denis Ionut Stefanescu");
		initialize();
		centrar();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(getPanel_1_1(), BorderLayout.NORTH);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getBtnAceptar());
			panel.add(getBtnCerrar());
		}
		return panel;
	}

	private JButton getBtnAceptar() {
		if (btnAceptar == null) {
			btnAceptar = new JButton("Cifrar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					entrada= textField.getText();
					sal = textField_1.getText();
					String salida="";
					try {
						salida= sha512.get_SHA_512_SecurePassword(entrada, sal);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					lblNewLabel_1.setText(salida);
				}

			});
		}
		return btnAceptar;
	}


	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getLblPorFavorIntroduce());
		}
		return panel_1;
	}

	private JLabel getLblPorFavorIntroduce() {
		if (lblPorFavorIntroduce == null) {
			lblPorFavorIntroduce = new JLabel("Por favor, introduce el texto que deseas cifrar/descifrar");
		}
		return lblPorFavorIntroduce;
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new BorderLayout(0, 0));
			panel_2.add(getSeparator(), BorderLayout.NORTH);
			panel_2.add(getPanel_3(), BorderLayout.CENTER);
		}
		return panel_2;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}

	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			GridBagLayout gbl_panel_3 = new GridBagLayout();
			gbl_panel_3.columnWidths = new int[] { 126, 48, 116, 0 };
			gbl_panel_3.rowHeights = new int[] { 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			gbl_panel_3.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
			gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panel_3.setLayout(gbl_panel_3);
			GridBagConstraints gbc_separator_2 = new GridBagConstraints();
			gbc_separator_2.insets = new Insets(0, 0, 5, 5);
			gbc_separator_2.gridx = 1;
			gbc_separator_2.gridy = 0;
			panel_3.add(getSeparator_2(), gbc_separator_2);
			GridBagConstraints gbc_separator_1 = new GridBagConstraints();
			gbc_separator_1.insets = new Insets(0, 0, 5, 5);
			gbc_separator_1.gridx = 1;
			gbc_separator_1.gridy = 1;
			panel_3.add(getSeparator_1(), gbc_separator_1);
			GridBagConstraints gbc_passwordField = new GridBagConstraints();
			gbc_passwordField.insets = new Insets(0, 0, 5, 0);
			gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
			gbc_passwordField.gridx = 2;
			gbc_passwordField.gridy = 3;
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 2;
			panel_3.add(getLblNewLabel(), gbc_lblNewLabel);
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 2;
			panel_3.add(getTextField_2(), gbc_textField);
			GridBagConstraints gbc_separator_6 = new GridBagConstraints();
			gbc_separator_6.insets = new Insets(0, 0, 5, 0);
			gbc_separator_6.gridx = 2;
			gbc_separator_6.gridy = 3;
			panel_3.add(getSeparator_6(), gbc_separator_6);
			GridBagConstraints gbc_separator_5 = new GridBagConstraints();
			gbc_separator_5.insets = new Insets(0, 0, 5, 0);
			gbc_separator_5.gridx = 2;
			gbc_separator_5.gridy = 4;
			panel_3.add(getSeparator_5(), gbc_separator_5);
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.gridx = 0;
			gbc_lblNewLabel_2.gridy = 5;
			panel_3.add(getLblNewLabel_2(), gbc_lblNewLabel_2);
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.gridx = 1;
			gbc_textField_1.gridy = 5;
			panel_3.add(getTextField_1(), gbc_textField_1);
			GridBagConstraints gbc_separator_4 = new GridBagConstraints();
			gbc_separator_4.insets = new Insets(0, 0, 5, 0);
			gbc_separator_4.gridx = 2;
			gbc_separator_4.gridy = 6;
			panel_3.add(getSeparator_4(), gbc_separator_4);
			GridBagConstraints gbc_lblSalida = new GridBagConstraints();
			gbc_lblSalida.insets = new Insets(0, 0, 5, 5);
			gbc_lblSalida.gridx = 0;
			gbc_lblSalida.gridy = 7;
			panel_3.add(getLblSalida(), gbc_lblSalida);
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 7;
			panel_3.add(getLblNewLabel_1(), gbc_lblNewLabel_1);
			GridBagConstraints gbc_separator_9 = new GridBagConstraints();
			gbc_separator_9.insets = new Insets(0, 0, 5, 0);
			gbc_separator_9.gridx = 2;
			gbc_separator_9.gridy = 8;
			panel_3.add(getSeparator_9(), gbc_separator_9);
			GridBagConstraints gbc_separator_3 = new GridBagConstraints();
			gbc_separator_3.insets = new Insets(0, 0, 5, 0);
			gbc_separator_3.gridx = 2;
			gbc_separator_3.gridy = 9;
			panel_3.add(getSeparator_3(), gbc_separator_3);
			GridBagConstraints gbc_separator_7 = new GridBagConstraints();
			gbc_separator_7.insets = new Insets(0, 0, 5, 0);
			gbc_separator_7.gridx = 2;
			gbc_separator_7.gridy = 10;
			panel_3.add(getSeparator_7(), gbc_separator_7);
			GridBagConstraints gbc_separator_8 = new GridBagConstraints();
			gbc_separator_8.insets = new Insets(0, 0, 5, 0);
			gbc_separator_8.gridx = 2;
			gbc_separator_8.gridy = 11;
			panel_3.add(getSeparator_8(), gbc_separator_8);
			GridBagConstraints gbc_btnCopiarSalida = new GridBagConstraints();
			gbc_btnCopiarSalida.insets = new Insets(0, 0, 0, 5);
			gbc_btnCopiarSalida.gridx = 1;
			gbc_btnCopiarSalida.gridy = 12;
			panel_3.add(getBtnCopiarSalida(), gbc_btnCopiarSalida);
		}
		return panel_3;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Texto:");
		}
		return lblNewLabel;
	}

	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
		}
		return separator_1;
	}

	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
		}
		return separator_2;
	}

	public void centrar() {
		// Colocar ventana en el centro
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		if (windowSize.height > screenSize.height) {
			windowSize.height = screenSize.height;

		}
		if (windowSize.width > screenSize.width) {
			windowSize.width = screenSize.width;
		}
		setLocation((screenSize.width - windowSize.width) / 2, (screenSize.height - windowSize.height) / 2);
	}

	private JTextField getTextField_2() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(5);
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					entrada= textField.getText();
				}
			});
		}
		return textField;
	}
	private JButton getBtnCerrar() {
		if (btnCerrar == null) {
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
			
		}
		return btnCerrar;
	}
	private JTextArea getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JTextArea(" ");
		}
		return lblNewLabel_1;
	}
	private JLabel getLblSalida() {
		if (lblSalida == null) {
			lblSalida = new JLabel(" Salida: ");
		}
		return lblSalida;
	}
	private JButton getBtnCopiarSalida() {
		if (btnCopiarSalida == null) {
			btnCopiarSalida = new JButton("Copiar salida");
			btnCopiarSalida.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Copiar contenido al portapapeles
					String salida=lblNewLabel_1.getText();
					Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					StringSelection data = new StringSelection(salida);
					clipboard.setContents(data, data);
				}
			});
		}
		return btnCopiarSalida;
	}
	private JSeparator getSeparator_3() {
		if (separator_3 == null) {
			separator_3 = new JSeparator();
		}
		return separator_3;
	}
	private JSeparator getSeparator_4() {
		if (separator_4 == null) {
			separator_4 = new JSeparator();
		}
		return separator_4;
	}
	private JSeparator getSeparator_5() {
		if (separator_5 == null) {
			separator_5 = new JSeparator();
		}
		return separator_5;
	}
	private JSeparator getSeparator_6() {
		if (separator_6 == null) {
			separator_6 = new JSeparator();
		}
		return separator_6;
	}
	private JSeparator getSeparator_7() {
		if (separator_7 == null) {
			separator_7 = new JSeparator();
		}
		return separator_7;
	}
	private JSeparator getSeparator_8() {
		if (separator_8 == null) {
			separator_8 = new JSeparator();
		}
		return separator_8;
	}
	private JSeparator getSeparator_9() {
		if (separator_9 == null) {
			separator_9 = new JSeparator();
		}
		return separator_9;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("A\u00F1adir sal:");
		}
		return lblNewLabel_2;
	}
}
