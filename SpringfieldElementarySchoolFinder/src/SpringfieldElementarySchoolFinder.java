import javax.swing.JOptionPane;
/**
 * @author kaleb
 *
 */
public class SpringfieldElementarySchoolFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
				int inputZipCodeInteger; // i1
				String outputMessageString; // o1
				
				inputZipCodeInteger = Integer.parseInt(JOptionPane.showInputDialog("Please enter a Springfield zip code between 65801 and 65810 (or –1 to end"));
						
				while(inputZipCodeInteger < 65801 || inputZipCodeInteger > 65810)
				{
					if(inputZipCodeInteger == -1)
					{
						outputMessageString = "Thank you for using the application. Goodbye.";
						JOptionPane.showMessageDialog(null, outputMessageString);JOptionPane.showMessageDialog(null, outputMessageString);
						System.exit(0);
					}
					else
					{
						outputMessageString = "Invalid Springfield zip code!";
						JOptionPane.showMessageDialog(null, outputMessageString);
						inputZipCodeInteger = Integer.parseInt(JOptionPane.showInputDialog("Please enter a Springfield zip code between 65801 and 65810 (or –1 to end"));
					}
				}
								
				outputMessageString = "Thank you for entering a valid Springfield zip code!";
				JOptionPane.showMessageDialog(null, outputMessageString);
				
				while(inputZipCodeInteger != -1)
				{
					
					switch(inputZipCodeInteger)
					{
						case 65801:	case 65805: case 65806: case 65808:	
							outputMessageString = "Sorry, this zip code does not have it's own elementary school!";
							break;
						case 65802:	case 65803:	case 65807:
							outputMessageString = "Your elementary school is Willard Elementary!";
							break;
						case 65804:	
							outputMessageString = "Your elementary school is Disney Elementary!";
							break;
						case 65809:	
							outputMessageString = "Your elementary school is Sequiota Elementary!";
							break;
						case 65810:	
							outputMessageString = "Your elementary school is Gray Elementary!";
							break;
						default:	
							outputMessageString = "Invalid Springfield zip code!";
							break;
					}
					JOptionPane.showMessageDialog(null, outputMessageString);
					inputZipCodeInteger = Integer.parseInt(JOptionPane.showInputDialog("Please enter a Springfield zip code between 65801 and 65810 (or –1 to end"));
				}
				
				outputMessageString = "Thank you for using the application! Good bye!!!";
				JOptionPane.showMessageDialog(null, outputMessageString);

	}

}
