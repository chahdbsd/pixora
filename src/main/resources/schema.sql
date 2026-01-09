CREATE TABLE albums (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        owner_user_id BIGINT,
                        titre VARCHAR(255),
                        created_at TIMESTAMP
);

CREATE TABLE photos (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        album_id BIGINT,
                        uploader_user_id BIGINT,
                        url VARCHAR(255),
                        uploaded_at TIMESTAMP
);
