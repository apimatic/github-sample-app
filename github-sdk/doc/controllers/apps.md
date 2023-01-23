# Apps

Information for integrations and installations.

```java
AppsController appsController = client.getAppsController();
```

## Class Name

`AppsController`

## Methods

* [Apps Get-Authenticated](../../doc/controllers/apps.md#apps-get-authenticated)
* [Apps Create-From-Manifest](../../doc/controllers/apps.md#apps-create-from-manifest)
* [Apps Get-Webhook-Config-for-App](../../doc/controllers/apps.md#apps-get-webhook-config-for-app)
* [Apps Update-Webhook-Config-for-App](../../doc/controllers/apps.md#apps-update-webhook-config-for-app)
* [Apps List-Webhook-Deliveries](../../doc/controllers/apps.md#apps-list-webhook-deliveries)
* [Apps Get-Webhook-Delivery](../../doc/controllers/apps.md#apps-get-webhook-delivery)
* [Apps Redeliver-Webhook-Delivery](../../doc/controllers/apps.md#apps-redeliver-webhook-delivery)
* [Apps List-Installations](../../doc/controllers/apps.md#apps-list-installations)
* [Apps Get-Installation](../../doc/controllers/apps.md#apps-get-installation)
* [Apps Delete-Installation](../../doc/controllers/apps.md#apps-delete-installation)
* [Apps Create-Installation-Access-Token](../../doc/controllers/apps.md#apps-create-installation-access-token)
* [Apps Suspend-Installation](../../doc/controllers/apps.md#apps-suspend-installation)
* [Apps Unsuspend-Installation](../../doc/controllers/apps.md#apps-unsuspend-installation)
* [Apps Delete-Authorization](../../doc/controllers/apps.md#apps-delete-authorization)
* [Apps Check-Token](../../doc/controllers/apps.md#apps-check-token)
* [Apps Reset-Token](../../doc/controllers/apps.md#apps-reset-token)
* [Apps Delete-Token](../../doc/controllers/apps.md#apps-delete-token)
* [Apps Scope-Token](../../doc/controllers/apps.md#apps-scope-token)
* [Apps Get-by-Slug](../../doc/controllers/apps.md#apps-get-by-slug)
* [Apps List-Repos-Accessible-to-Installation](../../doc/controllers/apps.md#apps-list-repos-accessible-to-installation)
* [Apps Revoke-Installation-Access-Token](../../doc/controllers/apps.md#apps-revoke-installation-access-token)
* [Apps Get-Subscription-Plan-for-Account](../../doc/controllers/apps.md#apps-get-subscription-plan-for-account)
* [Apps List-Plans](../../doc/controllers/apps.md#apps-list-plans)
* [Apps List-Accounts-for-Plan](../../doc/controllers/apps.md#apps-list-accounts-for-plan)
* [Apps Get-Subscription-Plan-for-Account-Stubbed](../../doc/controllers/apps.md#apps-get-subscription-plan-for-account-stubbed)
* [Apps List-Plans-Stubbed](../../doc/controllers/apps.md#apps-list-plans-stubbed)
* [Apps List-Accounts-for-Plan-Stubbed](../../doc/controllers/apps.md#apps-list-accounts-for-plan-stubbed)
* [Apps Get-Org-Installation](../../doc/controllers/apps.md#apps-get-org-installation)
* [Apps Get-Repo-Installation](../../doc/controllers/apps.md#apps-get-repo-installation)
* [Apps List-Installations-for-Authenticated-User](../../doc/controllers/apps.md#apps-list-installations-for-authenticated-user)
* [Apps List-Installation-Repos-for-Authenticated-User](../../doc/controllers/apps.md#apps-list-installation-repos-for-authenticated-user)
* [Apps Add-Repo-to-Installation-for-Authenticated-User](../../doc/controllers/apps.md#apps-add-repo-to-installation-for-authenticated-user)
* [Apps Remove-Repo-From-Installation-for-Authenticated-User](../../doc/controllers/apps.md#apps-remove-repo-from-installation-for-authenticated-user)
* [Apps List-Subscriptions-for-Authenticated-User](../../doc/controllers/apps.md#apps-list-subscriptions-for-authenticated-user)
* [Apps List-Subscriptions-for-Authenticated-User-Stubbed](../../doc/controllers/apps.md#apps-list-subscriptions-for-authenticated-user-stubbed)
* [Apps Get-User-Installation](../../doc/controllers/apps.md#apps-get-user-installation)


# Apps Get-Authenticated

Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the "[List installations for the authenticated app](https://docs.github.com/rest/reference/apps#list-installations-for-the-authenticated-app)" endpoint.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-the-authenticated-app](https://docs.github.com/rest/reference/apps#get-the-authenticated-app)

```java
CompletableFuture<AppResponse> appsGetAuthenticatedAsync()
```

## Response Type

[`AppResponse`](../../doc/models/app-response.md)

## Example Usage

```java
appsController.appsGetAuthenticatedAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "slug": "octoapp",
  "node_id": "MDExOkludGVncmF0aW9uMQ==",
  "owner": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": true
  },
  "name": "Octocat App",
  "description": "",
  "external_url": "https://example.com",
  "html_url": "https://github.com/apps/octoapp",
  "created_at": "2017-07-08T16:18:44-04:00",
  "updated_at": "2017-07-08T16:18:44-04:00",
  "permissions": {
    "metadata": "read",
    "contents": "read",
    "issues": "write",
    "single_file": "write"
  },
  "events": [
    "push",
    "pull_request"
  ]
}
```


# Apps Create-From-Manifest

Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.

API method documentation: [https://docs.github.com/rest/reference/apps#create-a-github-app-from-a-manifest](https://docs.github.com/rest/reference/apps#create-a-github-app-from-a-manifest)

```java
CompletableFuture<AppManifestsConversionsResponse> appsCreateFromManifestAsync(
    final String code)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `code` | `String` | Template, Required | - |

## Response Type

[`AppManifestsConversionsResponse`](../../doc/models/app-manifests-conversions-response.md)

## Example Usage

```java
String code = "code8";

appsController.appsCreateFromManifestAsync(code).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "slug": "octoapp",
  "node_id": "MDxOkludGVncmF0aW9uMQ==",
  "owner": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": true
  },
  "name": "Octocat App",
  "description": "",
  "external_url": "https://example.com",
  "html_url": "https://github.com/apps/octoapp",
  "created_at": "2017-07-08T16:18:44-04:00",
  "updated_at": "2017-07-08T16:18:44-04:00",
  "permissions": {
    "metadata": "read",
    "contents": "read",
    "issues": "write",
    "single_file": "write"
  },
  "events": [
    "push",
    "pull_request"
  ],
  "client_id": "Iv1.8a61f9b3a7aba766",
  "client_secret": "1726be1638095a19edd134c77bde3aa2ece1e5d8",
  "webhook_secret": "e340154128314309424b7c8e90325147d99fdafa",
  "pem": "-----BEGIN RSA PRIVATE KEY-----\nMIIEowIBAAKCAQEAuEPzOUE+kiEH1WLiMeBytTEF856j0hOVcSUSUkZxKvqczkWM\n9vo1gDyC7ZXhdH9fKh32aapba3RSsp4ke+giSmYTk2mGR538ShSDxh0OgpJmjiKP\nX0Bj4j5sFqfXuCtl9SkH4iueivv4R53ktqM+n6hk98l6hRwC39GVIblAh2lEM4L/\n6WvYwuQXPMM5OG2Ryh2tDZ1WS5RKfgq+9ksNJ5Q9UtqtqHkO+E63N5OK9sbzpUUm\noNaOl3udTlZD3A8iqwMPVxH4SxgATBPAc+bmjk6BMJ0qIzDcVGTrqrzUiywCTLma\nszdk8GjzXtPDmuBgNn+o6s02qVGpyydgEuqmTQIDAQABAoIBACL6AvkjQVVLn8kJ\ndBYznJJ4M8ECo+YEgaFwgAHODT0zRQCCgzd+Vxl4YwHmKV2Lr+y2s0drZt8GvYva\nKOK8NYYZyi15IlwFyRXmvvykF1UBpSXluYFDH7KaVroWMgRreHcIys5LqVSIb6Bo\ngDmK0yBLPp8qR29s2b7ScZRtLaqGJiX+j55rNzrZwxHkxFHyG9OG+u9IsBElcKCP\nkYCVE8ZdYexfnKOZbgn2kZB9qu0T/Mdvki8yk3I2bI6xYO24oQmhnT36qnqWoCBX\nNuCNsBQgpYZeZET8mEAUmo9d+ABmIHIvSs005agK8xRaP4+6jYgy6WwoejJRF5yd\nNBuF7aECgYEA50nZ4FiZYV0vcJDxFYeY3kYOvVuKn8OyW+2rg7JIQTremIjv8FkE\nZnwuF9ZRxgqLxUIfKKfzp/5l5LrycNoj2YKfHKnRejxRWXqG+ZETfxxlmlRns0QG\nJ4+BYL0CoanDSeA4fuyn4Bv7cy/03TDhfg/Uq0Aeg+hhcPE/vx3ebPsCgYEAy/Pv\neDLssOSdeyIxf0Brtocg6aPXIVaLdus+bXmLg77rJIFytAZmTTW8SkkSczWtucI3\nFI1I6sei/8FdPzAl62/JDdlf7Wd9K7JIotY4TzT7Tm7QU7xpfLLYIP1bOFjN81rk\n77oOD4LsXcosB/U6s1blPJMZ6AlO2EKs10UuR1cCgYBipzuJ2ADEaOz9RLWwi0AH\nPza2Sj+c2epQD9ZivD7Zo/Sid3ZwvGeGF13JyR7kLEdmAkgsHUdu1rI7mAolXMaB\n1pdrsHureeLxGbRM6za3tzMXWv1Il7FQWoPC8ZwXvMOR1VQDv4nzq7vbbA8z8c+c\n57+8tALQHOTDOgQIzwK61QKBgERGVc0EJy4Uag+VY8J4m1ZQKBluqo7TfP6DQ7O8\nM5MX73maB/7yAX8pVO39RjrhJlYACRZNMbK+v/ckEQYdJSSKmGCVe0JrGYDuPtic\nI9+IGfSorf7KHPoMmMN6bPYQ7Gjh7a++tgRFTMEc8956Hnt4xGahy9NcglNtBpVN\n6G8jAoGBAMCh028pdzJa/xeBHLLaVB2sc0Fe7993WlsPmnVE779dAz7qMscOtXJK\nfgtriltLSSD6rTA9hUAsL/X62rY0wdXuNdijjBb/qvrx7CAV6i37NK1CjABNjsfG\nZM372Ac6zc1EqSrid2IjET1YqyIW2KGLI1R2xbQc98UGlt48OdWu\n-----END RSA PRIVATE KEY-----\n"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`AppManifestsConversions404ErrorException`](../../doc/models/app-manifests-conversions-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`AppManifestsConversions422ErrorException`](../../doc/models/app-manifests-conversions-422-error-exception.md) |


# Apps Get-Webhook-Config-for-App

Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-a-webhook-configuration-for-an-app](https://docs.github.com/rest/reference/apps#get-a-webhook-configuration-for-an-app)

```java
CompletableFuture<AppHookConfigRequest> appsGetWebhookConfigForAppAsync()
```

## Response Type

[`AppHookConfigRequest`](../../doc/models/app-hook-config-request.md)

## Example Usage

```java
appsController.appsGetWebhookConfigForAppAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "content_type": "json",
  "insecure_ssl": "0",
  "secret": "********",
  "url": "https://example.com/webhook"
}
```


# Apps Update-Webhook-Config-for-App

Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#update-a-webhook-configuration-for-an-app](https://docs.github.com/rest/reference/apps#update-a-webhook-configuration-for-an-app)

```java
CompletableFuture<AppHookConfigRequest> appsUpdateWebhookConfigForAppAsync(
    final AppHookConfigRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AppHookConfigRequest`](../../doc/models/app-hook-config-request.md) | Body, Required | - |

## Response Type

[`AppHookConfigRequest`](../../doc/models/app-hook-config-request.md)

## Example Usage

```java
AppHookConfigRequest body = new AppHookConfigRequest();
body.setUrl("https://example.com/webhook");
body.setContentType("json");
body.setSecret("********");
body.setInsecureSsl(com.github.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));

appsController.appsUpdateWebhookConfigForAppAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "content_type": "json",
  "insecure_ssl": "0",
  "secret": "********",
  "url": "https://example.com/webhook"
}
```


# Apps List-Webhook-Deliveries

Returns a list of webhook deliveries for the webhook configured for a GitHub App.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#list-deliveries-for-an-app-webhook](https://docs.github.com/rest/reference/apps#list-deliveries-for-an-app-webhook)

```java
CompletableFuture<List<Simplewebhookdelivery>> appsListWebhookDeliveriesAsync(
    final Integer perPage,
    final String cursor,
    final Boolean redelivery)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `cursor` | `String` | Query, Optional | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors. |
| `redelivery` | `Boolean` | Query, Optional | - |

## Response Type

[`List<Simplewebhookdelivery>`](../../doc/models/simplewebhookdelivery.md)

## Example Usage

```java
Integer perPage = 30;

appsController.appsListWebhookDeliveriesAsync(perPage, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 12345678,
    "guid": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
    "delivered_at": "2019-06-03T00:57:16Z",
    "redelivery": false,
    "duration": 0.27,
    "status": "OK",
    "status_code": 200,
    "event": "issues",
    "action": "opened",
    "installation_id": 123,
    "repository_id": 456
  },
  {
    "id": 123456789,
    "guid": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
    "delivered_at": "2019-06-04T00:57:16Z",
    "redelivery": true,
    "duration": 0.28,
    "status": "OK",
    "status_code": 200,
    "event": "issues",
    "action": "opened",
    "installation_id": 123,
    "repository_id": 456
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`AppHookDeliveries400ErrorException`](../../doc/models/app-hook-deliveries-400-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`AppHookDeliveries422ErrorException`](../../doc/models/app-hook-deliveries-422-error-exception.md) |


# Apps Get-Webhook-Delivery

Returns a delivery for the webhook configured for a GitHub App.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-a-delivery-for-an-app-webhook](https://docs.github.com/rest/reference/apps#get-a-delivery-for-an-app-webhook)

```java
CompletableFuture<AppHookDeliveriesResponse1> appsGetWebhookDeliveryAsync(
    final int deliveryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `deliveryId` | `int` | Template, Required | - |

## Response Type

[`AppHookDeliveriesResponse1`](../../doc/models/app-hook-deliveries-response-1.md)

## Example Usage

```java
int deliveryId = 248;

appsController.appsGetWebhookDeliveryAsync(deliveryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 12345678,
  "guid": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
  "delivered_at": "2019-06-03T00:57:16Z",
  "redelivery": false,
  "duration": 0.27,
  "status": "OK",
  "status_code": 200,
  "event": "issues",
  "action": "opened",
  "installation_id": 123,
  "repository_id": 456,
  "url": "https://www.example.com",
  "request": {
    "headers": {
      "X-GitHub-Delivery": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
      "X-Hub-Signature-256": "sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e",
      "Accept": "*/*",
      "X-GitHub-Hook-ID": "42",
      "User-Agent": "GitHub-Hookshot/b8c71d8",
      "X-GitHub-Event": "issues",
      "X-GitHub-Hook-Installation-Target-ID": "123",
      "X-GitHub-Hook-Installation-Target-Type": "repository",
      "content-type": "application/json",
      "X-Hub-Signature": "sha1=a84d88e7554fc1fa21bcbc4efae3c782a70d2b9d"
    },
    "payload": {
      "action": "opened",
      "issue": {
        "body": "foo"
      },
      "repository": {
        "id": 123
      }
    }
  },
  "response": {
    "headers": {
      "Content-Type": "text/html;charset=utf-8"
    },
    "payload": "ok"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`AppHookDeliveries400ErrorException`](../../doc/models/app-hook-deliveries-400-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`AppHookDeliveries422ErrorException`](../../doc/models/app-hook-deliveries-422-error-exception.md) |


# Apps Redeliver-Webhook-Delivery

Redeliver a delivery for the webhook configured for a GitHub App.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#redeliver-a-delivery-for-an-app-webhook](https://docs.github.com/rest/reference/apps#redeliver-a-delivery-for-an-app-webhook)

```java
CompletableFuture<Object> appsRedeliverWebhookDeliveryAsync(
    final int deliveryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `deliveryId` | `int` | Template, Required | - |

## Response Type

`Object`

## Example Usage

```java
int deliveryId = 248;

appsController.appsRedeliverWebhookDeliveryAsync(deliveryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`AppHookDeliveriesAttempts400ErrorException`](../../doc/models/app-hook-deliveries-attempts-400-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`AppHookDeliveriesAttempts422ErrorException`](../../doc/models/app-hook-deliveries-attempts-422-error-exception.md) |


# Apps List-Installations

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

The permissions the installation has are included under the `permissions` key.

API method documentation: [https://docs.github.com/rest/reference/apps#list-installations-for-the-authenticated-app](https://docs.github.com/rest/reference/apps#list-installations-for-the-authenticated-app)

```java
CompletableFuture<List<Installation>> appsListInstallationsAsync(
    final Integer perPage,
    final Integer page,
    final LocalDateTime since,
    final String outdated)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `outdated` | `String` | Query, Optional | - |

## Response Type

[`List<Installation>`](../../doc/models/installation.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

appsController.appsListInstallationsAsync(perPage, page, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 1,
    "account": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
    "repositories_url": "https://api.github.com/installation/repositories",
    "html_url": "https://github.com/organizations/github/settings/installations/1",
    "app_id": 1,
    "target_id": 1,
    "target_type": "Organization",
    "permissions": {
      "checks": "write",
      "metadata": "read",
      "contents": "read"
    },
    "events": [
      "push",
      "pull_request"
    ],
    "single_file_name": "config.yaml",
    "has_multiple_single_files": true,
    "single_file_paths": [
      "config.yml",
      ".github/issue_TEMPLATE.md"
    ],
    "repository_selection": "selected",
    "created_at": "2017-07-08T16:18:44-04:00",
    "updated_at": "2017-07-08T16:18:44-04:00",
    "app_slug": "github-actions",
    "suspended_at": null,
    "suspended_by": null
  }
]
```


# Apps Get-Installation

Enables an authenticated GitHub App to find an installation's information using the installation id.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-an-installation-for-the-authenticated-app](https://docs.github.com/rest/reference/apps#get-an-installation-for-the-authenticated-app)

```java
CompletableFuture<AppInstallationsResponse> appsGetInstallationAsync(
    final int installationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |

## Response Type

[`AppInstallationsResponse`](../../doc/models/app-installations-response.md)

## Example Usage

```java
int installationId = 1;

appsController.appsGetInstallationAsync(installationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "account": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  },
  "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
  "repositories_url": "https://api.github.com/installation/repositories",
  "html_url": "https://github.com/organizations/github/settings/installations/1",
  "app_id": 1,
  "target_id": 1,
  "target_type": "Organization",
  "permissions": {
    "checks": "write",
    "metadata": "read",
    "contents": "read"
  },
  "events": [
    "push",
    "pull_request"
  ],
  "single_file_name": "config.yaml",
  "has_multiple_single_files": true,
  "single_file_paths": [
    "config.yml",
    ".github/issue_TEMPLATE.md"
  ],
  "repository_selection": "selected",
  "created_at": "2017-07-08T16:18:44-04:00",
  "updated_at": "2017-07-08T16:18:44-04:00",
  "app_slug": "github-actions",
  "suspended_at": null,
  "suspended_by": null
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`AppInstallations404ErrorException`](../../doc/models/app-installations-404-error-exception.md) |


# Apps Delete-Installation

Uninstalls a GitHub App on a user, organization, or business account. If you prefer to temporarily suspend an app's access to your account's resources, then we recommend the "[Suspend an app installation](https://docs.github.com/rest/reference/apps/#suspend-an-app-installation)" endpoint.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#delete-an-installation-for-the-authenticated-app](https://docs.github.com/rest/reference/apps#delete-an-installation-for-the-authenticated-app)

```java
CompletableFuture<Void> appsDeleteInstallationAsync(
    final int installationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |

## Response Type

`void`

## Example Usage

```java
int installationId = 1;

appsController.appsDeleteInstallationAsync(installationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`AppInstallations404ErrorException`](../../doc/models/app-installations-404-error-exception.md) |


# Apps Create-Installation-Access-Token

Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps/#create-an-installation-access-token-for-an-app](https://docs.github.com/rest/reference/apps/#create-an-installation-access-token-for-an-app)

```java
CompletableFuture<AppInstallationsAccessTokensResponse> appsCreateInstallationAccessTokenAsync(
    final int installationId,
    final AppInstallationsAccessTokensRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |
| `body` | [`AppInstallationsAccessTokensRequest`](../../doc/models/app-installations-access-tokens-request.md) | Body, Optional | - |

## Response Type

[`AppInstallationsAccessTokensResponse`](../../doc/models/app-installations-access-tokens-response.md)

## Example Usage

```java
int installationId = 1;
AppInstallationsAccessTokensRequest body = new AppInstallationsAccessTokensRequest();
Permissions3 permissions = new Permissions3();
permissions.setContents(ContentsEnum.READ);
permissions.setIssues(IssuesEnum.WRITE);

body.setPermissions(permissions);

appsController.appsCreateInstallationAccessTokenAsync(installationId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "ghs_16C7e42F292c6912E7710c838347Ae178B4a",
  "expires_at": "2016-07-11T22:14:10Z",
  "permissions": {
    "issues": "write",
    "contents": "read"
  },
  "repository_selection": "selected",
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World",
      "homepage": "https://github.com",
      "language": null,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues_count": 0,
      "is_template": true,
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "allow_rebase_merge": true,
      "template_repository": null,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://github.com/licenses/mit"
      },
      "forks": 1,
      "open_issues": 1,
      "watchers": 1
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`AppInstallationsAccessTokens401ErrorException`](../../doc/models/app-installations-access-tokens-401-error-exception.md) |
| 403 | Forbidden | [`AppInstallationsAccessTokens403ErrorException`](../../doc/models/app-installations-access-tokens-403-error-exception.md) |
| 404 | Resource not found | [`AppInstallationsAccessTokens404ErrorException`](../../doc/models/app-installations-access-tokens-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`AppInstallationsAccessTokens422ErrorException`](../../doc/models/app-installations-access-tokens-422-error-exception.md) |


# Apps Suspend-Installation

Suspends a GitHub App on a user, organization, or business account, which blocks the app from accessing the account's resources. When a GitHub App is suspended, the app's access to the GitHub API or webhook events is blocked for that account.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#suspend-an-app-installation](https://docs.github.com/rest/reference/apps#suspend-an-app-installation)

```java
CompletableFuture<Void> appsSuspendInstallationAsync(
    final int installationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |

## Response Type

`void`

## Example Usage

```java
int installationId = 1;

appsController.appsSuspendInstallationAsync(installationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`AppInstallationsSuspended404ErrorException`](../../doc/models/app-installations-suspended-404-error-exception.md) |


# Apps Unsuspend-Installation

Removes a GitHub App installation suspension.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#unsuspend-an-app-installation](https://docs.github.com/rest/reference/apps#unsuspend-an-app-installation)

```java
CompletableFuture<Void> appsUnsuspendInstallationAsync(
    final int installationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |

## Response Type

`void`

## Example Usage

```java
int installationId = 1;

appsController.appsUnsuspendInstallationAsync(installationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`AppInstallationsSuspended404ErrorException`](../../doc/models/app-installations-suspended-404-error-exception.md) |


# Apps Delete-Authorization

OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).

API method documentation: [https://docs.github.com/rest/reference/apps#delete-an-app-authorization](https://docs.github.com/rest/reference/apps#delete-an-app-authorization)

```java
CompletableFuture<Void> appsDeleteAuthorizationAsync(
    final String clientId,
    final ContentType3Enum contentType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientId` | `String` | Template, Required | The client ID of the GitHub app. |
| `contentType` | [`ContentType3Enum`](../../doc/models/content-type-3-enum.md) | Header, Required | - |

## Response Type

`void`

## Example Usage

```java
String clientId = "Iv1.8a61f9b3a7aba766";
ContentType3Enum contentType = ContentType3Enum.ENUM_APPLICATIONJSON;

appsController.appsDeleteAuthorizationAsync(clientId, contentType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ApplicationsGrant422ErrorException`](../../doc/models/applications-grant-422-error-exception.md) |


# Apps Check-Token

OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) to use this endpoint, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.

API method documentation: [https://docs.github.com/rest/reference/apps#check-a-token](https://docs.github.com/rest/reference/apps#check-a-token)

```java
CompletableFuture<ApplicationsTokenResponse> appsCheckTokenAsync(
    final String clientId,
    final ApplicationsTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientId` | `String` | Template, Required | The client ID of the GitHub app. |
| `body` | [`ApplicationsTokenRequest`](../../doc/models/applications-token-request.md) | Body, Required | - |

## Response Type

[`ApplicationsTokenResponse`](../../doc/models/applications-token-response.md)

## Example Usage

```java
String clientId = "Iv1.8a61f9b3a7aba766";
ApplicationsTokenRequest body = new ApplicationsTokenRequest();
body.setAccessToken("e72e16c7e42f292c6912e7710c838347ae178b4a");

appsController.appsCheckTokenAsync(clientId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "url": "https://api.github.com/authorizations/1",
  "scopes": [
    "public_repo",
    "user"
  ],
  "token": "ghu_16C7e42F292c6912E7710c838347Ae178B4a",
  "token_last_eight": "Ae178B4a",
  "hashed_token": "25f94a2a5c7fbaf499c665bc73d67c1c87e496da8985131633ee0a95819db2e8",
  "app": {
    "url": "http://my-github-app.com",
    "name": "my github app",
    "client_id": "Iv1.8a61f9b3a7aba766"
  },
  "note": "optional note",
  "note_url": "http://optional/note/url",
  "updated_at": "2011-09-06T20:39:23Z",
  "created_at": "2011-09-06T17:26:27Z",
  "fingerprint": "jklmnop12345678",
  "expires_at": "2011-09-08T17:26:27Z",
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ApplicationsToken404ErrorException`](../../doc/models/applications-token-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ApplicationsToken422ErrorException`](../../doc/models/applications-token-422-error-exception.md) |


# Apps Reset-Token

OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the "token" property in the response because changes take effect immediately. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.

API method documentation: [https://docs.github.com/rest/reference/apps#reset-a-token](https://docs.github.com/rest/reference/apps#reset-a-token)

```java
CompletableFuture<ApplicationsTokenResponse> appsResetTokenAsync(
    final String clientId,
    final ApplicationsTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientId` | `String` | Template, Required | The client ID of the GitHub app. |
| `body` | [`ApplicationsTokenRequest`](../../doc/models/applications-token-request.md) | Body, Required | - |

## Response Type

[`ApplicationsTokenResponse`](../../doc/models/applications-token-response.md)

## Example Usage

```java
String clientId = "Iv1.8a61f9b3a7aba766";
ApplicationsTokenRequest body = new ApplicationsTokenRequest();
body.setAccessToken("e72e16c7e42f292c6912e7710c838347ae178b4a");

appsController.appsResetTokenAsync(clientId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "url": "https://api.github.com/authorizations/1",
  "scopes": [
    "public_repo",
    "user"
  ],
  "token": "ghu_16C7e42F292c6912E7710c838347Ae178B4a",
  "token_last_eight": "Ae178B4a",
  "hashed_token": "25f94a2a5c7fbaf499c665bc73d67c1c87e496da8985131633ee0a95819db2e8",
  "app": {
    "url": "http://my-github-app.com",
    "name": "my github app",
    "client_id": "Iv1.8a61f9b3a7aba766"
  },
  "note": "optional note",
  "note_url": "http://optional/note/url",
  "updated_at": "2011-09-06T20:39:23Z",
  "created_at": "2011-09-06T17:26:27Z",
  "fingerprint": "jklmnop12345678",
  "expires_at": "2011-09-08T17:26:27Z",
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ApplicationsToken422ErrorException`](../../doc/models/applications-token-422-error-exception.md) |


# Apps Delete-Token

OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password.

API method documentation: [https://docs.github.com/rest/reference/apps#delete-an-app-token](https://docs.github.com/rest/reference/apps#delete-an-app-token)

```java
CompletableFuture<Void> appsDeleteTokenAsync(
    final String clientId,
    final ContentType3Enum contentType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientId` | `String` | Template, Required | The client ID of the GitHub app. |
| `contentType` | [`ContentType3Enum`](../../doc/models/content-type-3-enum.md) | Header, Required | - |

## Response Type

`void`

## Example Usage

```java
String clientId = "Iv1.8a61f9b3a7aba766";
ContentType3Enum contentType = ContentType3Enum.ENUM_APPLICATIONJSON;

appsController.appsDeleteTokenAsync(clientId, contentType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ApplicationsToken422ErrorException`](../../doc/models/applications-token-422-error-exception.md) |


# Apps Scope-Token

Use a non-scoped user-to-server OAuth access token to create a repository scoped and/or permission scoped user-to-server OAuth access token. You can specify which repositories the token can access and which permissions are granted to the token. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.

API method documentation: [https://docs.github.com/rest/reference/apps#create-a-scoped-access-token](https://docs.github.com/rest/reference/apps#create-a-scoped-access-token)

```java
CompletableFuture<ApplicationsTokenScopedResponse> appsScopeTokenAsync(
    final String clientId,
    final ApplicationsTokenScopedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientId` | `String` | Template, Required | The client ID of the GitHub app. |
| `body` | [`ApplicationsTokenScopedRequest`](../../doc/models/applications-token-scoped-request.md) | Body, Required | - |

## Response Type

[`ApplicationsTokenScopedResponse`](../../doc/models/applications-token-scoped-response.md)

## Example Usage

```java
String clientId = "Iv1.8a61f9b3a7aba766";
ApplicationsTokenScopedRequest body = new ApplicationsTokenScopedRequest();
body.setAccessToken("e72e16c7e42f292c6912e7710c838347ae178b4a");
body.setTarget("octocat");
Permissions3 permissions = new Permissions3();
permissions.setContents(ContentsEnum.READ);
permissions.setIssues(IssuesEnum.WRITE);
permissions.setMetadata(MetadataEnum.READ);

body.setPermissions(permissions);

appsController.appsScopeTokenAsync(clientId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "url": "https://api.github.com/authorizations/1",
  "scopes": [],
  "token": "ghu_16C7e42F292c6912E7710c838347Ae178B4a",
  "token_last_eight": "Ae178B4a",
  "hashed_token": "25f94a2a5c7fbaf499c665bc73d67c1c87e496da8985131633ee0a95819db2e8",
  "app": {
    "url": "http://my-github-app.com",
    "name": "my github app",
    "client_id": "Iv1.8a61f9b3a7aba766"
  },
  "note": "optional note",
  "note_url": "http://optional/note/url",
  "updated_at": "2011-09-06T20:39:23Z",
  "created_at": "2011-09-06T17:26:27Z",
  "fingerprint": "jklmnop12345678",
  "expires_at": "2011-09-08T17:26:27Z",
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  },
  "installation": {
    "permissions": {
      "metadata": "read",
      "issues": "write",
      "contents": "read"
    },
    "repository_selection": "selected",
    "single_file_name": ".github/workflow.yml",
    "repositories_url": "https://api.github.com/user/repos",
    "account": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "has_multiple_single_files": false,
    "single_file_paths": []
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ApplicationsTokenScoped401ErrorException`](../../doc/models/applications-token-scoped-401-error-exception.md) |
| 403 | Forbidden | [`ApplicationsTokenScoped403ErrorException`](../../doc/models/applications-token-scoped-403-error-exception.md) |
| 404 | Resource not found | [`ApplicationsTokenScoped404ErrorException`](../../doc/models/applications-token-scoped-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ApplicationsTokenScoped422ErrorException`](../../doc/models/applications-token-scoped-422-error-exception.md) |


# Apps Get-by-Slug

**Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).

If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps/#get-an-app](https://docs.github.com/rest/reference/apps/#get-an-app)

```java
CompletableFuture<AppsResponse> appsGetBySlugAsync(
    final String appSlug)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `appSlug` | `String` | Template, Required | - |

## Response Type

[`AppsResponse`](../../doc/models/apps-response.md)

## Example Usage

```java
String appSlug = "app_slug8";

appsController.appsGetBySlugAsync(appSlug).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "slug": "octoapp",
  "node_id": "MDExOkludGVncmF0aW9uMQ==",
  "owner": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": true
  },
  "name": "Octocat App",
  "description": "",
  "external_url": "https://example.com",
  "html_url": "https://github.com/apps/octoapp",
  "created_at": "2017-07-08T16:18:44-04:00",
  "updated_at": "2017-07-08T16:18:44-04:00",
  "permissions": {
    "metadata": "read",
    "contents": "read",
    "issues": "write",
    "single_file": "write"
  },
  "events": [
    "push",
    "pull_request"
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Apps403ErrorException`](../../doc/models/apps-403-error-exception.md) |
| 404 | Resource not found | [`Apps404ErrorException`](../../doc/models/apps-404-error-exception.md) |


# Apps List-Repos-Accessible-to-Installation

List repositories that an app installation can access.

You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#list-repositories-accessible-to-the-app-installation](https://docs.github.com/rest/reference/apps#list-repositories-accessible-to-the-app-installation)

```java
CompletableFuture<InstallationRepositoriesResponse> appsListReposAccessibleToInstallationAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`InstallationRepositoriesResponse`](../../doc/models/installation-repositories-response.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

appsController.appsListReposAccessibleToInstallationAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World",
      "homepage": "https://github.com",
      "language": null,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues_count": 0,
      "is_template": true,
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "allow_rebase_merge": true,
      "template_repository": null,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://github.com/licenses/mit"
      },
      "forks": 1,
      "open_issues": 1,
      "watchers": 1
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`InstallationRepositories401ErrorException`](../../doc/models/installation-repositories-401-error-exception.md) |
| 403 | Forbidden | [`InstallationRepositories403ErrorException`](../../doc/models/installation-repositories-403-error-exception.md) |


# Apps Revoke-Installation-Access-Token

Revokes the installation token you're using to authenticate as an installation and access this endpoint.

Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the "[Create an installation access token for an app](https://docs.github.com/rest/reference/apps#create-an-installation-access-token-for-an-app)" endpoint.

You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#revoke-an-installation-access-token](https://docs.github.com/rest/reference/apps#revoke-an-installation-access-token)

```java
CompletableFuture<Void> appsRevokeInstallationAccessTokenAsync()
```

## Response Type

`void`

## Example Usage

```java
appsController.appsRevokeInstallationAccessTokenAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Apps Get-Subscription-Plan-for-Account

Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.

GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-a-subscription-plan-for-an-account](https://docs.github.com/rest/reference/apps#get-a-subscription-plan-for-an-account)

```java
CompletableFuture<MarketplaceListingAccountsResponse> appsGetSubscriptionPlanForAccountAsync(
    final int accountId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `int` | Template, Required | account_id parameter |

## Response Type

[`MarketplaceListingAccountsResponse`](../../doc/models/marketplace-listing-accounts-response.md)

## Example Usage

```java
int accountId = 20;

appsController.appsGetSubscriptionPlanForAccountAsync(accountId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/orgs/github",
  "type": "Organization",
  "id": 4,
  "login": "github",
  "organization_billing_email": "billing@github.com",
  "email": "billing@github.com",
  "marketplace_pending_change": {
    "effective_date": "2017-11-11T00:00:00Z",
    "unit_count": null,
    "id": 77,
    "plan": {
      "url": "https://api.github.com/marketplace_listing/plans/1111",
      "accounts_url": "https://api.github.com/marketplace_listing/plans/1111/accounts",
      "id": 1111,
      "number": 2,
      "name": "Startup",
      "description": "A professional-grade CI solution",
      "monthly_price_in_cents": 699,
      "yearly_price_in_cents": 7870,
      "price_model": "FLAT_RATE",
      "has_free_trial": true,
      "state": "published",
      "unit_name": null,
      "bullets": [
        "Up to 10 private repositories",
        "3 concurrent builds"
      ]
    }
  },
  "marketplace_purchase": {
    "billing_cycle": "monthly",
    "next_billing_date": "2017-11-11T00:00:00Z",
    "unit_count": null,
    "on_free_trial": true,
    "free_trial_ends_on": "2017-11-11T00:00:00Z",
    "updated_at": "2017-11-02T01:12:12Z",
    "plan": {
      "url": "https://api.github.com/marketplace_listing/plans/1313",
      "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
      "id": 1313,
      "number": 3,
      "name": "Pro",
      "description": "A professional-grade CI solution",
      "monthly_price_in_cents": 1099,
      "yearly_price_in_cents": 11870,
      "price_model": "FLAT_RATE",
      "has_free_trial": true,
      "unit_name": null,
      "state": "published",
      "bullets": [
        "Up to 25 private repositories",
        "11 concurrent builds"
      ]
    }
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`MarketplaceListingAccounts401ErrorException`](../../doc/models/marketplace-listing-accounts-401-error-exception.md) |
| 404 | Not Found when the account has not purchased the listing | [`MarketplaceListingAccounts404ErrorException`](../../doc/models/marketplace-listing-accounts-404-error-exception.md) |


# Apps List-Plans

Lists all plans that are part of your GitHub Marketplace listing.

GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#list-plans](https://docs.github.com/rest/reference/apps#list-plans)

```java
CompletableFuture<List<MarketplaceListingPlan>> appsListPlansAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MarketplaceListingPlan>`](../../doc/models/marketplace-listing-plan.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

appsController.appsListPlansAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "url": "https://api.github.com/marketplace_listing/plans/1313",
    "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
    "id": 1313,
    "number": 3,
    "name": "Pro",
    "description": "A professional-grade CI solution",
    "monthly_price_in_cents": 1099,
    "yearly_price_in_cents": 11870,
    "price_model": "FLAT_RATE",
    "has_free_trial": true,
    "unit_name": null,
    "state": "published",
    "bullets": [
      "Up to 25 private repositories",
      "11 concurrent builds"
    ]
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`MarketplaceListingPlans401ErrorException`](../../doc/models/marketplace-listing-plans-401-error-exception.md) |
| 404 | Resource not found | [`MarketplaceListingPlans404ErrorException`](../../doc/models/marketplace-listing-plans-404-error-exception.md) |


# Apps List-Accounts-for-Plan

Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.

GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#list-accounts-for-a-plan](https://docs.github.com/rest/reference/apps#list-accounts-for-a-plan)

```java
CompletableFuture<List<MarketplacePurchase>> appsListAccountsForPlanAsync(
    final int planId,
    final Sort1Enum sort,
    final Direction4Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `int` | Template, Required | The unique identifier of the plan. |
| `sort` | [`Sort1Enum`](../../doc/models/sort-1-enum.md) | Query, Optional | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. |
| `direction` | [`Direction4Enum`](../../doc/models/direction-4-enum.md) | Query, Optional | To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MarketplacePurchase>`](../../doc/models/marketplace-purchase.md)

## Example Usage

```java
int planId = 64;
Integer perPage = 30;
Integer page = 1;

appsController.appsListAccountsForPlanAsync(planId, null, null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "url": "https://api.github.com/orgs/github",
    "type": "Organization",
    "id": 4,
    "login": "github",
    "organization_billing_email": "billing@github.com",
    "marketplace_pending_change": {
      "effective_date": "2017-11-11T00:00:00Z",
      "unit_count": null,
      "id": 77,
      "plan": {
        "url": "https://api.github.com/marketplace_listing/plans/1111",
        "accounts_url": "https://api.github.com/marketplace_listing/plans/1111/accounts",
        "id": 1111,
        "number": 2,
        "name": "Startup",
        "description": "A professional-grade CI solution",
        "monthly_price_in_cents": 699,
        "yearly_price_in_cents": 7870,
        "price_model": "FLAT_RATE",
        "has_free_trial": true,
        "state": "published",
        "unit_name": null,
        "bullets": [
          "Up to 10 private repositories",
          "3 concurrent builds"
        ]
      }
    },
    "marketplace_purchase": {
      "billing_cycle": "monthly",
      "next_billing_date": "2017-11-11T00:00:00Z",
      "unit_count": null,
      "on_free_trial": true,
      "free_trial_ends_on": "2017-11-11T00:00:00Z",
      "updated_at": "2017-11-02T01:12:12Z",
      "plan": {
        "url": "https://api.github.com/marketplace_listing/plans/1313",
        "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
        "id": 1313,
        "number": 3,
        "name": "Pro",
        "description": "A professional-grade CI solution",
        "monthly_price_in_cents": 1099,
        "yearly_price_in_cents": 11870,
        "price_model": "FLAT_RATE",
        "has_free_trial": true,
        "unit_name": null,
        "state": "published",
        "bullets": [
          "Up to 25 private repositories",
          "11 concurrent builds"
        ]
      }
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`MarketplaceListingPlansAccounts401ErrorException`](../../doc/models/marketplace-listing-plans-accounts-401-error-exception.md) |
| 404 | Resource not found | [`MarketplaceListingPlansAccounts404ErrorException`](../../doc/models/marketplace-listing-plans-accounts-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`MarketplaceListingPlansAccounts422ErrorException`](../../doc/models/marketplace-listing-plans-accounts-422-error-exception.md) |


# Apps Get-Subscription-Plan-for-Account-Stubbed

Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.

GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-a-subscription-plan-for-an-account-stubbed](https://docs.github.com/rest/reference/apps#get-a-subscription-plan-for-an-account-stubbed)

```java
CompletableFuture<MarketplaceListingStubbedAccountsResponse> appsGetSubscriptionPlanForAccountStubbedAsync(
    final int accountId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `int` | Template, Required | account_id parameter |

## Response Type

[`MarketplaceListingStubbedAccountsResponse`](../../doc/models/marketplace-listing-stubbed-accounts-response.md)

## Example Usage

```java
int accountId = 20;

appsController.appsGetSubscriptionPlanForAccountStubbedAsync(accountId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/orgs/github",
  "type": "Organization",
  "id": 4,
  "login": "github",
  "organization_billing_email": "billing@github.com",
  "email": "billing@github.com",
  "marketplace_pending_change": {
    "effective_date": "2017-11-11T00:00:00Z",
    "unit_count": null,
    "id": 77,
    "plan": {
      "url": "https://api.github.com/marketplace_listing/plans/1111",
      "accounts_url": "https://api.github.com/marketplace_listing/plans/1111/accounts",
      "id": 1111,
      "number": 2,
      "name": "Startup",
      "description": "A professional-grade CI solution",
      "monthly_price_in_cents": 699,
      "yearly_price_in_cents": 7870,
      "price_model": "FLAT_RATE",
      "has_free_trial": true,
      "state": "published",
      "unit_name": null,
      "bullets": [
        "Up to 10 private repositories",
        "3 concurrent builds"
      ]
    }
  },
  "marketplace_purchase": {
    "billing_cycle": "monthly",
    "next_billing_date": "2017-11-11T00:00:00Z",
    "unit_count": null,
    "on_free_trial": true,
    "free_trial_ends_on": "2017-11-11T00:00:00Z",
    "updated_at": "2017-11-02T01:12:12Z",
    "plan": {
      "url": "https://api.github.com/marketplace_listing/plans/1313",
      "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
      "id": 1313,
      "number": 3,
      "name": "Pro",
      "description": "A professional-grade CI solution",
      "monthly_price_in_cents": 1099,
      "yearly_price_in_cents": 11870,
      "price_model": "FLAT_RATE",
      "has_free_trial": true,
      "unit_name": null,
      "state": "published",
      "bullets": [
        "Up to 25 private repositories",
        "11 concurrent builds"
      ]
    }
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`MarketplaceListingStubbedAccounts401ErrorException`](../../doc/models/marketplace-listing-stubbed-accounts-401-error-exception.md) |
| 404 | Not Found when the account has not purchased the listing | `ApiException` |


# Apps List-Plans-Stubbed

Lists all plans that are part of your GitHub Marketplace listing.

GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#list-plans-stubbed](https://docs.github.com/rest/reference/apps#list-plans-stubbed)

```java
CompletableFuture<List<MarketplaceListingPlan>> appsListPlansStubbedAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MarketplaceListingPlan>`](../../doc/models/marketplace-listing-plan.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

appsController.appsListPlansStubbedAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "url": "https://api.github.com/marketplace_listing/plans/1313",
    "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
    "id": 1313,
    "number": 3,
    "name": "Pro",
    "description": "A professional-grade CI solution",
    "monthly_price_in_cents": 1099,
    "yearly_price_in_cents": 11870,
    "price_model": "FLAT_RATE",
    "has_free_trial": true,
    "unit_name": null,
    "state": "published",
    "bullets": [
      "Up to 25 private repositories",
      "11 concurrent builds"
    ]
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`MarketplaceListingStubbedPlans401ErrorException`](../../doc/models/marketplace-listing-stubbed-plans-401-error-exception.md) |


# Apps List-Accounts-for-Plan-Stubbed

Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.

GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#list-accounts-for-a-plan-stubbed](https://docs.github.com/rest/reference/apps#list-accounts-for-a-plan-stubbed)

```java
CompletableFuture<List<MarketplacePurchase>> appsListAccountsForPlanStubbedAsync(
    final int planId,
    final Sort1Enum sort,
    final Direction4Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `int` | Template, Required | The unique identifier of the plan. |
| `sort` | [`Sort1Enum`](../../doc/models/sort-1-enum.md) | Query, Optional | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. |
| `direction` | [`Direction4Enum`](../../doc/models/direction-4-enum.md) | Query, Optional | To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MarketplacePurchase>`](../../doc/models/marketplace-purchase.md)

## Example Usage

```java
int planId = 64;
Integer perPage = 30;
Integer page = 1;

appsController.appsListAccountsForPlanStubbedAsync(planId, null, null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "url": "https://api.github.com/orgs/github",
    "type": "Organization",
    "id": 4,
    "login": "github",
    "organization_billing_email": "billing@github.com",
    "marketplace_pending_change": {
      "effective_date": "2017-11-11T00:00:00Z",
      "unit_count": null,
      "id": 77,
      "plan": {
        "url": "https://api.github.com/marketplace_listing/plans/1111",
        "accounts_url": "https://api.github.com/marketplace_listing/plans/1111/accounts",
        "id": 1111,
        "number": 2,
        "name": "Startup",
        "description": "A professional-grade CI solution",
        "monthly_price_in_cents": 699,
        "yearly_price_in_cents": 7870,
        "price_model": "FLAT_RATE",
        "has_free_trial": true,
        "state": "published",
        "unit_name": null,
        "bullets": [
          "Up to 10 private repositories",
          "3 concurrent builds"
        ]
      }
    },
    "marketplace_purchase": {
      "billing_cycle": "monthly",
      "next_billing_date": "2017-11-11T00:00:00Z",
      "unit_count": null,
      "on_free_trial": true,
      "free_trial_ends_on": "2017-11-11T00:00:00Z",
      "updated_at": "2017-11-02T01:12:12Z",
      "plan": {
        "url": "https://api.github.com/marketplace_listing/plans/1313",
        "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
        "id": 1313,
        "number": 3,
        "name": "Pro",
        "description": "A professional-grade CI solution",
        "monthly_price_in_cents": 1099,
        "yearly_price_in_cents": 11870,
        "price_model": "FLAT_RATE",
        "has_free_trial": true,
        "unit_name": null,
        "state": "published",
        "bullets": [
          "Up to 25 private repositories",
          "11 concurrent builds"
        ]
      }
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`MarketplaceListingStubbedPlansAccounts401ErrorException`](../../doc/models/marketplace-listing-stubbed-plans-accounts-401-error-exception.md) |


# Apps Get-Org-Installation

Enables an authenticated GitHub App to find the organization's installation information.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-an-organization-installation-for-the-authenticated-app](https://docs.github.com/rest/reference/apps#get-an-organization-installation-for-the-authenticated-app)

```java
CompletableFuture<OrgsInstallationResponse> appsGetOrgInstallationAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsInstallationResponse`](../../doc/models/orgs-installation-response.md)

## Example Usage

```java
String org = "org6";

appsController.appsGetOrgInstallationAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "account": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "avatar_url": "https://github.com/images/error/hubot_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/orgs/github",
    "html_url": "https://github.com/github",
    "followers_url": "https://api.github.com/users/github/followers",
    "following_url": "https://api.github.com/users/github/following{/other_user}",
    "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/github/subscriptions",
    "organizations_url": "https://api.github.com/users/github/orgs",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "received_events_url": "https://api.github.com/users/github/received_events",
    "type": "Organization",
    "site_admin": false
  },
  "repository_selection": "all",
  "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
  "repositories_url": "https://api.github.com/installation/repositories",
  "html_url": "https://github.com/organizations/github/settings/installations/1",
  "app_id": 1,
  "target_id": 1,
  "target_type": "Organization",
  "permissions": {
    "checks": "write",
    "metadata": "read",
    "contents": "read"
  },
  "events": [
    "push",
    "pull_request"
  ],
  "created_at": "2018-02-09T20:51:14Z",
  "updated_at": "2018-02-09T20:51:14Z",
  "single_file_name": "config.yml",
  "has_multiple_single_files": true,
  "single_file_paths": [
    "config.yml",
    ".github/issue_TEMPLATE.md"
  ],
  "app_slug": "github-actions",
  "suspended_at": null,
  "suspended_by": null
}
```


# Apps Get-Repo-Installation

Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-a-repository-installation-for-the-authenticated-app](https://docs.github.com/rest/reference/apps#get-a-repository-installation-for-the-authenticated-app)

```java
CompletableFuture<ReposInstallationResponse> appsGetRepoInstallationAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposInstallationResponse`](../../doc/models/repos-installation-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

appsController.appsGetRepoInstallationAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "account": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "avatar_url": "https://github.com/images/error/hubot_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/orgs/github",
    "html_url": "https://github.com/github",
    "followers_url": "https://api.github.com/users/github/followers",
    "following_url": "https://api.github.com/users/github/following{/other_user}",
    "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/github/subscriptions",
    "organizations_url": "https://api.github.com/users/github/orgs",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "received_events_url": "https://api.github.com/users/github/received_events",
    "type": "Organization",
    "site_admin": false
  },
  "repository_selection": "all",
  "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
  "repositories_url": "https://api.github.com/installation/repositories",
  "html_url": "https://github.com/organizations/github/settings/installations/1",
  "app_id": 1,
  "target_id": 1,
  "target_type": "Organization",
  "permissions": {
    "checks": "write",
    "metadata": "read",
    "contents": "read"
  },
  "events": [
    "push",
    "pull_request"
  ],
  "created_at": "2018-02-09T20:51:14Z",
  "updated_at": "2018-02-09T20:51:14Z",
  "single_file_name": "config.yml",
  "has_multiple_single_files": true,
  "single_file_paths": [
    "config.yml",
    ".github/issue_TEMPLATE.md"
  ],
  "app_slug": "github-actions",
  "suspended_at": null,
  "suspended_by": null
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposInstallation404ErrorException`](../../doc/models/repos-installation-404-error-exception.md) |


# Apps List-Installations-for-Authenticated-User

Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.

You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.

The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.

You can find the permissions for the installation under the `permissions` key.

API method documentation: [https://docs.github.com/rest/reference/apps#list-app-installations-accessible-to-the-user-access-token](https://docs.github.com/rest/reference/apps#list-app-installations-accessible-to-the-user-access-token)

```java
CompletableFuture<OrgsInstallationsResponse> appsListInstallationsForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsInstallationsResponse`](../../doc/models/orgs-installations-response.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

appsController.appsListInstallationsForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "installations": [
    {
      "id": 1,
      "account": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
      "repositories_url": "https://api.github.com/installation/repositories",
      "html_url": "https://github.com/organizations/github/settings/installations/1",
      "app_id": 1,
      "target_id": 1,
      "target_type": "Organization",
      "permissions": {
        "checks": "write",
        "metadata": "read",
        "contents": "read"
      },
      "events": [
        "push",
        "pull_request"
      ],
      "single_file_name": "config.yaml",
      "has_multiple_single_files": true,
      "single_file_paths": [
        "config.yml",
        ".github/issue_TEMPLATE.md"
      ],
      "repository_selection": "all",
      "created_at": "2017-07-08T16:18:44-04:00",
      "updated_at": "2017-07-08T16:18:44-04:00",
      "app_slug": "github-actions",
      "suspended_at": null,
      "suspended_by": null
    },
    {
      "id": 3,
      "account": {
        "login": "octocat",
        "id": 2,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
      "repositories_url": "https://api.github.com/installation/repositories",
      "html_url": "https://github.com/organizations/github/settings/installations/1",
      "app_id": 1,
      "target_id": 1,
      "target_type": "Organization",
      "permissions": {
        "checks": "write",
        "metadata": "read",
        "contents": "read"
      },
      "events": [
        "push",
        "pull_request"
      ],
      "single_file_name": "config.yaml",
      "has_multiple_single_files": true,
      "single_file_paths": [
        "config.yml",
        ".github/issue_TEMPLATE.md"
      ],
      "repository_selection": "all",
      "created_at": "2017-07-08T16:18:44-04:00",
      "updated_at": "2017-07-08T16:18:44-04:00",
      "app_slug": "github-actions",
      "suspended_at": null,
      "suspended_by": null
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserInstallations401ErrorException`](../../doc/models/user-installations-401-error-exception.md) |
| 403 | Forbidden | [`UserInstallations403ErrorException`](../../doc/models/user-installations-403-error-exception.md) |


# Apps List-Installation-Repos-for-Authenticated-User

List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access for an installation.

The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.

You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.

The access the user has to each repository is included in the hash under the `permissions` key.

API method documentation: [https://docs.github.com/rest/reference/apps#list-repositories-accessible-to-the-user-access-token](https://docs.github.com/rest/reference/apps#list-repositories-accessible-to-the-user-access-token)

```java
CompletableFuture<InstallationRepositoriesResponse> appsListInstallationReposForAuthenticatedUserAsync(
    final int installationId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`InstallationRepositoriesResponse`](../../doc/models/installation-repositories-response.md)

## Example Usage

```java
int installationId = 1;
Integer perPage = 30;
Integer page = 1;

appsController.appsListInstallationReposForAuthenticatedUserAsync(installationId, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World",
      "homepage": "https://github.com",
      "language": null,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues_count": 0,
      "is_template": true,
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "allow_rebase_merge": true,
      "template_repository": null,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://github.com/licenses/mit"
      },
      "forks": 1,
      "open_issues": 1,
      "watchers": 1
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`UserInstallationsRepositories403ErrorException`](../../doc/models/user-installations-repositories-403-error-exception.md) |
| 404 | Resource not found | [`UserInstallationsRepositories404ErrorException`](../../doc/models/user-installations-repositories-404-error-exception.md) |


# Apps Add-Repo-to-Installation-for-Authenticated-User

Add a single repository to an installation. The authenticated user must have admin access to the repository.

You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#add-a-repository-to-an-app-installation](https://docs.github.com/rest/reference/apps#add-a-repository-to-an-app-installation)

```java
CompletableFuture<Void> appsAddRepoToInstallationForAuthenticatedUserAsync(
    final int installationId,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |

## Response Type

`void`

## Example Usage

```java
int installationId = 1;
int repositoryId = 254;

appsController.appsAddRepoToInstallationForAuthenticatedUserAsync(installationId, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`UserInstallationsRepositories403ErrorException`](../../doc/models/user-installations-repositories-403-error-exception.md) |
| 404 | Resource not found | [`UserInstallationsRepositories404ErrorException`](../../doc/models/user-installations-repositories-404-error-exception.md) |


# Apps Remove-Repo-From-Installation-for-Authenticated-User

Remove a single repository from an installation. The authenticated user must have admin access to the repository.

You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#remove-a-repository-from-an-app-installation](https://docs.github.com/rest/reference/apps#remove-a-repository-from-an-app-installation)

```java
CompletableFuture<Void> appsRemoveRepoFromInstallationForAuthenticatedUserAsync(
    final int installationId,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `installationId` | `int` | Template, Required | The unique identifier of the installation. |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |

## Response Type

`void`

## Example Usage

```java
int installationId = 1;
int repositoryId = 254;

appsController.appsRemoveRepoFromInstallationForAuthenticatedUserAsync(installationId, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`UserInstallationsRepositories403ErrorException`](../../doc/models/user-installations-repositories-403-error-exception.md) |
| 404 | Resource not found | [`UserInstallationsRepositories404ErrorException`](../../doc/models/user-installations-repositories-404-error-exception.md) |


# Apps List-Subscriptions-for-Authenticated-User

Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/).

API method documentation: [https://docs.github.com/rest/reference/apps#list-subscriptions-for-the-authenticated-user](https://docs.github.com/rest/reference/apps#list-subscriptions-for-the-authenticated-user)

```java
CompletableFuture<List<UserMarketplacePurchase>> appsListSubscriptionsForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<UserMarketplacePurchase>`](../../doc/models/user-marketplace-purchase.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

appsController.appsListSubscriptionsForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "billing_cycle": "monthly",
    "next_billing_date": "2017-11-11T00:00:00Z",
    "unit_count": null,
    "on_free_trial": true,
    "free_trial_ends_on": "2017-11-11T00:00:00Z",
    "updated_at": "2017-11-02T01:12:12Z",
    "account": {
      "login": "github",
      "id": 4,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "email": null,
      "organization_billing_email": "billing@github.com",
      "type": "Organization"
    },
    "plan": {
      "url": "https://api.github.com/marketplace_listing/plans/1313",
      "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
      "id": 1313,
      "number": 3,
      "name": "Pro",
      "description": "A professional-grade CI solution",
      "monthly_price_in_cents": 1099,
      "yearly_price_in_cents": 11870,
      "price_model": "FLAT_RATE",
      "has_free_trial": true,
      "unit_name": null,
      "state": "published",
      "bullets": [
        "Up to 25 private repositories",
        "11 concurrent builds"
      ]
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMarketplacePurchases401ErrorException`](../../doc/models/user-marketplace-purchases-401-error-exception.md) |
| 404 | Resource not found | [`UserMarketplacePurchases404ErrorException`](../../doc/models/user-marketplace-purchases-404-error-exception.md) |


# Apps List-Subscriptions-for-Authenticated-User-Stubbed

Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/).

API method documentation: [https://docs.github.com/rest/reference/apps#list-subscriptions-for-the-authenticated-user-stubbed](https://docs.github.com/rest/reference/apps#list-subscriptions-for-the-authenticated-user-stubbed)

```java
CompletableFuture<List<UserMarketplacePurchase>> appsListSubscriptionsForAuthenticatedUserStubbedAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<UserMarketplacePurchase>`](../../doc/models/user-marketplace-purchase.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

appsController.appsListSubscriptionsForAuthenticatedUserStubbedAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "billing_cycle": "monthly",
    "next_billing_date": "2017-11-11T00:00:00Z",
    "unit_count": null,
    "on_free_trial": true,
    "free_trial_ends_on": "2017-11-11T00:00:00Z",
    "updated_at": "2017-11-02T01:12:12Z",
    "account": {
      "login": "github",
      "id": 4,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "email": null,
      "organization_billing_email": "billing@github.com",
      "type": "Organization"
    },
    "plan": {
      "url": "https://api.github.com/marketplace_listing/plans/1313",
      "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
      "id": 1313,
      "number": 3,
      "name": "Pro",
      "description": "A professional-grade CI solution",
      "monthly_price_in_cents": 1099,
      "yearly_price_in_cents": 11870,
      "price_model": "FLAT_RATE",
      "has_free_trial": true,
      "unit_name": null,
      "state": "published",
      "bullets": [
        "Up to 25 private repositories",
        "11 concurrent builds"
      ]
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMarketplacePurchasesStubbed401ErrorException`](../../doc/models/user-marketplace-purchases-stubbed-401-error-exception.md) |


# Apps Get-User-Installation

Enables an authenticated GitHub App to find the user’s installation information.

You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

API method documentation: [https://docs.github.com/rest/reference/apps#get-a-user-installation-for-the-authenticated-app](https://docs.github.com/rest/reference/apps#get-a-user-installation-for-the-authenticated-app)

```java
CompletableFuture<UsersInstallationResponse> appsGetUserInstallationAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`UsersInstallationResponse`](../../doc/models/users-installation-response.md)

## Example Usage

```java
String username = "username0";

appsController.appsGetUserInstallationAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "account": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "avatar_url": "https://github.com/images/error/hubot_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/orgs/github",
    "html_url": "https://github.com/github",
    "followers_url": "https://api.github.com/users/github/followers",
    "following_url": "https://api.github.com/users/github/following{/other_user}",
    "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/github/subscriptions",
    "organizations_url": "https://api.github.com/users/github/orgs",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "received_events_url": "https://api.github.com/users/github/received_events",
    "type": "Organization",
    "site_admin": false
  },
  "repository_selection": "all",
  "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
  "repositories_url": "https://api.github.com/installation/repositories",
  "html_url": "https://github.com/organizations/github/settings/installations/1",
  "app_id": 1,
  "target_id": 1,
  "target_type": "Organization",
  "permissions": {
    "checks": "write",
    "metadata": "read",
    "contents": "read"
  },
  "events": [
    "push",
    "pull_request"
  ],
  "created_at": "2018-02-09T20:51:14Z",
  "updated_at": "2018-02-09T20:51:14Z",
  "single_file_name": "config.yml",
  "has_multiple_single_files": true,
  "single_file_paths": [
    "config.yml",
    ".github/issue_TEMPLATE.md"
  ],
  "app_slug": "github-actions",
  "suspended_at": null,
  "suspended_by": null
}
```

