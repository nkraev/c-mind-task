package kitttn.cmindtesttask.model

/**
 * @author kitttn
 */

data class SourceEntity(val id: String, val name: String, val url: String, val description: String)

data class SourcesResp(val status: String, val sources: List<SourceEntity>)