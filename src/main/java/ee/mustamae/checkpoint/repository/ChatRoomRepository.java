package ee.mustamae.checkpoint.repository;

import ee.mustamae.checkpoint.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
}