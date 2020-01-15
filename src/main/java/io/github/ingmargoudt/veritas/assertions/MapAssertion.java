package io.github.ingmargoudt.veritas.assertions;

import java.util.Map;

public class MapAssertion<K,V> extends AbstractAssertion<MapAssertion<K,V>, Map<K,V>> {
    public MapAssertion(Map<K,V> actual) {
        super(actual);
    }

    public MapAssertion containsKey(K key) {
        return test(actual -> actual.containsKey(key),"Key %s not found in the map",key);
    }

    public MapAssertion isEmpty(){
        return test(Map::isEmpty, "Map is expected to be empty");
    }

    public MapAssertion containsValue(V value) {
        return test(actual -> actual.containsValue(value),"Value %s not found in the map",value);
    }
}