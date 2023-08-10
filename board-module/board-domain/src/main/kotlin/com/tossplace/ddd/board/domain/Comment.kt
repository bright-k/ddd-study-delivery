package com.tossplace.ddd.board.domain

import com.tossplace.ddd.shared.domain.AggregateRoot
import java.time.Instant

class Comment(
    id: Long = 0,
    authorId: Long,
    boardId: Long,
    parentCommentId: Long? = null,
    contents: String,
    createdAt: Instant = Instant.now(),
    updatedAt: Instant = createdAt,
) : AggregateRoot() {
    var id: Long = id
        private set

    var authorId: Long = authorId
        private set

    var boardId: Long = boardId
        private set

    var parentCommentId: Long? = parentCommentId
        private set

    var contents: String = contents
        private set

    var createdAt: Instant = createdAt
        private set

    var updatedAt: Instant = updatedAt
        private set
}
