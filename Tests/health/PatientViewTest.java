package health;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientViewTest {
    DoctorView view= new DoctorView("nick");
    PatientView pView= new PatientView("nick");
    Health health;
    NewJFrame frame;
    NewRequests request;
    Profile profile;
    NewRequests nRequest;
    @BeforeEach
    void setUp() {
        frame = new NewJFrame();

    }



    @Test
    @DisplayName("Patient new request add")
    void PatientNewRequest(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.makeRequestButton.doClick();
        NewRequests.jTextArea1.setText("Test");
        NewRequests.createButton.doClick();
        Profile.logout.doClick();

    }
    @Test
    @DisplayName("New Request Cancel")
    void PatientNewRequestCancel(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.makeRequestButton.doClick();
        NewRequests.jTextArea1.setText("Test");
        NewRequests.CancelButton.doClick();
        Profile.logout.doClick();


    }
    @Test
    @DisplayName("Test")
    void PatientViewInProgressNoSelection(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.viewRequestButton.doClick();
        PatientView.InProgressButton.doClick();
        PatientView.openRequest.doClick();
        Profile.logout.doClick();


    }
    @Test
    @DisplayName("Test")
    void PatientViewInProgressSelection(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.viewRequestButton.doClick();
        PatientView.InProgressButton.doClick();
        PatientView.jList1.setSelectedIndex(1);
        PatientView.openRequest.doClick();
        Profile.logout.doClick();


    }

    @Test
    @DisplayName("Test")
    void PatientInProgressAddMessage(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.viewRequestButton.doClick();
        PatientView.InProgressButton.doClick();
        PatientView.jList1.setSelectedIndex(1);
        PatientView.openRequest.doClick();
        RequestConversation.addToRequest.setText("test");
        RequestConversation.addButton.doClick();
        Profile.logout.doClick();

    }

    @Test
    @DisplayName("Test")
    void PatientViewCloseReq(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.viewRequestButton.doClick();
        PatientView.InProgressButton.doClick();
        PatientView.jList1.setSelectedIndex(1);
        PatientView.openRequest.doClick();
        RequestConversation.closeButton.doClick();
        Profile.logout.doClick();

    }

    @Test
    @DisplayName("Test")
    void PatientViewClosedRequestSelection(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.viewRequestButton.doClick();
        PatientView.closedButton.doClick();
        PatientView.jList1.setSelectedIndex(1);
        PatientView.openRequest.doClick();
        RequestConversation.backButton.doClick();
        PatientView.backButton.doClick();
        Profile.logout.doClick();
    }

    @Test
    @DisplayName("Test")
    void PatientViewNewNoSelection(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.viewRequestButton.doClick();
        PatientView.InProgressButton.doClick();
        PatientView.openRequest.doClick();
        Profile.logout.doClick();


    }

    @Test
    @DisplayName("Test")
    void PatientViewNew(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.viewRequestButton.doClick();
        PatientView.InProgressButton.doClick();
        PatientView.newButton.doClick();
        PatientView.jList1.setSelectedIndex(1);
        PatientView.openRequest.doClick();
        Profile.logout.doClick();


    }

    @Test
    @DisplayName("Test")
    void PatientLogout(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.logout.doClick();

    }
    @Test
    @DisplayName("Main method tests")
    void mainTests(){
        Health health = new Health();
        NewJFrame frame = new NewJFrame();
        NewRequests request = new NewRequests("nick");
        Profile profile = new Profile("nick");
        NewRequests nRequest = new NewRequests("nick");
        profile.main(null);
        profile.dispose();
        health.main(null);

        view.main(null);
        view.dispose();
        request.main(null);
        request.dispose();
        frame.main(null);
        frame.dispose();
        pView.main(null);
        pView.dispose();
        nRequest.main(null);
        nRequest.dispose();
    }

    @Test
    @After
    void newRequestForTesting(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsPatient.doClick();
        Profile.makeRequestButton.doClick();
        NewRequests.jTextArea1.setText("Test");
        NewRequests.createButton.doClick();
        Profile.logout.doClick();

    }

}