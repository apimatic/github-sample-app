
# Repos Issues Issue Number Assignees Request 1

## Structure

`ReposIssuesIssueNumberAssigneesRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Assignees` | `List<String>` | Optional | Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove assignees from an issue. Assignees are silently ignored otherwise._ | List<String> getAssignees() | setAssignees(List<String> assignees) |

## Example (as JSON)

```json
{
  "assignees": null
}
```

