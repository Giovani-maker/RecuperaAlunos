package com.edusoft.rest.interfacegrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import com.edusoft.rest.conWs.GeraGet;
import com.edusoft.rest.conWs.GeraPost;

import com.edusoft.rest.datasource.model.DTOaluno;
import com.edusoft.rest.datasource.model.DTOalunoDados;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;




import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JLabel lblVerificarAlunos;
	private JPanel panel2;
	private JLabel lblCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 643);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTirulo = new JLabel("RECUPERA ALUNOS");
		lblTirulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTirulo.setForeground(new Color(102, 153, 255));
		lblTirulo.setFont(new Font("Georgia", Font.BOLD, 40));
		lblTirulo.setBounds(197, 0, 495, 117);
		contentPane.add(lblTirulo);

		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(new Color(100,100,100));
				lblVerificarAlunos.setForeground(new Color(102,153,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(new Color(153,204,255));
				lblVerificarAlunos.setForeground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1.setBackground(new Color(100,100,100));
				lblVerificarAlunos.setForeground(new Color(102,153,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setBackground(new Color(153,204,255));
				lblVerificarAlunos.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVisualizacao tela = new TelaVisualizacao();
				tela.setVisible(true);
				TelaInicial.this.dispose();
			}
		});
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(458, 119, 400, 457);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		lblVerificarAlunos = new JLabel("VERIFICAR ALUNOS");
		lblVerificarAlunos.setForeground(Color.WHITE);
		lblVerificarAlunos.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblVerificarAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerificarAlunos.setBounds(0, 0, 400, 457);
		panel_1.add(lblVerificarAlunos);

		panel2 = new JPanel();
		panel2.setBackground(new Color(153, 204, 255));
		panel2.setBounds(26, 119, 400, 457);
		contentPane.add(panel2);
		panel2.setLayout(null);
		panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel2.setBackground(new Color(100,100,100));
				lblCadastro.setForeground(new Color(102,153,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel2.setBackground(new Color(153,204,255));
				lblCadastro.setForeground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel2.setBackground(new Color(100,100,100));
				lblCadastro.setForeground(new Color(102,153,255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel2.setBackground(new Color(153,204,255));
				lblCadastro.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String json;
				String val;
				DTOaluno aluno = new DTOaluno();

				val = JOptionPane.showInputDialog(null, "Entre com o nome do aluno");
				aluno.setNome(val);
				while(true) {
					try {
						val = JOptionPane.showInputDialog(null, "Entre com o total de aulas do aluno");
						aluno.setTotal_aulas(Integer.parseInt(val));
						if(aluno.getTotal_aulas()<=0)
							throw new Exception();
						break;
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Valor digitado inválido",null,1);
					}
				}
				while(true) {
					try {
						val = JOptionPane.showInputDialog(null, "Entre com a 1ª nota do aluno");
						aluno.setNota1(Double.parseDouble(val));
						val = JOptionPane.showInputDialog(null, "Entre com as faltas do aluno na 1ª Etapa");
						aluno.setFaltas1(Integer.parseInt(val));
						if(aluno.getNota1()<0||aluno.getNota1()>10)
							throw new Exception();
						if(aluno.getFaltas1()>aluno.getTotal_aulas())
							throw new Exception();
						break;
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Valor digitado inválido",null,1);
					}
				}
				while(true) {
					try {
						val = JOptionPane.showInputDialog(null, "Entre com a 2ª nota do aluno");
						aluno.setNota2(Double.parseDouble(val));
						val = JOptionPane.showInputDialog(null, "Entre com as faltas do aluno na 2ª Etapa");
						aluno.setFaltas2(Integer.parseInt(val));
						if(aluno.getNota2()<0||aluno.getNota2()>10)
							throw new Exception();
						if((aluno.getFaltas1()+aluno.getFaltas2())>aluno.getTotal_aulas())
							throw new Exception();
						break;
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Valor digitado inválido",null,1);
					}
				}
				while(true) {
					try {
						
						val = JOptionPane.showInputDialog(null, "Entre com a 3ª nota do aluno");
						aluno.setNota3(Double.parseDouble(val));
						val = JOptionPane.showInputDialog(null, "Entre com as faltas do aluno na 3ª Etapa");
						aluno.setFaltas3(Integer.parseInt(val));
						if(aluno.getNota3()<0||aluno.getNota3()>10)
							throw new Exception();
						if((aluno.getFaltas1()+aluno.getFaltas2()+aluno.getFaltas3())>aluno.getTotal_aulas())
							throw new Exception();
						break;
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Valor digitado inválido",null,1);
					}
				}
				java.lang.reflect.Type alunoType = new TypeToken<DTOaluno>() {
				}.getType();
				
				GeraGet get = new GeraGet(); 
				Gson g = new Gson();
				json = g.toJson(aluno,alunoType);
				String URL = "http://localhost:8080/recuperaalunos/token/gerar";
				String token = null;
				try {
					token = get.sendGet(URL, "GET");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(token);
				URL = "http://localhost:8080/recuperaalunos/aluno/save";
				GeraPost post = new GeraPost();
				
				try {
					post.sendPost(URL, json, "POST", token);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
				
				calcular(aluno);
			}
		});
		lblCadastro = new JLabel("CADASTRO ALUNO");
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setBounds(0, 0, 400, 457);
		panel2.add(lblCadastro);
		setLocationRelativeTo(null);
	}
	public void calcular(DTOaluno aluno) {
		DTOalunoDados alunoDados = new DTOalunoDados();
		double media ;
		double frequencia;
		String situacao;
		media = ((aluno.getNota1()+aluno.getNota2()+aluno.getNota3())/3);
		int totalFaltas = (aluno.getFaltas1()+aluno.getFaltas2()+aluno.getFaltas3());
		frequencia = (100-((100*totalFaltas)/aluno.getTotal_aulas()));
		if(frequencia<70){
			situacao = "RF";
		}else {
			if(media >=7) {
				situacao = "AP";
			}else {
				situacao = "RM";
			}
		}
		alunoDados.setFrequencia(frequencia);
		alunoDados.setMedia(media);
		alunoDados.setSituacao(situacao);
		alunoDados.setIdAluno(alunoDados.getId());
	
		GeraGet get = new GeraGet(); 
		Gson g = new Gson();
		String json = null;
		java.lang.reflect.Type alunoDadosType = new TypeToken<DTOalunoDados>() {
		}.getType();
		json = g.toJson(alunoDados,alunoDadosType);
		String URL = "http://localhost:8080/recuperaalunos/token/gerar";
		String token = null;
		try {
			token = get.sendGet(URL, "GET");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(token);
		URL = "http://localhost:8080/recupera/alunoDados/save";
		GeraPost post = new GeraPost();

		try {
			
			post.sendPost(URL, json,"POST", token);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
	}
}
