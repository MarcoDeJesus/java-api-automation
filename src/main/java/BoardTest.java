import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import dataModel.Board;
import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    private static final String APP_KEY = "";
    private static final String AUTH_TOKEN = "";
    private static final String BOARD_IDENTIFIER = "5d9d216eb3311c26a444c92f";

    @Test
    public void ValidateOKResponseByID(){
        given()
                .when()
                .get("https://api.trello.com/1/boards/"+ BOARD_IDENTIFIER +"?key="+ APP_KEY +"&token="+ AUTH_TOKEN)
                .then()
                .statusCode(200);
    }
}
