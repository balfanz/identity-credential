package org.multipaz.securearea

import kotlinx.serialization.json.JsonObject

/**
 * Result of a [SecureArea.batchCreateKey] call.
 *
 * @property keyInfos a list [KeyInfo], one for each of the created keys.
 * @property openid4vciKeyAttestation an attestation over all the keys according to
 *   [OpenID4VCI Key Attestation](https://openid.github.io/OpenID4VCI/openid-4-verifiable-credential-issuance-wg-draft.html#name-key-attestation-in-jwt-form)
 *   or `null` if the implementation doesn't provide such an attestation or wasn't requested.
 */
data class BatchCreateKeyResult(
    val keyInfos: List<KeyInfo>,
    val openid4vciKeyAttestation: JsonObject?,
)
