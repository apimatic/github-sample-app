
# Repos Milestones Milestone Number Request

## Structure

`ReposMilestonesMilestoneNumberRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | The title of the milestone. | String getTitle() | setTitle(String title) |
| `State` | [`State177Enum`](../../doc/models/state-177-enum.md) | Optional | - | State177Enum getState() | setState(State177Enum state) |
| `Description` | `String` | Optional | A description of the milestone. | String getDescription() | setDescription(String description) |
| `DueOn` | `LocalDateTime` | Optional | The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDueOn() | setDueOn(LocalDateTime dueOn) |

## Example (as JSON)

```json
{
  "title": null,
  "state": null,
  "description": null,
  "due_on": null
}
```

