
# Repos Milestones Response

## Structure

`ReposMilestonesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | The number of the milestone. | int getNumber() | setNumber(int number) |
| `State` | [`State1Enum`](../../doc/models/state-1-enum.md) | Required | - | State1Enum getState() | setState(State1Enum state) |
| `Title` | `String` | Required | The title of the milestone. | String getTitle() | setTitle(String title) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `OpenIssues` | `int` | Required | - | int getOpenIssues() | setOpenIssues(int openIssues) |
| `ClosedIssues` | `int` | Required | - | int getClosedIssues() | setClosedIssues(int closedIssues) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `ClosedAt` | `LocalDateTime` | Required | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `DueOn` | `LocalDateTime` | Required | - | LocalDateTime getDueOn() | setDueOn(LocalDateTime dueOn) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
  "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
  "id": 1002604,
  "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
  "number": 42,
  "state": null,
  "title": "v1.0",
  "description": "Tracking milestone for version 1.0",
  "creator": null,
  "open_issues": 4,
  "closed_issues": 8,
  "created_at": "04/10/2011 20:09:31",
  "updated_at": "03/03/2014 18:58:10",
  "closed_at": "02/12/2013 13:22:01",
  "due_on": "10/09/2012 23:39:01"
}
```

