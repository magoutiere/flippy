package fr.flippy.toggle;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Toggle")
public class ToggleEntity {

    @Id
    private String id;

    private String name;

    private boolean state;
}
