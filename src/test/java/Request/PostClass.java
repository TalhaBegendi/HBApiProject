package Request;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

public class PostClass  {
    final static Logger logger = Logger.getLogger(PostClass.class);
    Response response;
    public void PostRequest(Integer id, String jsonFileName) {
        response = RestAssured.given()
                .when()
                .contentType("application/json")
                .accept("application/json")
                .body(jsonFileName)
                .when()
                .post("getProducts/")
                .then()
                .statusCode(201)
                .log().all()
                .extract().response();
        logger.info("Post Request Body: "+jsonFileName+" request sent");
    }
}
