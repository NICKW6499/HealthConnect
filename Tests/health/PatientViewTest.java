package health;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The Patient View Test class is to ensure that the patient is able to create requests, view their completed, and in
 * progress status requests without having the program crash. This test class also takes into consideration user
 * interface elements and ensuring their respective functionality is present without having the program crash.
 */

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

    /**
     * This test case is to ensure that the patient is able to create a new request and have that request be present in
     * the database.
     */
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

    /**
     * This test is to ensure that the patient is able to cancel in the middle of creating a new request without the
     * program crashing.
     */
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

    /**
     * This test case is to ensure that the patient is able to click the open request button without having selected a
     * request and not have the program crash.
     */
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

    /**
     * This test case is to ensure that the patient is able to view all of the requests that they have that are the
     * in progress status.
     */
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

    /**
     * This test case is to ensure that the patient is able to create a new request and add text to the request message
     * body and upload that new request to the database.
     */
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

    /**
     * This test case is to ensure that the patient is able to view all of their requests that have been
     * closed without the program crashing.
     */
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

    /**
     * This test case is to ensure that the patient is able to view all of their requests that have been closed
     * without the program crashing.
     */
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

    /**
     * This test case is to ensure that the patient is able to clickc the open request button without having selected
     * a request without having the program crash.
     */
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

    /**
     * This test case is to ensure that the patient is able to open one of their requests and have the according
     * information to the user interface.
     */
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

    /**
     * This test case is to ensure that the patient is able to log out of system.
     */
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

    /**
     * This test case is to ensure that the patient is able to create a request, add text to it and then have the
     * database reflect that information.
     */
    @Test
    @DisplayName("input validation Doctor")
    public void passwordWrong(){
        NewJFrame.txt_username.setText("bob");
        NewJFrame.txt_password.setText("bob");
        NewJFrame.LoginAsPatient.doClick();
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