package io.github.ingmargoudt.veritas.assertions;

import java.util.Collection;
import java.util.Map;

public class MapAssertion<K,V> extends AbstractAssertion<MapAssertion<K,V>, Map<K,V>> {
    public MapAssertion(Map<K,V> actual) {
        super(actual);
    }

    public <K> MapAssertion containsKey(K key) {
        return test(actual -> actual.containsKey(key),"Key %s not found in the map",key);
    }
}