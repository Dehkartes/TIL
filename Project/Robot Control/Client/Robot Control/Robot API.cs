using System;
using System.Net;
using RestSharp;

public class Robot
{
	private readonly string baseurl;
	private RestClient client;
	public Robot()
	{
		baseurl = @"http://localhost:5000/";
		client = new RestClient(baseurl);
    }

	public void test()
	{
		var request = new RestRequest("/test", Method.Get);
        client.Get(request);
		Console.WriteLine("3");
        RestResponse response = client.Get(request); //느림발생
        if (response.StatusCode == HttpStatusCode.OK)
		{
            Console.WriteLine(response.Content);
		}
	}

	public void conn()
	{
		var request = new RestRequest("/param", Method.Post);
		request.AddParameter(null, "test", ParameterType.RequestBody);
		RestResponse response = client.Post(request);

		if (response.StatusCode == HttpStatusCode.OK)
		{
			Console.WriteLine(response.Content);
		}
	}
}
