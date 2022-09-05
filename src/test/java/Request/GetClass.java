package Request;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

public class GetClass {
    final static Logger logger = Logger.getLogger(GetClass.class);
    Response response;
    public void GetAllRequest(){
        response = RestAssured.given()
                .when()
                .contentType("application/json")
                .accept("application/json")
                .get("getProducts")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        logger.info("Get request sent");
    }
    public void GetSingleRequest(Integer id){
        response = RestAssured.given()
                .when()
                .contentType("application/json")
                .accept("application/json")
                .get("getProducts/"+id)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        logger.info("id: "+id+" Get request sent");
    }
}
