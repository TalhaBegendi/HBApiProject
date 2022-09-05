package Test;

import Request.*;
import Store.PostStore;
import Store.PutStore;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;

public class TestClass  {

    @BeforeClass
    public static void BaseUrl()
    {
        RestAssured.baseURI="http://localhost:3000/";
    }

    @Test
    public  void GetRequestAllTest() {
        GetClass getClass = new GetClass();
        getClass.GetAllRequest();
    }

    @Test
    public  void GetRequestSingleTest() {
        GetClass getClass = new GetClass();
        getClass.GetSingleRequest(1);
    }

    @Test
    public  void DeleteRequestTest(){
        DeleteClass deleteClass = new DeleteClass();
        deleteClass.DeleteRequest(2);
    }

    @Test
    public void PostRequestTest()
    {
        PostStore postStore = new PostStore();
        postStore.PostRequesStore(2,"Hepsi Home Pasta Tekli Sarkıt Avize Ahşap","Avize",50,true,5,2.19,1,true,"Apple","ipad", Collections.singletonList("talha"));
    }

    @Test
    public void PutRequestTest()
    {
        PutStore putStore = new PutStore();
        putStore.PutRequesStore(1,"Hepsi Home Pasta Tekli Sarkıt Avize Ahşap","Avize",60,true,5,2.19,1,true,"Apple","ipad",Collections.singletonList("https://productimages.hepsiburada.net/s/76/1500/110000018213454.jpg"));
    }
}
