package com.tossplace.ddd.board.domain

class Author(
    id: Long,
    name: String,
    nickname: String,
    profileImageUrl: String,
) {
    var id: Long = id
        private set

    var name: String = name
        private set

    var nickname: String = nickname
        private set

    var profileImageUrl: String = profileImageUrl
        private set
}