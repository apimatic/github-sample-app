
# Repos Issues Issue Number Assignees Request

## Structure

`ReposIssuesIssueNumberAssigneesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Assignees` | `List<String>` | Optional | Usernames of people to assign this issue to. _NOTE: Only users with push access can add assignees to an issue. Assignees are silently ignored otherwise._ | List<String> getAssignees() | setAssignees(List<String> assignees) |

## Example (as JSON)

```json
{
  "assignees": null
}
```

