
# Plan 1

## Structure

`Plan1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Space` | `int` | Required | - | int getSpace() | setSpace(int space) |
| `PrivateRepos` | `int` | Required | - | int getPrivateRepos() | setPrivateRepos(int privateRepos) |
| `FilledSeats` | `Integer` | Optional | - | Integer getFilledSeats() | setFilledSeats(Integer filledSeats) |
| `Seats` | `Integer` | Optional | - | Integer getSeats() | setSeats(Integer seats) |

## Example (as JSON)

```json
{
  "name": "name0",
  "space": 254,
  "private_repos": 48,
  "filled_seats": null,
  "seats": null
}
```

