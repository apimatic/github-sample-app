
# Repos Hooks Hook Id Deliveries Delivery Id Response

## Structure

`ReposHooksHookIdDeliveriesDeliveryIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the delivery. | int getId() | setId(int id) |
| `Guid` | `String` | Required | Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event). | String getGuid() | setGuid(String guid) |
| `DeliveredAt` | `LocalDateTime` | Required | Time when the delivery was delivered. | LocalDateTime getDeliveredAt() | setDeliveredAt(LocalDateTime deliveredAt) |
| `Redelivery` | `boolean` | Required | Whether the delivery is a redelivery. | boolean getRedelivery() | setRedelivery(boolean redelivery) |
| `Duration` | `double` | Required | Time spent delivering. | double getDuration() | setDuration(double duration) |
| `Status` | `String` | Required | Description of the status of the attempted delivery | String getStatus() | setStatus(String status) |
| `StatusCode` | `int` | Required | Status code received when delivery was made. | int getStatusCode() | setStatusCode(int statusCode) |
| `Event` | `String` | Required | The event that triggered the delivery. | String getEvent() | setEvent(String event) |
| `Action` | `String` | Required | The type of activity for the event that triggered the delivery. | String getAction() | setAction(String action) |
| `InstallationId` | `Integer` | Required | The id of the GitHub App installation associated with this event. | Integer getInstallationId() | setInstallationId(Integer installationId) |
| `RepositoryId` | `Integer` | Required | The id of the repository associated with this event. | Integer getRepositoryId() | setRepositoryId(Integer repositoryId) |
| `Url` | `String` | Optional | The URL target of the delivery. | String getUrl() | setUrl(String url) |
| `Request` | [`Request`](../../doc/models/request.md) | Required | - | Request getRequest() | setRequest(Request request) |
| `Response` | [`Response`](../../doc/models/response.md) | Required | - | Response getResponse() | setResponse(Response response) |

## Example (as JSON)

```json
{
  "id": 42,
  "guid": "58474f00-b361-11eb-836d-0e4f3503ccbe",
  "delivered_at": "05/12/2021 20:33:44",
  "redelivery": false,
  "duration": 0.03,
  "status": "failed to connect",
  "status_code": 502,
  "event": "issues",
  "action": "opened",
  "installation_id": 123,
  "repository_id": 123,
  "request": null,
  "response": null
}
```

