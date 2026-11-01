package eventDriven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class FitnessHelperEd {

	public static void main(String[] args) {

		// frame
		JFrame frame = new JFrame("Fitness Helper");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// welcoming
		JLabel welcome = new JLabel("Welcome To The Fitness Helper");
		welcome.setBounds(150, 10, 200, 20);
		frame.add(welcome);

		// height
		JLabel heightLabel = new JLabel("Height (cm): ");
		heightLabel.setBounds(50, 50, 100, 30);
		frame.add(heightLabel);

		JTextField heightTxt = new JTextField();
		heightTxt.setBounds(200, 50, 150, 30);
		frame.add(heightTxt);

		// weight
		JLabel weightLabel = new JLabel("Weight (Kg): ");
		weightLabel.setBounds(50, 80, 100, 30);
		frame.add(weightLabel);

		JTextField weightTxt = new JTextField();
		weightTxt.setBounds(200, 80, 150, 30);
		frame.add(weightTxt);

		// age
		JLabel ageLabel = new JLabel("Age:");
		ageLabel.setBounds(50, 110, 100, 30);
		frame.add(ageLabel);

		JTextField ageTxt = new JTextField();
		ageTxt.setBounds(200, 110, 150, 30);
		frame.add(ageTxt);

		// gender
		JLabel genderLabel = new JLabel("Gender (M/F):");
		genderLabel.setBounds(50, 140, 100, 30);
		frame.add(genderLabel);

		JTextField genderTxt = new JTextField();
		genderTxt.setBounds(200, 140, 150, 30);
		frame.add(genderTxt);

		// button
		JButton btn = new JButton("Calculate");
		btn.setBounds(170, 200, 100, 50);
		frame.add(btn);

		// calculations labels

		JLabel calorieLabel = new JLabel();
		calorieLabel.setBounds(50, 270, 300, 30);
		frame.add(calorieLabel);

		JLabel protienLabel = new JLabel();
		protienLabel.setBounds(50, 300, 300, 30);
		frame.add(protienLabel);

		JLabel waterLabel = new JLabel();
		waterLabel.setBounds(50, 330, 300, 30);
		frame.add(waterLabel);

		JLabel noteLabel = new JLabel();
		JLabel noteLabel2 = new JLabel();
		noteLabel.setBounds(50, 360, 500, 50);
		noteLabel2.setBounds(50, 380, 500, 50);
		frame.add(noteLabel2);
		frame.add(noteLabel);

		// action listener to print the calculations
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double height = Double.parseDouble(heightTxt.getText());
				double weight = Double.parseDouble(weightTxt.getText());
				double age = Double.parseDouble(ageTxt.getText());
				char gender = genderTxt.getText().charAt(0);

				FitnessCalculatorEd trainer = new FitnessCalculatorEd(height, weight, age, gender);

				calorieLabel.setText("Recommended daily Calories Intake: " + trainer.recommendedCalorieIntake());
				protienLabel
						.setText("Recommended daily Protien Intake: " + trainer.recommendedProteinIntake() + " Grams");
				waterLabel.setText("Recommended daily Water Intake: " + trainer.recommendedWaterIntake() + " Litres");
				noteLabel.setText("Note: these calculations are general guideline and may vary depending");
				noteLabel2.setText("on individual factors such as activity level, climate, and overall health.");

			}
		});

		// mouse listener to show the feedback box even if there are not any inputs
		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// not usable in my code

			}

			@Override
			public void mousePressed(MouseEvent e) {

				// text box to send your feedback
				JLabel feedbackLabel = new JLabel("Please Enter Your Feedback For Adjustments:");
				frame.add(feedbackLabel);
				feedbackLabel.setBounds(80, 430, 400, 20);

				JTextField feedbackTxt = new JTextField();
				frame.add(feedbackTxt);
				feedbackTxt.setBounds(80, 460, 150, 30);

				// key listener to print feedback
				feedbackTxt.addKeyListener(new KeyListener() {

					@Override
					public void keyReleased(KeyEvent e) {
						String feedback = feedbackTxt.getText();
						System.out.println("Feedback: " + feedback);

						// mouse motion listener to drag the feedback box
						frame.addMouseMotionListener(new MouseMotionListener() {

							@Override
							public void mouseMoved(MouseEvent e) {
								// not usable in my code

							}

							@Override
							public void mouseDragged(MouseEvent e) {
								feedbackTxt.setBounds(e.getX(), e.getY() - 50, 150, 30);

							}
						});
					}

					@Override
					public void keyTyped(KeyEvent e) {
						// not usable in my code

					}

					@Override
					public void keyPressed(KeyEvent e) {
						// not usable in my code

					}

				});

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// not usable in my code

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// not usable in my code

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// not usable in my code

			}
		});

	}
}
