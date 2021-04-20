import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		JFrame screen = new JFrame("Projeto Semestral - Gustavo Borri de Azevedo - Rm:82226");
		
		JTabbedPane panels = new JTabbedPane();
		
		JPanel registrationPanel = new JPanel();
		BorderLayout bd = new BorderLayout();
		bd.setHgap(20);
		registrationPanel.setLayout(bd);
		JLabel image =new JLabel(new ImageIcon(new ImageIcon("res/raya.png").getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT))); 
		registrationPanel.add(image, BorderLayout.WEST);
		
		JPanel register = new JPanel();
		register.setLayout(new GridLayout(6,1));
		
		register.add(new JLabel("Titulo do Filme"));
		JTextField textTitle = new JTextField();
		register.add(textTitle);
		
		register.add(new JLabel("Sinopse"));
		JTextField synopsisText = new JTextField();
		register.add(synopsisText);
		
		register.add(new JLabel("Gênero do Filme"));
		JComboBox<String> movieGender = new JComboBox<>();
		movieGender.addItem("Romance");
		movieGender.addItem("Ação");
		movieGender.addItem("Suspense");
		movieGender.addItem("Ficção");
		movieGender.addItem("Drama");
		movieGender.addItem("Terror");
		register.add(movieGender);
		
		JPanel whereWatch = new JPanel();
		whereWatch.setLayout(new GridLayout(7,1));
		whereWatch.add(new JLabel("Onde Assistir"));
		
		ButtonGroup watchButton = new ButtonGroup();
		
		JRadioButton netflix = new JRadioButton("Netflix");
		netflix.setActionCommand("Netflix");
		watchButton.add(netflix);
		whereWatch.add(netflix);
		
		JRadioButton amazonPrimeVideo = new JRadioButton("Amazon Prime Video");
		amazonPrimeVideo.setActionCommand("Amazon Prime Video");
		watchButton.add(amazonPrimeVideo);
		whereWatch.add(amazonPrimeVideo);
				
		JRadioButton disneyplus = new JRadioButton("Disney+");
		disneyplus.setActionCommand("Disney+");
		watchButton.add(disneyplus);
		whereWatch.add(disneyplus);
		
		JCheckBox watched = new JCheckBox("Assistido");
		whereWatch.add(watched);
		
		whereWatch.add(new JLabel("Avaliação"));
		StarRater rating = new StarRater(5);
		whereWatch.add(rating);
		
		JPanel buttons = new JPanel();
		JButton saveButton = new JButton("Salvar");
		saveButton.addActionListener(action -> {
			Filme movie = new Filme();
			movie.setAvaliacao(rating.getSelection());
			movie.setGenero((String)movieGender.getSelectedItem());
			movie.setOndeAssisstir(watchButton.getSelection().getActionCommand());
			movie.setSinopse(synopsisText.getText());
			movie.setTitulo(textTitle.getText());
			movie.setAssistido(watched.isSelected());
			System.out.println(movie);
		});
		buttons.add(saveButton);
		JButton cancelButton = new JButton("Cancelar");
		buttons.add(cancelButton);
		
		registrationPanel.add(buttons, BorderLayout.SOUTH);
		
		registrationPanel.add(whereWatch, BorderLayout.EAST);
		
		registrationPanel.add(register, BorderLayout.CENTER);
		
		panels.add("Cadastro", registrationPanel);
		
		
		JPanel panelList = new JPanel();
		panels.add("Lista", panelList);
		
		screen.add(panels);
		
		
		screen.setSize(800,400);
		screen.setVisible(true);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
}
