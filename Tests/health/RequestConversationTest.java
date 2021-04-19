package health;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestConversationTest {
    RequestConversation conversationD;
    RequestConversation conversationP;
    NewJFrame frame;

    DoctorView view;

    @BeforeEach
    void setUp() {
        view = new DoctorView("nick");
        conversationD = new RequestConversation(100,"nick","Doctor");
        conversationP = new RequestConversation(100,"nick","Patient");

    }

}