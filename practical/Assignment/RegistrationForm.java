import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="RegistrationForm.class" height=1000 width=1000>
     </applet>
*/

public class RegistrationForm extends Applet implements ActionListener, ItemListener
{
	Label lName, lEmail, lContact, lClgName, lDepartment, lSubject, lGender;
	TextField tName, tEmail, tContact;
	Button submit, cancel, bFirst, bSecond, bThird;
	Choice department;
	List clgName;
	TextArea acheivement;
	CheckboxGroup cbg;
	Checkbox cdMale, cbFemale;
	
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		lName= new Label("Name");
		tName= new TextField("Enter your full name...", 40);
		lEmail= new Label("Email");
		tEmail= new TextField(40);
		lContact= new Label("Contact");
		tContact= new TextField(40);
		lGender= new Label("Gender");
		cbg= new CheckboxGroup();
		cbMale= new Checkbox("Male",cbg);
		cbFemale= new Checkbox("Female",cbg);
		lClgName= new Label("Collage Name");
		clgName= new List(5,true);
		lDepartment= new Label("Department");
		department= new Choice();
		lSubject= new Label("Subject");
		bFirst= new Button("first year");
		bSecond= new Button("second year");
		bThird= new Button("third year");
		submit= new Button("submit");
		cancel= new Button("cancel");


		//add controls to the applet window

		add(lName);
		add(tName);
		add(lMail);
		add(tMail);
		add(lContact);
		add(tContact);
		add(lGender);
		add(cbMale);
		add(cbFemale);
		add(lClgName);
		add(clgName);
		add(lDepartment);
		add(department);
		add(lSubject);
		add(bFirst);
		add(submit);
		add(cancel);
				
	}
}