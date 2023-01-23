
# Repos Issues Issue Number Request

## Structure

`ReposIssuesIssueNumberRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | [`ReposIssuesIssueNumberRequestTitle`]($m/ReposIssuesIssueNumberRequestTitle) | Optional | The title of the issue. | ReposIssuesIssueNumberRequestTitle getTitle() | setTitle(ReposIssuesIssueNumberRequestTitle title) |
| `Body` | `String` | Optional | The contents of the issue. | String getBody() | setBody(String body) |
| `Assignee` | `String` | Optional | Login for the user that this issue should be assigned to. **This field is deprecated.** | String getAssignee() | setAssignee(String assignee) |
| `State` | [`State175Enum`](../../doc/models/state-175-enum.md) | Optional | - | State175Enum getState() | setState(State175Enum state) |
| `StateReason` | `Object` | Optional | - | Object getStateReason() | setStateReason(Object stateReason) |
| `Milestone` | [`ReposIssuesIssueNumberRequestMilestone`]($m/ReposIssuesIssueNumberRequestMilestone) | Optional | - | ReposIssuesIssueNumberRequestMilestone getMilestone() | setMilestone(ReposIssuesIssueNumberRequestMilestone milestone) |
| `Labels` | [`List<ReposIssuesIssueNumberRequestLabels>`]($m/ReposIssuesIssueNumberRequestLabels) | Optional | Labels to associate with this issue. Pass one or more Labels to _replace_ the set of Labels on this Issue. Send an empty array (`[]`) to clear all Labels from the Issue. _NOTE: Only users with push access can set labels for issues. Labels are silently dropped otherwise._ | List<ReposIssuesIssueNumberRequestLabels> getLabels() | setLabels(List<ReposIssuesIssueNumberRequestLabels> labels) |
| `Assignees` | `List<String>` | Optional | Logins for Users to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this Issue. Send an empty array (`[]`) to clear all assignees from the Issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._ | List<String> getAssignees() | setAssignees(List<String> assignees) |

## Example (as JSON)

```json
{
  "title": null,
  "body": null,
  "assignee": null,
  "state": null,
  "state_reason": null,
  "milestone": null,
  "labels": null,
  "assignees": null
}
```

