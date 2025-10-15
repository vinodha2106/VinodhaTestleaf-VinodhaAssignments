package week3.day2;

public class APIClient {

	public String sendRequest(String endPoint) {
		System.out.println("Endpoint from APIclient only endpoint : " + endPoint);
		return endPoint;
	}

	public String sendRequest(String requestBody, String endPoint, boolean requestStatus) {
		
		System.out.println("RequestBody : " + requestBody);
		System.out.println("EndPoint : " + endPoint);
		System.out.println("Request Status: " + requestStatus);

		return requestBody + endPoint + requestStatus;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient client=new APIClient();
		client.sendRequest("www.googl.com");
		client.sendRequest("www.example.com", "www.example.com", true);

	}

}
