
# Repos Issues Request

## Structure

`ReposIssuesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | [`ReposIssuesRequestTitle`]($m/ReposIssuesRequestTitle) | Required | The title of the issue. | ReposIssuesRequestTitle getTitle() | setTitle(ReposIssuesRequestTitle title) |
| `Body` | `String` | Optional | The contents of the issue. | String getBody() | setBody(String body) |
| `Assignee` | `String` | Optional | Login for the user that this issue should be assigned to. _NOTE: Only users with push access can set the assignee for new issues. The assignee is silently dropped otherwise. **This field is deprecated.**_ | String getAssignee() | setAssignee(String assignee) |
| `Milestone` | [`ReposIssuesRequestMilestone`]($m/ReposIssuesRequestMilestone) | Optional | - | ReposIssuesRequestMilestone getMilestone() | setMilestone(ReposIssuesRequestMilestone milestone) |
| `Labels` | [`List<ReposIssuesRequestLabels>`]($m/ReposIssuesRequestLabels) | Optional | Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are silently dropped otherwise._ | List<ReposIssuesRequestLabels> getLabels() | setLabels(List<ReposIssuesRequestLabels> labels) |
| `Assignees` | `List<String>` | Optional | Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._ | List<String> getAssignees() | setAssignees(List<String> assignees) |

## Example (as JSON)

```json
{
  "title": "String5",
  "body": null,
  "assignee": null,
  "milestone": null,
  "labels": null,
  "assignees": null
}
```

