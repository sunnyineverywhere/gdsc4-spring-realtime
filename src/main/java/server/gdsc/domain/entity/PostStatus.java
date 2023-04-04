package server.gdsc.domain.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PostStatus {
    CREATED,
    MODIFIED,
    DELETED,
    RECOVER
}
