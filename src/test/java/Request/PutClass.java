package Request;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

public class PutClass {
    final static Logger logger = Logger.getLogger(PutClass.class);
    Response response;
    public void PutRequest(Integer id, String jsonFileName){

        response = RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .body(jsonFileName)
                .when()
                .put("getProducts/"+id)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        logger.info("Put Request Body: "+jsonFileName+" request sent");
    }
}
