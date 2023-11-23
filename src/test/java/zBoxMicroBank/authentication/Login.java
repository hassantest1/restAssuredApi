package zBoxMicroBank.authentication;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import zBoxMicroBank.constants.ApiUrls;
import zBoxMicroBank.models.common.Data;
import zBoxMicroBank.models.common.ApiModelZbox;
import zBoxMicroBank.models.common.PayLoad;
import zBoxMicroBank.models.headers.HeadersModel;
import zBoxMicroBank.utils.TestUtils;

public class Login {

	public static Response login(String userName,String userPass) {
				
		ApiModelZbox example = new ApiModelZbox();
		example.setData(new Data());
		example.getData().setPayLoad(new PayLoad());
		example.getData().getPayLoad().setUserName(userName);
		example.getData().getPayLoad().setUserPassword(userPass);
		
		HeadersModel headers = new HeadersModel();
		//headers.setAuthorization("Berer Test");
		headers.setContentType("Application/json");
						
		TestUtils testUtils = new TestUtils();
		
		String jsonBody = testUtils.gsonString(example);
		System.out.println(jsonBody);
		//System.out.println(jsonBody);
		
        Map<String, Object> headersMap = new ObjectMapper().convertValue(headers, new TypeReference<Map<String, Object>>() {});
        //System.out.println(headersMap.toString());
		Response response = given()
				.contentType(ContentType.JSON)
				.body(jsonBody)
				.when()
				.post(ApiUrls.login)
				.then()
				.statusCode(200)
				.log()
				.all()
				.extract().response();
		
		return response;
	}
	
}
