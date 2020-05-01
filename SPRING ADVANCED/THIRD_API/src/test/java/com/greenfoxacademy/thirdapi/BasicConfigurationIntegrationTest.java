//package com.greenfoxacademy.thirdapi;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = RANDOM_PORT)
//public class BasicConfigurationIntegrationTest {
//
//    TestRestTemplate restTemplate;
//    URL base;
//    @LocalServerPort
//    int port;
//
//    @Before
//    public void setUp() throws MalformedURLException {
//        restTemplate = new TestRestTemplate("user", "password");
//        base = new URL("http://localhost:" + port);
//    }
//
//    @Test
//    public void whenLoggedUserRequestsHomePage_ThenSuccess()
//            throws IllegalStateException, IOException {
//        ResponseEntity<String> response
//                = restTemplate.getForEntity(base.toString(), String.class);
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertTrue(response
//                .getBody()
//                .contains("Baeldung"));
//    }
//
//    @Test
//    public void whenUserWithWrongCredentials_thenUnauthorizedPage()
//            throws Exception {
//
//        restTemplate = new TestRestTemplate("user", "wrongpassword");
//        ResponseEntity<String> response
//                = restTemplate.getForEntity(base.toString(), String.class);
//
//        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
//        assertTrue(response
//                .getBody()
//                .contains("Unauthorized"));
//    }
//}
