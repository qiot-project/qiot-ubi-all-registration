//package org.qiot.covid19.datahub.registration.rest;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.containsString;
//
//import org.junit.jupiter.api.Test;
//
//import io.quarkus.test.junit.QuarkusTest;
//
//@QuarkusTest
//public class MultipartResourceTest {
//
//    @Test
//    public void testMultipartDataIsSent() {
//        given().when().put("/registration/multipart").then().statusCode(200).body(
//                containsString("Content-Disposition: form-data; name=\"file\""),
//                containsString("HELLO WORLD"),
//                containsString(
//                        "Content-Disposition: form-data; name=\"fileName\""),
//                containsString("greeting.txt"));
//    }
//
//}