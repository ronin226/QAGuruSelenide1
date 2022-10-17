import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.*;

public class SoftAssertionsTest {

    @Test
    public void softAssertionsTest(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $$(".internal.present").findBy(Condition.text("Soft assertions")).should(exist)
                .click();
        $(".markdown-body").$(byText("3. Using JUnit5 extend test class:")).should(exist);
    }
}
