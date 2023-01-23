
# Pull Requests 28

## Structure

`PullRequests28`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Base` | [`Base`](../../doc/models/base.md) | Required | - | Base getBase() | setBase(Base base) |
| `Head` | [`Head`](../../doc/models/head.md) | Required | - | Head getHead() | setHead(Head head) |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `Number` | `double` | Required | - | double getNumber() | setNumber(double number) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "base": {
    "ref": "ref6",
    "sha": "sha2",
    "repo": {
      "id": 172,
      "name": "name8",
      "url": "url2"
    }
  },
  "head": {
    "ref": "ref8",
    "sha": "sha4",
    "repo": {
      "id": 138,
      "name": "name6",
      "url": "url0"
    }
  },
  "id": 60.0,
  "number": 88.62,
  "url": "url4"
}
```

