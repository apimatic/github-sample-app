
# Issue 11

## Structure

`Issue11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ActiveLockReason` | `Object` | Required | - | Object getActiveLockReason() | setActiveLockReason(Object activeLockReason) |
| `Assignee` | `Object` | Optional | - | Object getAssignee() | setAssignee(Object assignee) |
| `Assignees` | [`List<Issue11Assignees>`]($m/Issue11Assignees) | Required | - | List<Issue11Assignees> getAssignees() | setAssignees(List<Issue11Assignees> assignees) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | Contents of the issue | String getBody() | setBody(String body) |
| `ClosedAt` | `LocalDateTime` | Required | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `Comments` | `int` | Required | - | int getComments() | setComments(int comments) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Draft` | `Boolean` | Optional | - | Boolean getDraft() | setDraft(Boolean draft) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Labels` | [`List<Label10>`](../../doc/models/label-10.md) | Optional | - | List<Label10> getLabels() | setLabels(List<Label10> labels) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `Locked` | `String` | Required, Constant | **Default**: `"True"` | String getLocked() | setLocked(String locked) |
| `Milestone` | `Object` | Required | - | Object getMilestone() | setMilestone(Object milestone) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `PullRequest` | [`PullRequest7`](../../doc/models/pull-request-7.md) | Optional | - | PullRequest7 getPullRequest() | setPullRequest(PullRequest7 pullRequest) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Required | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `State` | [`State45Enum`](../../doc/models/state-45-enum.md) | Optional | - | State45Enum getState() | setState(State45Enum state) |
| `StateReason` | `String` | Optional | - | String getStateReason() | setStateReason(String stateReason) |
| `TimelineUrl` | `String` | Optional | - | String getTimelineUrl() | setTimelineUrl(String timelineUrl) |
| `Title` | `String` | Required | Title of the issue | String getTitle() | setTitle(String title) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | URL for the issue | String getUrl() | setUrl(String url) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "active_lock_reason": null,
  "assignees": null,
  "author_association": null,
  "body": null,
  "closed_at": null,
  "comments": null,
  "comments_url": null,
  "created_at": null,
  "events_url": null,
  "html_url": null,
  "id": null,
  "labels_url": null,
  "locked": "True",
  "milestone": null,
  "node_id": null,
  "number": null,
  "reactions": null,
  "repository_url": null,
  "title": null,
  "updated_at": null,
  "url": null,
  "user": null
}
```

