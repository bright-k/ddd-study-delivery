package com.tossplace.ddd.board.domain

import com.tossplace.ddd.shared.domain.AggregateRoot
import java.time.Instant

class Board(
    id: Long = 0,
    authorId: Long,
    title: String,
    contents: String,
    thumbnailImage: ThumbnailImage,
    createdAt: Instant = Instant.now(),
    updatedAt: Instant = createdAt,
) : AggregateRoot() {
    var id: Long = id
        private set

    var authorId: Long = authorId
        private set

    var title: String = title
        private set

    var contents: String = contents
        private set

    var thumbnailImage: ThumbnailImage = thumbnailImage
        private set

    var createdAt: Instant = createdAt
        private set

    var updatedAt: Instant = updatedAt
        private set
}
