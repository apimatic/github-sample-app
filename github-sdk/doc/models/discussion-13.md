
# Discussion 13

## Structure

`Discussion13`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ActiveLockReason` | `String` | Required | - | String getActiveLockReason() | setActiveLockReason(String activeLockReason) |
| `AnswerChosenAt` | `String` | Required | - | String getAnswerChosenAt() | setAnswerChosenAt(String answerChosenAt) |
| `AnswerChosenBy` | `Object` | Required | - | Object getAnswerChosenBy() | setAnswerChosenBy(Object answerChosenBy) |
| `AnswerHtmlUrl` | `String` | Required | - | String getAnswerHtmlUrl() | setAnswerHtmlUrl(String answerHtmlUrl) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Category` | [`Category`](../../doc/models/category.md) | Required | - | Category getCategory() | setCategory(Category category) |
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
  "active_lock_reason": null,
  "answer_chosen_at": null,
  "answer_chosen_by": null,
  "answer_html_url": null,
  "author_association": null,
  "body": null,
  "category": {
    "created_at": null,
    "description": null,
    "emoji": null,
    "id": null,
    "is_answerable": "True",
    "name": null,
    "repository_id": null,
    "slug": null,
    "updated_at": null
  },
  "comments": null,
  "created_at": null,
  "html_url": null,
  "id": null,
  "locked": null,
  "node_id": null,
  "number": null,
  "repository_url": null,
  "state": null,
  "title": null,
  "updated_at": null,
  "user": null
}
```

