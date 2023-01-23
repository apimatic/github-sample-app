# Rate-Limit

Check your current rate limit status

```java
RateLimitController rateLimitController = client.getRateLimitController();
```

## Class Name

`RateLimitController`


# Rate-Limit Get

**Note:** Accessing this endpoint does not count against your REST API rate limit.

**Note:** The `rate` object is deprecated. If you're writing new API client code or updating existing code, you should use the `core` object instead of the `rate` object. The `core` object contains the same information that is present in the `rate` object.

API method documentation: [https://docs.github.com/rest/reference/rate-limit#get-rate-limit-status-for-the-authenticated-user](https://docs.github.com/rest/reference/rate-limit#get-rate-limit-status-for-the-authenticated-user)

```java
CompletableFuture<RateLimitResponse> rateLimitGetAsync()
```

## Response Type

[`RateLimitResponse`](../../doc/models/rate-limit-response.md)

## Example Usage

```java
rateLimitController.rateLimitGetAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "resources": {
    "core": {
      "limit": 5000,
      "remaining": 4999,
      "reset": 1372700873,
      "used": 1
    },
    "search": {
      "limit": 30,
      "remaining": 18,
      "reset": 1372697452,
      "used": 12
    },
    "graphql": {
      "limit": 5000,
      "remaining": 4993,
      "reset": 1372700389,
      "used": 7
    },
    "integration_manifest": {
      "limit": 5000,
      "remaining": 4999,
      "reset": 1551806725,
      "used": 1
    },
    "code_scanning_upload": {
      "limit": 500,
      "remaining": 499,
      "reset": 1551806725,
      "used": 1
    }
  },
  "rate": {
    "limit": 5000,
    "remaining": 4999,
    "reset": 1372700873,
    "used": 1
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`RateLimit404ErrorException`](../../doc/models/rate-limit-404-error-exception.md) |

