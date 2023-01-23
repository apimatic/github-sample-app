
# Issue 2

The [issue](https://docs.github.com/rest/reference/issues) the comment belongs to.

## Structure

`Issue2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ActiveLockReason` | `Object` | Required | - | Object getActiveLockReason() | setActiveLockReason(Object activeLockReason) |
| `Assignee` | `Object` | Required | - | Object getAssignee() | setAssignee(Object assignee) |
| `Assignees` | [`List<Issue2Assignees>`]($m/Issue2Assignees) | Required | - | List<Issue2Assignees> getAssignees() | setAssignees(List<Issue2Assignees> assignees) |
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
| `Labels` | [`List<Label10>`](../../doc/models/label-10.md) | Required | - | List<Label10> getLabels() | setLabels(List<Label10> labels) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `Milestone` | `Object` | Required | - | Object getMilestone() | setMilestone(Object milestone) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `PullRequest` | [`PullRequest7`](../../doc/models/pull-request-7.md) | Optional | - | PullRequest7 getPullRequest() | setPullRequest(PullRequest7 pullRequest) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Required | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `State` | [`State45Enum`](../../doc/models/state-45-enum.md) | Required | - | State45Enum getState() | setState(State45Enum state) |
| `StateReason` | `String` | Optional | - | String getStateReason() | setStateReason(String stateReason) |
| `TimelineUrl` | `String` | Optional | - | String getTimelineUrl() | setTimelineUrl(String timelineUrl) |
| `Title` | `String` | Required | Title of the issue | String getTitle() | setTitle(String title) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | URL for the issue | String getUrl() | setUrl(String url) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "active_lock_reason": {
    "key1": "val1",
    "key2": "val2"
  },
  "assignee": {
    "key1": "val1",
    "key2": "val2"
  },
  "assignees": [
    {
      "key0": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "key0": {
        "key1": "val1",
        "key2": "val2"
      },
      "key1": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "author_association": "COLLABORATOR",
  "body": "body6",
  "closed_at": "2016-03-13T12:52:32.123Z",
  "comments": 182,
  "comments_url": "comments_url4",
  "created_at": "2016-03-13T12:52:32.123Z",
  "draft": null,
  "events_url": "events_url8",
  "html_url": "html_url0",
  "id": 112,
  "labels": [
    {
      "color": "color2",
      "default": false,
      "description": "description6",
      "id": 46,
      "name": "name4",
      "node_id": "node_id8",
      "url": "url8"
    },
    {
      "color": "color1",
      "default": true,
      "description": "description5",
      "id": 47,
      "name": "name5",
      "node_id": "node_id7",
      "url": "url9"
    }
  ],
  "labels_url": "labels_url6",
  "locked": false,
  "milestone": {
    "key1": "val1",
    "key2": "val2"
  },
  "node_id": "node_id2",
  "number": 158,
  "performed_via_github_app": null,
  "pull_request": null,
  "reactions": {
    "url": "url2",
    "total_count": 212,
    "plus1": 166,
    "minus1": 110,
    "laugh": 254,
    "confused": 160,
    "heart": 50,
    "hooray": 92,
    "eyes": 178,
    "rocket": 102
  },
  "repository_url": "repository_url0",
  "state": "open",
  "state_reason": null,
  "timeline_url": null,
  "title": "title4",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

