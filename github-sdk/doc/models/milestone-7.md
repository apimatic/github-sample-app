
# Milestone 7

## Structure

`Milestone7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ClosedAt` | `LocalDateTime` | Required | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `ClosedIssues` | `int` | Required | - | int getClosedIssues() | setClosedIssues(int closedIssues) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `DueOn` | `LocalDateTime` | Required | - | LocalDateTime getDueOn() | setDueOn(LocalDateTime dueOn) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | The number of the milestone. | int getNumber() | setNumber(int number) |
| `OpenIssues` | `int` | Required | - | int getOpenIssues() | setOpenIssues(int openIssues) |
| `State` | [`State1Enum`](../../doc/models/state-1-enum.md) | Required | - | State1Enum getState() | setState(State1Enum state) |
| `Title` | `String` | Required | The title of the milestone. | String getTitle() | setTitle(String title) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "closed_at": "2016-03-13T12:52:32.123Z",
  "closed_issues": 80,
  "created_at": "2016-03-13T12:52:32.123Z",
  "creator": {
    "key1": "val1",
    "key2": "val2"
  },
  "description": "description0",
  "due_on": "2016-03-13T12:52:32.123Z",
  "html_url": "html_url0",
  "id": 112,
  "labels_url": "labels_url6",
  "node_id": "node_id2",
  "number": 158,
  "open_issues": 56,
  "state": "open",
  "title": "title4",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4"
}
```

