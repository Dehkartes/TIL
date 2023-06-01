using System;
using System.Net;
using RestSharp;

public class Robot
{
	public Robot()
	{
	}

	public void test()
	{
		Console.WriteLine("test called");
		string baseUrl = @"http://localhost:5000/";

		RestClient client = new RestClient(baseUrl);
		var request = new RestRequest("/test", Method.Get);

		RestResponse response = client.Get(request);

        if (response.StatusCode == HttpStatusCode.OK)
		{
			Console.WriteLine(response.Content);
		}
	}
}
