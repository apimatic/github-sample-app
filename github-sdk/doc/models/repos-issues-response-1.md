
# Repos Issues Response 1

## Structure

`ReposIssuesResponse1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | URL for the issue | String getUrl() | setUrl(String url) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Number` | `int` | Required | Number uniquely identifying the issue within its repository | int getNumber() | setNumber(int number) |
| `State` | `String` | Required | State of the issue; either 'open' or 'closed' | String getState() | setState(String state) |
| `StateReason` | `Object` | Optional | - | Object getStateReason() | setStateReason(Object stateReason) |
| `Title` | `String` | Required | Title of the issue | String getTitle() | setTitle(String title) |
| `Body` | `String` | Optional | Contents of the issue | String getBody() | setBody(String body) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Labels` | [`List<ReposIssuesResponse1Labels>`]($m/ReposIssuesResponse1Labels) | Required | Labels to associate with this issue; pass one or more label names to replace the set of labels on this issue; send an empty array to clear all labels from the issue; note that the labels are silently dropped for users without push access to the repository | List<ReposIssuesResponse1Labels> getLabels() | setLabels(List<ReposIssuesResponse1Labels> labels) |
| `Assignee` | `Object` | Required | - | Object getAssignee() | setAssignee(Object assignee) |
| `Assignees` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Optional | - | List<SimpleUser> getAssignees() | setAssignees(List<SimpleUser> assignees) |
| `Milestone` | `Object` | Required | - | Object getMilestone() | setMilestone(Object milestone) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `ActiveLockReason` | `String` | Optional | - | String getActiveLockReason() | setActiveLockReason(String activeLockReason) |
| `Comments` | `int` | Required | - | int getComments() | setComments(int comments) |
| `PullRequest` | [`PullRequest1`](../../doc/models/pull-request-1.md) | Optional | - | PullRequest1 getPullRequest() | setPullRequest(PullRequest1 pullRequest) |
| `ClosedAt` | `LocalDateTime` | Required | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Draft` | `Boolean` | Optional | - | Boolean getDraft() | setDraft(Boolean draft) |
| `ClosedBy` | `Object` | Optional | - | Object getClosedBy() | setClosedBy(Object closedBy) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |
| `TimelineUrl` | `String` | Optional | - | String getTimelineUrl() | setTimelineUrl(String timelineUrl) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |

## Example (as JSON)

```json
{
  "id": null,
  "node_id": null,
  "url": "https://api.github.com/repositories/42/issues/1",
  "repository_url": null,
  "labels_url": null,
  "comments_url": null,
  "events_url": null,
  "html_url": null,
  "number": 42,
  "state": "open",
  "title": "Widget creation fails in Safari on OS X 10.8",
  "user": null,
  "labels": [
    "bug",
    "registration"
  ],
  "assignee": null,
  "milestone": null,
  "locked": null,
  "comments": null,
  "closed_at": null,
  "created_at": null,
  "updated_at": null,
  "author_association": null
}
```

