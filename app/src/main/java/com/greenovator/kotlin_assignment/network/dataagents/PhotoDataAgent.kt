package com.greenovator.kotlin_assignment.network.dataagents

import com.greenovator.kotlin_assignment.data.vos.Movies

interface PhotoDataAgent {
    fun getEvents(
        accessToken: String,
        onSuccess:
            (List<Movies>) -> Unit,
        onFailure: (String) -> Unit
    )
}