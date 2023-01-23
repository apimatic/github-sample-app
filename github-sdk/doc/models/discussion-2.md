
# Discussion 2

## Structure

`Discussion2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ActiveLockReason` | `String` | Required | - | String getActiveLockReason() | setActiveLockReason(String activeLockReason) |
| `AnswerChosenAt` | `String` | Required | - | String getAnswerChosenAt() | setAnswerChosenAt(String answerChosenAt) |
| `AnswerChosenBy` | `Object` | Required | - | Object getAnswerChosenBy() | setAnswerChosenBy(Object answerChosenBy) |
| `AnswerHtmlUrl` | `String` | Required | - | String getAnswerHtmlUrl() | setAnswerHtmlUrl(String answerHtmlUrl) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Category` | [`Category2`](../../doc/models/category-2.md) | Required | - | Category2 getCategory() | setCategory(Category2 category) |
| `Comments` | `int` | Required | - | int getComments() | setComments(int comments) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `State` | [`State27Enum`](../../doc/models/state-27-enum.md) | Required | - | State27Enum getState() | setState(State27Enum state) |
| `TimelineUrl` | `String` | Optional | - | String getTimelineUrl() | setTimelineUrl(String timelineUrl) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "active_lock_reason": "active_lock_reason8",
  "answer_chosen_at": "answer_chosen_at8",
  "answer_chosen_by": {
    "key1": "val1",
    "key2": "val2"
  },
  "answer_html_url": "answer_html_url4",
  "author_association": "COLLABORATOR",
  "body": "body6",
  "category": {
    "created_at": "2016-03-13T12:52:32.123Z",
    "description": "description8",
    "emoji": "emoji4",
    "id": 232,
    "is_answerable": false,
    "name": "name2",
    "node_id": null,
    "repository_id": 134,
    "slug": "slug4",
    "updated_at": "updated_at2"
  },
  "comments": 182,
  "created_at": "2016-03-13T12:52:32.123Z",
  "html_url": "html_url0",
  "id": 112,
  "locked": false,
  "node_id": "node_id2",
  "number": 158,
  "reactions": null,
  "repository_url": "repository_url0",
  "state": "open",
  "timeline_url": null,
  "title": "title4",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

