package Request;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

public class DeleteClass {
    final static Logger logger = Logger.getLogger(DeleteClass.class);
    Response response;
    public void DeleteRequest(Integer id){
        response = RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .when()
                .delete("getProducts/"+id)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        logger.info("id: "+id+" Delete request sent");
    }
}
