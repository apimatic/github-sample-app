
# Cvss 4

## Structure

`Cvss4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Score` | `double` | Required | The overall CVSS score of the advisory.<br>**Constraints**: `>= 0`, `<= 10` | double getScore() | setScore(double score) |
| `VectorString` | `String` | Required | The full CVSS vector string for the advisory. | String getVectorString() | setVectorString(String vectorString) |

## Example (as JSON)

```json
{
  "score": 147.4,
  "vector_string": "vector_string0"
}
```

