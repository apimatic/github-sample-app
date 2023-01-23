
# Issue Search Result Item

Issue Search Result Item

## Structure

`IssueSearchResultItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `ActiveLockReason` | `String` | Optional | - | String getActiveLockReason() | setActiveLockReason(String activeLockReason) |
| `Assignees` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Optional | - | List<SimpleUser> getAssignees() | setAssignees(List<SimpleUser> assignees) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Labels` | [`List<Label9>`](../../doc/models/label-9.md) | Required | - | List<Label9> getLabels() | setLabels(List<Label9> labels) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `StateReason` | `String` | Optional | - | String getStateReason() | setStateReason(String stateReason) |
| `Assignee` | `Object` | Required | - | Object getAssignee() | setAssignee(Object assignee) |
| `Milestone` | `Object` | Required | - | Object getMilestone() | setMilestone(Object milestone) |
| `Comments` | `int` | Required | - | int getComments() | setComments(int comments) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `ClosedAt` | `LocalDateTime` | Required | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `TextMatches` | [`List<SearchResultTextMatch>`](../../doc/models/search-result-text-match.md) | Optional | - | List<SearchResultTextMatch> getTextMatches() | setTextMatches(List<SearchResultTextMatch> textMatches) |
| `PullRequest` | [`PullRequest1`](../../doc/models/pull-request-1.md) | Optional | - | PullRequest1 getPullRequest() | setPullRequest(PullRequest1 pullRequest) |
| `Body` | `String` | Optional | - | String getBody() | setBody(String body) |
| `Score` | `double` | Required | - | double getScore() | setScore(double score) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Draft` | `Boolean` | Optional | - | Boolean getDraft() | setDraft(Boolean draft) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |
| `TimelineUrl` | `String` | Optional | - | String getTimelineUrl() | setTimelineUrl(String timelineUrl) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |

## Example (as JSON)

```json
{
  "url": "url4",
  "repository_url": "repository_url0",
  "labels_url": "labels_url6",
  "comments_url": "comments_url4",
  "events_url": "events_url8",
  "html_url": "html_url0",
  "id": 112,
  "node_id": "node_id2",
  "number": 158,
  "title": "title4",
  "locked": false,
  "active_lock_reason": null,
  "assignees": null,
  "user": {
    "key1": "val1",
    "key2": "val2"
  },
  "labels": [
    {
      "id": null,
      "node_id": null,
      "url": null,
      "name": null,
      "color": null,
      "default": null,
      "description": null
    },
    {
      "id": null,
      "node_id": null,
      "url": null,
      "name": null,
      "color": null,
      "default": null,
      "description": null
    }
  ],
  "state": "state4",
  "state_reason": null,
  "assignee": {
    "key1": "val1",
    "key2": "val2"
  },
  "milestone": {
    "key1": "val1",
    "key2": "val2"
  },
  "comments": 182,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "closed_at": "2016-03-13T12:52:32.123Z",
  "text_matches": null,
  "pull_request": null,
  "body": null,
  "score": 147.4,
  "author_association": "COLLABORATOR",
  "draft": null,
  "repository": null,
  "body_html": null,
  "body_text": null,
  "timeline_url": null,
  "performed_via_github_app": null,
  "reactions": null
}
```

