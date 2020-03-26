package io.ideas.engineering.ioc.persistence;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This is a heavy lifting datastore with highly secured authorisation rules and network security in place.
 * Creation of data schemes is handled automatically but it takes about 5 minutes.
 * Memory footprint is ludicrous (> 2gb) better use singleton pattern.
 * 
 * No connectivity from your grandma's desktop PC!
 */
@Repository
public class Datastore {

    private final Map<String, String> store = new ConcurrentHashMap<>();

    /**
     * @throws NullPointerException on null key
     */
    public Optional<String> findValue(String key) {
        return Optional.ofNullable(store.get(key));
    }

    /**
     * @throws NullPointerException on null key
     */
    public Optional<String> saveValue(String key, String value) {
        return Optional.ofNullable(this.store.put(key, value));
    }

    /**
     * @throws NullPointerException on null key
     */
    public boolean deleteValue(String key) {
        return store.remove(key) != null;
    }

}
