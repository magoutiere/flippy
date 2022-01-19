package fr.flippy.flip;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@RedisHash("Flip")
public class FlipEntity {

    @Id
    private String id;

    @Indexed
    private String name;

    private boolean state;
}
