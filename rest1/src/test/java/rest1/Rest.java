package rest1;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Rest {
	public String url="https://reqres.in/api/users?page=2";

  @Test(enabled=false)
  public void f() {
	  Response rep=get(url);
	  int status_code=rep.statusCode();
	  Assert.assertEquals(status_code, 200);
	  System.out.println(rep.asString());

  }
@Test(enabled=false)
public void getresource() {
	given().get(url).then().statusCode(200).body("data.email", hasItems("michael.lawson@reqres.in"));
	
}
@Test(enabled=false)
public void singleuser() {
	baseURI="https://reqres.in/api/users/2";
	  Response rep=get(baseURI);
	//given().get(baseURI).then().statusCode(200).body("data.email", hasItems("janet.weaver@reqres.in"));
	given().get(baseURI).then().statusCode(200).body("data.id", equalTo(2)).log().all();
	System.out.println(rep.asString());

}
@Test (enabled = true)
public void createuser( ) {
	baseURI="https://reqres.in/api/users";
	JSONObject js=new JSONObject();
	js.put("email", "teja59@gmail.com");
	js.put("first_name", "Ram");
	js.put("last_name", "Teja");
	js.put("job", "Tester");
	given().body(js.toJSONString()).when().post(baseURI).then().statusCode(201).log().all();
	System.out.println(js.toJSONString());
}
@Test(enabled = false)
public void updateresource() {
	JSONObject js=new JSONObject();
	  js.put("name", "navayugan");
	  js.put("job", "CEO");
	  given().body(js.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
}
@Test(enabled = false)
public void deleteresource() {
	  given().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
}



}

