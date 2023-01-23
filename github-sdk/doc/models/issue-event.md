
# Issue Event

Issue Event

## Structure

`IssueEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Actor` | `Object` | Required | - | Object getActor() | setActor(Object actor) |
| `Event` | `String` | Required | - | String getEvent() | setEvent(String event) |
| `CommitId` | `String` | Required | - | String getCommitId() | setCommitId(String commitId) |
| `CommitUrl` | `String` | Required | - | String getCommitUrl() | setCommitUrl(String commitUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Issue` | `Object` | Optional | - | Object getIssue() | setIssue(Object issue) |
| `Label` | [`Label22`](../../doc/models/label-22.md) | Optional | - | Label22 getLabel() | setLabel(Label22 label) |
| `Assignee` | `Object` | Optional | - | Object getAssignee() | setAssignee(Object assignee) |
| `Assigner` | `Object` | Optional | - | Object getAssigner() | setAssigner(Object assigner) |
| `ReviewRequester` | `Object` | Optional | - | Object getReviewRequester() | setReviewRequester(Object reviewRequester) |
| `RequestedReviewer` | `Object` | Optional | - | Object getRequestedReviewer() | setRequestedReviewer(Object requestedReviewer) |
| `RequestedTeam` | [`RequestedTeam`](../../doc/models/requested-team.md) | Optional | - | RequestedTeam getRequestedTeam() | setRequestedTeam(RequestedTeam requestedTeam) |
| `DismissedReview` | [`IssueEventDismissedReview`](../../doc/models/issue-event-dismissed-review.md) | Optional | - | IssueEventDismissedReview getDismissedReview() | setDismissedReview(IssueEventDismissedReview dismissedReview) |
| `Milestone` | [`Milestone1`](../../doc/models/milestone-1.md) | Optional | - | Milestone1 getMilestone() | setMilestone(Milestone1 milestone) |
| `ProjectCard` | [`ProjectCard1`](../../doc/models/project-card-1.md) | Optional | - | ProjectCard1 getProjectCard() | setProjectCard(ProjectCard1 projectCard) |
| `Rename` | [`Rename`](../../doc/models/rename.md) | Optional | - | Rename getRename() | setRename(Rename rename) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Optional | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `LockReason` | `String` | Optional | - | String getLockReason() | setLockReason(String lockReason) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |

## Example (as JSON)

```json
{
  "id": 1,
  "node_id": "MDEwOklzc3VlRXZlbnQx",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/events/1",
  "actor": null,
  "event": "closed",
  "commit_id": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "commit_url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "created_at": "04/14/2011 16:00:49"
}
```

