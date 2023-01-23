
# Check Run 2

## Structure

`CheckRun2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CompletedAt` | `LocalDateTime` | Required | - | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `DetailsUrl` | `String` | Required | - | String getDetailsUrl() | setDetailsUrl(String detailsUrl) |
| `ExternalId` | `String` | Required | - | String getExternalId() | setExternalId(String externalId) |
| `HeadSha` | `String` | Required | The SHA of the commit that is being checked. | String getHeadSha() | setHeadSha(String headSha) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | The id of the check. | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the check run. | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `StartedAt` | `LocalDateTime` | Required | - | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `Status` | [`Status18Enum`](../../doc/models/status-18-enum.md) | Required | - | Status18Enum getStatus() | setStatus(Status18Enum status) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "completed_at": "2016-03-13T12:52:32.123Z",
  "conclusion": {
    "key1": "val1",
    "key2": "val2"
  },
  "details_url": "details_url0",
  "external_id": "external_id6",
  "head_sha": "head_sha6",
  "html_url": "html_url0",
  "id": 112,
  "name": "name0",
  "node_id": "node_id2",
  "started_at": "2016-03-13T12:52:32.123Z",
  "status": "waiting",
  "url": "url4"
}
```

