package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StoreFactory {

	private Map<String, Store> storeMap = new HashMap<>();

	public Store getStore(final String name){
		if(storeMap.containsKey(name)){
			Store type = new Store(name);
			storeMap.put(name, type);
		}

		return storeMap.get(name);
	}
}
