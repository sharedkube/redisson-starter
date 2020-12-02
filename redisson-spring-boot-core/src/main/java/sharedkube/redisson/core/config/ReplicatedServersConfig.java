package sharedkube.redisson.core.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplicatedServersConfig extends BaseMasterSlaveServersConfig {

    /**
     * Replication group node urls list
     */
    private String[] nodeAddresses = {};

    /**
     * Replication group scan interval in milliseconds, default 1000 ms
     */
    private int scanInterval = 1000;

    /**
     * Database index used for Redis connection
     */
    private int database = 0;
}