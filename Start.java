import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Start {

	private JFrame frmCalculadora;
	private JTextField display;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton suma;
	private JButton resta;
	private JButton dividir;
	private JButton multiplicar;
	private JButton btnPar;
	private JButton btnC;
	private JButton igual;

	private String contenidoDisplay = "";
	private float operando1 = 0.0f;
	private float operando2 = 0.0f;
	private String operacion = "";
	private float operacionSuma = 0.0f;
	private float operacionResta = 0.0f;
	private float operacionMultiplicacion = 0.0f;
	private float operacionDivision = 0.0f;
	private float operacionPar = 0.0f;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(Color.GRAY);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 485, 745);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		display = new JTextField();
		display.setForeground(new Color(0, 0, 0));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Tahoma", Font.BOLD, 14));
		display.setEnabled(false);
		display.setBounds(35, 35, 400, 70);
		frmCalculadora.getContentPane().add(display);
		display.setColumns(10);

		// botones de comandos

		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// habilitar los botones

				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				suma.setEnabled(true);
				resta.setEnabled(true);
				dividir.setEnabled(true);
				multiplicar.setEnabled(true);
				btnPar.setEnabled(true);
				igual.setEnabled(true);

				// vaciar el display

				display.setText("");

			}
		});
		btnC.setBackground(new Color(192, 192, 192));
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnC.setBounds(35, 160, 70, 70);
		frmCalculadora.getContentPane().add(btnC);

		suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!display.getText().equals("")) {
					operando1 = Float.parseFloat(display.getText());
					display.setText("");
					operacion = "suma";
				} else {
					display.setText("Error");
					btn0.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					suma.setEnabled(false);
					resta.setEnabled(false);
					dividir.setEnabled(false);
					multiplicar.setEnabled(false);
					btnPar.setEnabled(false);
					igual.setEnabled(false);
				}

				// bloqueo del resto de operaciones

				resta.setEnabled(false);
				dividir.setEnabled(false);
				multiplicar.setEnabled(false);
				btnPar.setEnabled(false);

			}
		});
		suma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		suma.setBounds(365, 260, 70, 70);
		frmCalculadora.getContentPane().add(suma);

		resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!display.getText().equals("")) {
					operando1 = Float.parseFloat(display.getText());
					display.setText("");

					operacion = "resta";
				} else {
					display.setText("Error");
					btn0.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					suma.setEnabled(false);
					resta.setEnabled(false);
					dividir.setEnabled(false);
					multiplicar.setEnabled(false);
					btnPar.setEnabled(false);
					igual.setEnabled(false);
				}
				// bloqueo del resto de operaciones

				suma.setEnabled(false);
				dividir.setEnabled(false);
				multiplicar.setEnabled(false);
				btnPar.setEnabled(false);
			}
		});
		resta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		resta.setBounds(365, 360, 70, 70);
		frmCalculadora.getContentPane().add(resta);

		multiplicar = new JButton("x");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!display.getText().equals("")) {
					operando1 = Float.parseFloat(display.getText());
					display.setText("");

					operacion = "multiplicacion";
				} else {
					display.setText("Error");
					btn0.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					suma.setEnabled(false);
					resta.setEnabled(false);
					dividir.setEnabled(false);
					multiplicar.setEnabled(false);
					btnPar.setEnabled(false);
					igual.setEnabled(false);
				}
				// bloqueo del resto de operaciones

				suma.setEnabled(false);
				dividir.setEnabled(false);
				resta.setEnabled(false);
				btnPar.setEnabled(false);

			}
		});
		multiplicar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		multiplicar.setBounds(365, 460, 70, 70);
		frmCalculadora.getContentPane().add(multiplicar);

		dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!display.getText().equals("")) {
					operando1 = Float.parseFloat(display.getText());
					display.setText("");

					operacion = "division";
				} else {
					display.setText("Error");
					btn0.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					suma.setEnabled(false);
					resta.setEnabled(false);
					dividir.setEnabled(false);
					multiplicar.setEnabled(false);
					btnPar.setEnabled(false);
					igual.setEnabled(false);
				}
				// bloqueo del resto de operaciones

				suma.setEnabled(false);
				multiplicar.setEnabled(false);
				resta.setEnabled(false);
				btnPar.setEnabled(false);
			}
		});
		dividir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dividir.setBounds(365, 560, 70, 70);
		frmCalculadora.getContentPane().add(dividir);

		btnPar = new JButton("Par");
		btnPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1 = Float.parseFloat(display.getText());
				display.setText("");
				operacionPar = operando1 % 2;

				if (operacionPar == 0) {
					display.setText("Par");
				} else {
					display.setText("Impar");
				}
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				suma.setEnabled(false);
				resta.setEnabled(false);
				dividir.setEnabled(false);
				multiplicar.setEnabled(false);
				igual.setEnabled(false);

			}
		});
		btnPar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPar.setBounds(140, 160, 100, 70);
		frmCalculadora.getContentPane().add(btnPar);

		igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// deshabilitar los objetos
				try {
					operando2 = Float.parseFloat(display.getText());

					if (!display.getText().equals("")) {

						if (operacion.equals("suma")) {

							operacionSuma = operando1 + operando2;
							display.setText("" + operacionSuma);

						} else if (operacion.equals("resta")) {

							operacionResta = operando1 - operando2;
							display.setText("" + operacionResta);

						} else if (operacion.equals("multiplicacion")) {

							operacionMultiplicacion = operando1 * operando2;
							display.setText("" + operacionMultiplicacion);

						} else if (operacion.equals("division")) {
							if (operando2 == 0) {
								display.setText("Indeterminado");
							} else {
								operacionDivision = operando1 / operando2;
								display.setText("" + operacionDivision);
							}

						}
					}
				} catch (Exception e1) {

					display.setText("Error");

					btn0.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					suma.setEnabled(false);
					resta.setEnabled(false);
					dividir.setEnabled(false);
					multiplicar.setEnabled(false);
					btnPar.setEnabled(false);
					igual.setEnabled(false);
				}

				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				suma.setEnabled(false);
				resta.setEnabled(false);
				dividir.setEnabled(false);
				multiplicar.setEnabled(false);
				btnPar.setEnabled(false);
				igual.setEnabled(false);

			}
		});
		igual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		igual.setBounds(135, 560, 170, 70);
		frmCalculadora.getContentPane().add(igual);

		// botones numericos

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "0";

				display.setText(contenidoDisplay);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn0.setBounds(35, 560, 70, 70);
		frmCalculadora.getContentPane().add(btn0);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "1";

				display.setText(contenidoDisplay);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBounds(35, 260, 70, 70);
		frmCalculadora.getContentPane().add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "2";

				display.setText(contenidoDisplay);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(135, 260, 70, 70);
		frmCalculadora.getContentPane().add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "3";

				display.setText(contenidoDisplay);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3.setBounds(235, 260, 70, 70);
		frmCalculadora.getContentPane().add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "4";

				display.setText(contenidoDisplay);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4.setBounds(35, 360, 70, 70);
		frmCalculadora.getContentPane().add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "5";

				display.setText(contenidoDisplay);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5.setBounds(135, 360, 70, 70);
		frmCalculadora.getContentPane().add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "6";

				display.setText(contenidoDisplay);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn6.setBounds(235, 360, 70, 70);
		frmCalculadora.getContentPane().add(btn6);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "7";

				display.setText(contenidoDisplay);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn7.setBounds(35, 460, 70, 70);
		frmCalculadora.getContentPane().add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "8";

				display.setText(contenidoDisplay);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn8.setBounds(135, 460, 70, 70);
		frmCalculadora.getContentPane().add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contenidoDisplay = display.getText().toString();
				contenidoDisplay = contenidoDisplay + "9";

				display.setText(contenidoDisplay);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn9.setBounds(235, 460, 70, 70);
		frmCalculadora.getContentPane().add(btn9);

	}

}
