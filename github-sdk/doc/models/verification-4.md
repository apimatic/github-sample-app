
# Verification 4

## Structure

`Verification4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payload` | `String` | Required | - | String getPayload() | setPayload(String payload) |
| `Reason` | [`ReasonEnum`](../../doc/models/reason-enum.md) | Required | - | ReasonEnum getReason() | setReason(ReasonEnum reason) |
| `Signature` | `String` | Required | - | String getSignature() | setSignature(String signature) |
| `Verified` | `boolean` | Required | - | boolean getVerified() | setVerified(boolean verified) |

## Example (as JSON)

```json
{
  "payload": "payload6",
  "reason": "unsigned",
  "signature": "signature8",
  "verified": false
}
```

