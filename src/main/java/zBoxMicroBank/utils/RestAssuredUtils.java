package zBoxMicroBank.utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import zBoxMicroBank.constants.ApiUrls;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredUtils {
    public static Map<String, Object> getHeaderList;
    private static ConfigManager getKey;

    public static void getHeaders() {

        try {
            getKey = new ConfigManager();
            getHeaderList = new HashMap<String, Object>();
            getHeaderList.put("Authorization",getKey.getKeyValue("AUTH_TOKEN_TRANS"));
            //Response response = Login.login(getKey.getKeyValue("user_name"), getKey.getKeyValue("user_pass"));
            //getHeaderList.put("Authorization", response.jsonPath().get("payLoad.token"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("ERROR"+e);
        }
    }

    public static Response postApiResponse(String Body, String url) {
        try {
            getHeaders();
            return RestAssured.given().headers(getHeaderList).contentType(ContentType.JSON).body(Body)
                    .baseUri(ApiUrls.ZBOX_BASE_URL_QA).basePath(url).when().post().then().statusCode(200).assertThat()
                    .log().all().extract().response();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
            return null;
        }
    }

    public static Response getApiResponse(Map<String, Object> getHeadersList, String url) {

        try {
            return RestAssured.given().headers(getHeadersList).contentType(ContentType.JSON).baseUri(ApiUrls.ZBOX_BASE_URL_QA)
                    .basePath(url).when().get().then().statusCode(200).assertThat().log().all().extract().response();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
            return null;
        }
    }

    public static Response negativePostApiResponse(Map<String, Object> getHeadersList, String Body, String url) {

        try {
            return RestAssured.given().headers(getHeadersList).contentType(ContentType.JSON).body(Body)
                    .baseUri(ApiUrls.ZBOX_BASE_URL_QA).basePath(url).when().post().then().log().all().extract()
                    .response();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
            return null;
        }
    }

    public static JSONArray getSearchCountFromDb() {

        String query ="SELECT *\r\n"
                + "FROM lkp_account_level\r\n"
                + "WHERE account_classification_id = 1\r\n"
                + "AND trunc(createdate) between '01-JUL-2023' AND '05-JUL-2023'";
        System.out.println(query);
        DBQueryExecutor dbQueryExecutor = new DBQueryExecutor();
        JSONArray dbResponse = dbQueryExecutor.getDataByQuery(query);

        return dbResponse;
    }
}
