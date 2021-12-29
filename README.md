## FedEx API Tools ##

**Note:** Register for API key here: https://developer.fedex.com/api/en-us/home.html

Instantiate

```java
FedexApi fedexApi = new FedexApi(environment, clientId, clientSecret);
```

Environment (PRODUCTION, SANDBOX)

```java
FedexEnvironment environment = FedexEnvironment.SANDBOX;
```

Oauth Credentials

```java
String clientId = "*****************"; 
String clientSecret = "************"; 
```

## Track Package(s) ##

Generate Request

```java
TrackingRequest trackingRequest = TrackingFactory.basicRequest(
	"449044304137821", "149331877648230", "020207021381215"
);
```

**Note:** Fedex caps the number of tracking numbers to 30 per request.

Request

```java
TrackingResponse response = fedexApi.track(trackingRequest);
```

