package health;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The purpose of this test class is ensure that the user interface for the Doctor view is able to communicate
 * with the database by uploading requests and modifying requests and that information be store properly. This test
 * class also test to make sure that user interface widgets are able to function without the program crashing.
 */

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

    /**
     * Ensures that the system is able to get the username of an end user from the database.
     */

    @Test
    void getUsername() {
        view.getUsername();
    }

    /**
     * Ensures that the system is able to set the username of an end user
     */
    @Test
    void setUsername() {
        view.setUsername("nick");
    }

    /**
     * Ensures that the system is able to get the id of a request.
     */
    @Test
    void getRequestID() {
        view.getRequestID();
    }


    /**
     * Ensures that the system is able to set the id of a request.
     */
    @Test
    void setRequestID() {
        view.setRequestID(1);
    }

    /**
     * Ensures that an end user is able to set their type whether doctor or patient without crashing
     */
    @Test
    void getUserType() {
        view.getUserType();
    }

    /**
     * Ensures that the system is able to get a users type without crashing.
     */
    @Test
    void setUserType() {
        view.setUserType("Doctor");
    }


    /**
     * Tests to see that the doctor is able to click the open selected button without having selected a request
     * without crashing the system.
     */
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

    /**
     * Tests to see that the doctor is able to click the open selected button with having selected a request
     * without crashing the system.
     */
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

    /**
     * Checks to see that the doctor is able to click the new request button and have all of the new requests populate
     * on the user interface. Without the program crashing.
     */
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

    /**
     * Checks to see if a  doctor is able to begin a request and then cancel the request in case the
     * doctor change their mind or has accidnntly entered this view without having the program crash.
     */
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

    /**
     * Checks to ensure that if the doctor clicks on the open in progress button
     * and nothing is selected that the program does not crash.
     */
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

    /**
     *Checks to ensure that if the doctor clicks on the open in progress button that the
     *  appropriate information is demonstrated in the JFrame.
     */
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

    /**
     * Checks to ensure that the system is able to add a message to a request that is in progress without crashing
     * and updating the database to reflect the changes made to the request.
     */
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

    /**
     * Checks to see that if a request is opened that the information related to that request is populated on the
     * screen, and that the doctor is able to close that request and that the doctor is able to close the request and
     * the database is updated to the following request modification.
     */
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

    /**
     * This tests to ensure that the user interface updates so that all of the closed requests are populated
     * and reflect the database.
     */
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

    /**
     *Checks to see that the system does not crash when a doctor clicks the in progress button and does not
     *  have a selection.
     */
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

    /**
     * Refreshes the user interface so that it displays all of the requests that have a status of new.
     */
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

    /**
     *Ensures that the program does not crash if nothing is selected when the new request button is clicked.
     */
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

    /**
     * Checks to see that the program does not crash if there are no new requests to be displayed.
     */
    @Test
    @DisplayName("No new requests branch")
    void noNewRequests(){
        DoctorView.newRequestButton.doClick();
    }

    /**
     *Tests the functionality when a doctor is opening a new request that has not been attended by a doctor,
     * and adding text to that request then updating the database to reflect that that request is now in progress.
     */
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