package io.ideas.engineering.ioc.persistence;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
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

    private final List<String> blacklist = Arrays.asList("Arsch", "Dummkopf");

    /**
     * @throws NullPointerException on null key
     */
    public Optional<String> findValue(String key) {
        return Optional.ofNullable(store.get(key));
    }

    /**
     * @throws NullPointerException on null key
     * @throws IllegalArgumentException on blacklisted words
     */
    public void saveValue(String key, String value) {
        if (blacklist.contains(value)) {
            throw new IllegalArgumentException("Blacklisted!");
        }
        this.store.put(key, value);
    }

    /**
     * @throws NullPointerException on null key
     */
    public boolean deleteValue(String key) {
        return store.remove(key) != null;
    }

}
