package health;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.*;

class DoctorViewTest {
    DoctorView view = new DoctorView("nick");
    PatientView pView = new PatientView("nick");
    Health health;
    NewJFrame frame;
    NewRequests request;
    Profile profile;


    @BeforeEach
    void setUp() {
        frame = new NewJFrame();

    }

    @Test
    void getUsername() {
        view.getUsername();
    }

    @Test
    void setUsername() {
        view.setUsername("nick");
    }

    @Test
    void getRequestID() {
        view.getRequestID();
    }

    @Test
    void setRequestID() {
        view.setRequestID(1);
    }

    @Test
    void getUserType() {
        view.getUserType();
    }

    @Test
    void setUserType() {
        view.setUserType("Doctor");
    }


    @Test
    @DisplayName("Doctor new request select with index")
    void doctorNewRequestWithIndex() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.newRequestButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        RequestConversation.addToRequest.append("yeah");
        RequestConversation.addButton.doClick();
        DoctorView.logout.doClick();


    }

    @Test
    @DisplayName("Doctor new request select without index")
    void doctorNewRequestWithoutIndex() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.newRequestButton.doClick();
        DoctorView.openSelectedButton.doClick();
        RequestConversation.backButton.doClick();
        DoctorView.logout.doClick();

    }

    @Test
    void DoctorNewRequest() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.newRequestButton.doClick();
        RequestConversation.addToRequest.append("Test");
        RequestConversation.addButton.doClick();
        DoctorView.logout.doClick();


    }

    @Test
    @DisplayName("New Request Cancel")
    void DoctorNewRequestCancel() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.newRequestButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        RequestConversation.backButton.doClick();
        DoctorView.logout.doClick();

    }

    @Test
    @DisplayName("Test")
    void DoctorViewInProgressNoSelection() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.inProgressButton.doClick();
        DoctorView.openSelectedButton.doClick();
        DoctorView.logout.doClick();


    }

    @Test
    @DisplayName("Test")
    void DoctorViewInProgressSelection() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();

        DoctorView.inProgressButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        DoctorView.logout.doClick();


    }

    @Test
    @DisplayName("Test")
    void DoctorInProgressAddMessage() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();

        DoctorView.inProgressButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        RequestConversation.addToRequest.setText("test");
        RequestConversation.addButton.doClick();
        DoctorView.logout.doClick();

    }

    @Test
    @DisplayName("Test")
    void DoctorViewCloseReq() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();

        DoctorView.inProgressButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        RequestConversation.closeButton.doClick();
        DoctorView.logout.doClick();

    }

    @Test
    @DisplayName("Test")
    void DoctorViewClosedRequestSelection() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.closeRequestButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        RequestConversation.backButton.doClick();
        DoctorView.logout.doClick();
    }

    @Test
    @DisplayName("Test")
    void DoctorViewNewNoSelection() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.inProgressButton.doClick();
        DoctorView.openSelectedButton.doClick();
        DoctorView.logout.doClick();

    }

    @Test
    @DisplayName("Test")
    void DoctorViewNew() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.inProgressButton.doClick();
        DoctorView.newRequestButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        DoctorView.logout.doClick();


    }

    @Test
    @DisplayName("Test")
    void DoctorViewNewNoSelect() {
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.inProgressButton.doClick();
        DoctorView.newRequestButton.doClick();
        DoctorView.openSelectedButton.doClick();
        DoctorView.logout.doClick();

    }

    @Test
    @DisplayName("No new requests branch")
    void noNewRequests(){
        DoctorView.newRequestButton.doClick();
    }

    @Test
    @DisplayName("input validation Doctor")
    public void passwordWrong(){
        NewJFrame.txt_username.setText("bob");
        NewJFrame.txt_password.setText("bob");
        NewJFrame.LoginAsDoctor.doClick();
    }
    @Test
    @DisplayName("input validation Doctor")
    public void passwordWrongHealth(){
        NewJFrame.txt_username.setText("bob");
        NewJFrame.txt_password.setText("bob");
        NewJFrame.LoginAsDoctor.doClick();
    }

    @Test
    @After
    void newInProgress(){
        NewJFrame.txt_username.setText("nick");
        NewJFrame.txt_password.setText("nick");
        NewJFrame.LoginAsDoctor.doClick();
        DoctorView.newRequestButton.doClick();
        DoctorView.requestsList.setSelectedIndex(1);
        DoctorView.openSelectedButton.doClick();
        RequestConversation.addToRequest.append("yeah");
        RequestConversation.addButton.doClick();
        DoctorView.logout.doClick();

    }

}