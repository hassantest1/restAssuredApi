package zBoxMicroBank.utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import zBoxMicroBank.constants.ApiUrls;

import java.util.Map;

import static io.restassured.RestAssured.given;


public class RestApiRequest {

    public static Response postApiResponse(Map<String, Object> getHeadersList, String Body, String url) {

        try {
            return given().headers(getHeadersList).contentType(ContentType.JSON).body(Body)
                    .baseUri(ApiUrls.ZBOX_BASE_URL_QA).basePath(url).when().post().then().statusCode(200).assertThat()
                    .log().all().extract().response();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR"+e);
            return null;
        }
    }

    public static Response getApiResponse(Map<String, Object> getHeadersList, String url) {
        try {
            return given().headers(getHeadersList).contentType(ContentType.JSON).baseUri(ApiUrls.ZBOX_BASE_URL_QA)
                    .basePath(url).when().get().then().statusCode(200).assertThat().log().all().extract().response();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR"+e);
            return null;
        }
    }

    public static Response negativePostApiResponse(Map<String, Object> getHeadersList, String Body, String url) {
        try {
            return given().headers(getHeadersList).contentType(ContentType.JSON).body(Body)
                    .baseUri(ApiUrls.ZBOX_BASE_URL_QA).basePath(url).when().post().then().log().all().extract()
                    .response();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR"+e);
            return null;
        }
    }
}